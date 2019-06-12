package kyu5;

import java.util.Stack;

public class DirectionsReduction {

    public static String[] dirReduc(String[] arr) {

        String SOUTH = "SOUTH";
        String NORTH = "NORTH";
        String EAST = "EAST";
        String WEST = "WEST";

        Stack<String> directions = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!directions.isEmpty()) {
                String lastDirection = directions.peek();
                if (arr[i].equals(SOUTH) && lastDirection.equals(NORTH)) {
                    directions.pop();
                } else if (arr[i].equals(NORTH) && lastDirection.equals(SOUTH)) {
                    directions.pop();
                } else if (arr[i].equals(WEST) && lastDirection.equals(EAST)) {
                    directions.pop();
                } else if (arr[i].equals(EAST) && lastDirection.equals(WEST)) {
                    directions.pop();
                } else {
                    directions.push(arr[i]);
                }
            } else {
                directions.push(arr[i]);
            }
        }
        System.out.println(directions);
        return directions.toArray(new String[directions.size()]);
    }

}
