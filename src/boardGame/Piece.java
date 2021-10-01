package boardGame;

public class Piece {

    private Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
