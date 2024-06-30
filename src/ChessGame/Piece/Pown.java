package src.ChessGame.Piece;

import src.ChessGame.Color;

public class Pown extends Piece{

    public Pown(int row, int col, Color color){
        super(row,col,color);
    }
    @Override
    public boolean canMove(int source, int destination) {
        return false;
    }
}
