package src.ChessGame;

import src.ChessGame.Piece.*;

public class Board {

    Piece[][] mat = new Piece[8][8];

    public void intialize(){

        // place white pieces
        mat[0][0] = new Rook(0,0,Color.WHITE);
        mat[0][1] = new Knight(0,1,Color.WHITE);
        mat[0][2] = new Bishop(0,2,Color.WHITE);
        mat[0][3] = new Queen(0,3,Color.WHITE);
        mat[0][4] = new King(0,4,Color.WHITE);
        mat[0][5] = new Bishop(0,5,Color.WHITE);
        mat[0][6] = new Knight(0,6,Color.WHITE);
        mat[0][7] = new Rook(0,7,Color.WHITE);

        for(int i = 0; i<8; i++){
            mat[1][i] = new Pown(1,i,Color.WHITE);
        }




        // place black pieces
        mat[7][0] = new Rook(0,0,Color.BLACK);
        mat[7][1] = new Knight(0,1,Color.BLACK);
        mat[7][2] = new Bishop(0,2,Color.BLACK);
        mat[7][3] = new Queen(0,3,Color.BLACK);
        mat[7][4] = new King(0,4,Color.BLACK);
        mat[7][5] = new Bishop(0,5,Color.BLACK);
        mat[7][6] = new Knight(0,6,Color.BLACK);
        mat[7][7] = new Rook(0,7,Color.BLACK);

        for(int i = 0; i<8; i++){
            mat[6][i] = new Pown(1,i,Color.BLACK);
        }
    }

    public Piece getPieces(int row,int col){
            return mat[row][col];
    }

    public void setPiece(Piece piece, int row,int col){
        mat[row][col] = piece;
    }

    public boolean isValidMove(Piece piece ,int row,int col){
        return row >=0 && row < 8 && col >= 0 && col < 8  && piece.canMove(row,col) && (mat[row][col] == null || mat[row][col].getColor() != piece.getColor());
    }

    public Boolean isCheckmate(){
            // todo
        return false;
    }

}
