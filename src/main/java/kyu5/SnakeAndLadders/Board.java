package kyu5.SnakeAndLadders;

public class Board {

    private final Cell[] cells;

    public Board(int boardSize) {
        cells = new Cell[boardSize];
        for (int i = 0; i < boardSize; i++) {
            cells[i] = new Cell();
        }
        initializeLadders();
        initializeSnakes();
    }

    private void initializeSnakes() {
        cells[16].setLadderOrSnake(new Snake(6));
        cells[46].setLadderOrSnake(new Snake(25));
        cells[49].setLadderOrSnake(new Snake(11));
        cells[62].setLadderOrSnake(new Snake(19));
        cells[64].setLadderOrSnake(new Snake(60));
        cells[74].setLadderOrSnake(new Snake(53));
        cells[89].setLadderOrSnake(new Snake(68));
        cells[92].setLadderOrSnake(new Snake(88));
        cells[95].setLadderOrSnake(new Snake(75));
        cells[99].setLadderOrSnake(new Snake(80));
    }

    private void initializeLadders() {
        cells[2].setLadderOrSnake(new Ladder(38));
        cells[7].setLadderOrSnake(new Ladder(14));
        cells[8].setLadderOrSnake(new Ladder(31));
        cells[15].setLadderOrSnake(new Ladder(26));
        cells[21].setLadderOrSnake(new Ladder(42));
        cells[28].setLadderOrSnake(new Ladder(84));
        cells[36].setLadderOrSnake(new Ladder(44));
        cells[51].setLadderOrSnake(new Ladder(67));
        cells[71].setLadderOrSnake(new Ladder(91));
        cells[78].setLadderOrSnake(new Ladder(98));
        cells[87].setLadderOrSnake(new Ladder(94));
    }

    public Cell[] getCells() {
        return cells;
    }
}


