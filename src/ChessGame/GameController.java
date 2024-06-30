package src.ChessGame;

import src.ChessGame.Piece.Piece;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {
        Player white = new Player(Color.WHITE);
        Player black = new Player(Color.BLACK);

        Game game = new Game();
        game.currentPlayer = 0;
        game.players[0] = white;
        game.players[1] = black;
        game.StartGame();
    }


}
