package src.ChessGame;

public class InvalidMoveException extends RuntimeException {

    public InvalidMoveException(final String msg){
        super(msg);
    }

}
