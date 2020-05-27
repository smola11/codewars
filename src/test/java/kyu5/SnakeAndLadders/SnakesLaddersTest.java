package kyu5.SnakeAndLadders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakesLaddersTest {

    @Test
    public void test1() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 25", game.play(1, 1));
    }

    @Test
    public void test2WinGame() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 67", game.play(3, 4));
        assertEquals("Player 2 is on square 34", game.play(1, 2));
        assertEquals("Player 1 is on square 91", game.play(2, 2));
        assertEquals("Player 1 Wins!", game.play(5, 4));
    }

    @Test
    public void test3GameOver() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 67", game.play(3, 4));
        assertEquals("Player 2 is on square 34", game.play(1, 2));
        assertEquals("Player 1 is on square 91", game.play(2, 2));
        assertEquals("Player 1 Wins!", game.play(5, 4));
        assertEquals("Game over!", game.play(5, 4));
    }

    @Test
    public void test3BounceBack() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 67", game.play(3, 4));
        assertEquals("Player 2 is on square 34", game.play(1, 2));
        assertEquals("Player 1 is on square 91", game.play(2, 2));
        assertEquals("Player 1 is on square 98", game.play(5, 6));
    }

    @Test
    public void test3BounceBackToSnake() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 67", game.play(3, 4));
        assertEquals("Player 2 is on square 34", game.play(1, 2));
        assertEquals("Player 1 is on square 91", game.play(2, 2));
        assertEquals("Player 1 is on square 98", game.play(2, 5));
        assertEquals("Player 2 is on square 37", game.play(1, 2));

        assertEquals("Player 1 is on square 75", game.play(4, 3));
    }

}