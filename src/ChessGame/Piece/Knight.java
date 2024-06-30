package src.ChessGame.Piece;

import src.ChessGame.Color;

public class Knight extends Piece{

    public Knight(int row, int col, Color color){
        super(row,col,color);
    }

    @Override
    public boolean canMove(int source, int destination) {
        return false;
    }
}
