package kyu5.SnakeAndLadders;

public class Cell {

    private LadderOrSnake ladderOrSnake = null;

    public LadderOrSnake getLadderOrSnake() {
        return ladderOrSnake;
    }

    public void setLadderOrSnake(LadderOrSnake ladderOrSnake) {
        this.ladderOrSnake = ladderOrSnake;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "ladderOrSnake=" + ladderOrSnake +
                '}';
    }
}
