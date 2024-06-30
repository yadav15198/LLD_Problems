package src.ChessGame.Piece;

import src.ChessGame.Color;

public abstract class Piece {
    int row;
    int col;
    Color color;

    public Piece(int row,int col,Color color){
        this.row = row;
        this.col = col;
        this.color = color;
    }
    public abstract boolean canMove(int source, int destination);
    public Color getColor(){
        return this.color;
    }


}
