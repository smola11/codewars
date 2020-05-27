package kyu5.SnakeAndLadders;

public class Player {

    private final String name;
    private int position = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
}
