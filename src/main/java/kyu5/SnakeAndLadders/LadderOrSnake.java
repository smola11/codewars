package kyu5.SnakeAndLadders;

public abstract class LadderOrSnake {

    private final int finalPosition;

    protected LadderOrSnake(int finalPosition) {
        this.finalPosition = finalPosition;
    }

    public int getFinalPosition() {
        return finalPosition;
    }
}
