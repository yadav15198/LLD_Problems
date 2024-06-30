package src.ChessGame.Piece;

import src.ChessGame.Color;

public class Rook extends Piece{

    public Rook(int row, int col, Color color){
        super(row,col,color);
    }

    @Override
    public boolean canMove(int source, int destination) {
        return false;
    }
}
