package src.ChessGame;

import src.ChessGame.Piece.Piece;

import java.util.Scanner;

public class Game {

    Board board;
    Player[] players = new Player[2];
    int currentPlayer;

    public void StartGame(){
        board.intialize();
        while(!isGameOver()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter src row");
            int srcrow = scanner.nextInt();
            System.out.println("Enter src col");
            int srccol = scanner.nextInt();
            System.out.println("Enter dest row");
            int destrow = scanner.nextInt();
            System.out.println("Enter dest col");
            int destcol = scanner.nextInt();
            Piece piece = board.getPieces(srcrow,destcol);
            boolean valid_input = board.isValidMove(piece,destrow,destcol);

            if(!valid_input){
                throw new InvalidMoveException("invalid move");
            }
            if(board.getPieces(destrow,destcol) != null){
                board.setPiece(null,destrow,destcol);
            }
            board.setPiece(null,srcrow,srccol);
            board.setPiece(piece,destrow,destcol);

        }
    }

    public boolean isGameOver(){
        //todo
        return board.isCheckmate();
    }
}
