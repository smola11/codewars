package kyu5.SnakeAndLadders;

public class Snake extends LadderOrSnake {

    protected Snake(int finalPosition) {
        super(finalPosition);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "downPosition=" + getFinalPosition() +
                '}';
    }
}
