package kyu5.SnakeAndLadders;

public class Ladder extends LadderOrSnake {


    protected Ladder(int finalPosition) {
        super(finalPosition);
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "topPosition=" + getFinalPosition() +
                '}';
    }
}
