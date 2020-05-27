package kyu5.SnakeAndLadders;

public class SnakesLadders {

    private final static String GAME_OVER = "Game over!";
    private final static int BOARD_SIZE_100 = 100;

    private final Board board = new Board(101);
    private final Player player1 = new Player("Player 1");
    private final Player player2 = new Player("Player 2");

    // Player 1 starts
    private Player currentPlayer = player1;
    private boolean gameFinished = false;

    public SnakesLadders() {
    }

    public String play(int die1, int die2) {
        if (gameFinished) return GAME_OVER;
        int score = die1 + die2;

        currentPlayer.setPosition(currentPlayer.getPosition() + score);
        bounceBackIfNeeded();

        int currentCellIndex = currentPlayer.getPosition();
        Cell currentCell = board.getCells()[currentCellIndex];
        if (currentCell.getLadderOrSnake() != null) {
            currentPlayer.setPosition(currentCell.getLadderOrSnake().getFinalPosition());
        }

        if (playerWins()) return currentPlayer.getName() + " Wins!";

        String response = currentPlayer.getName() + " is on square " + currentPlayer.getPosition();

        if (die1 != die2) {
            if (currentPlayer.getName().equals("Player 1")) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        return response;
    }

    private void bounceBackIfNeeded() {
        if (currentPlayer.getPosition() > BOARD_SIZE_100) {
            int over100 = currentPlayer.getPosition() - BOARD_SIZE_100;
            currentPlayer.setPosition(BOARD_SIZE_100 - over100);
        }
    }

    private boolean playerWins() {
        if (currentPlayer.getPosition() == BOARD_SIZE_100) {
            gameFinished = true;
            return true;
        }
        return false;
    }
}


