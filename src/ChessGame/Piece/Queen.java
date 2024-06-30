package src.ChessGame.Piece;

import src.ChessGame.Color;

public class Queen extends Piece{

    public Queen(int row, int col, Color color){
        super(row,col,color);
    }
    @Override
    public boolean canMove(int source, int destination) {
        return false;
    }
}
