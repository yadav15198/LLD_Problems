package src.ChessGame.Piece;

import src.ChessGame.Color;

public class King extends Piece{

    public King(int row, int col, Color color){
        super(row,col,color);
    }

    @Override
    public boolean canMove(int source, int destination) {
        return false;
    }
}
