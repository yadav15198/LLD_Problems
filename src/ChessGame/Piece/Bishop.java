package src.ChessGame.Piece;

import src.ChessGame.Color;

public class Bishop extends Piece {

    public Bishop(int row, int col, Color color){
        super(row,col,color);
    }

    @Override
    public boolean canMove(int source, int destination) {
        int r = this.row;
        int c = this.col;
        return false;

    }
}
