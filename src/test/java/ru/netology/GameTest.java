package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void testFirstPlayerWin() {
        Player Petya = new Player("Petya", 1, 50);
        Player Kolya = new Player("Kolya", 2, 30);
        Game game = new Game();

        game.register(Petya);
        game.register(Kolya);
        int actual = game.round("Petya", "Kolya");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecondPlayerWin() {
        Player Petya = new Player("Petya", 1, 50);
        Player Kolya = new Player("Kolya", 2, 60);
        Game game = new Game();

        game.register(Petya);
        game.register(Kolya);
        int actual = game.round("Petya", "Kolya");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBothPlayersWin() {
        Player Petya = new Player("Petya", 1, 60);
        Player Kolya = new Player("Kolya", 2, 60);
        Game game = new Game();

        game.register(Petya);
        game.register(Kolya);
        int actual = game.round("Petya", "Kolya");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotRegisteredPlayer() {
        Player Vasya = new Player("Vasya", 3, 70);
        Player Kolya = new Player("Kolya", 2, 60);
        Game game = new Game();

        game.register(Vasya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Vasya", "Kolya")
        );
    }

    @Test
    public void testNotRegisteredPlayer2() {
        Player Vasya = new Player("Vasya", 3, 70);
        Player Kolya = new Player("Kolya", 2, 60);
        Game game = new Game();

        game.register(Vasya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Kolya", "Vasya")
        );
    }
}
