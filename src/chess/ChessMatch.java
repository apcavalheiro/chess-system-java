package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] auxiliar = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                auxiliar[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return auxiliar;
    }
}

