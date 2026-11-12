package UtilityClasses;

import PieceFactoryPackage.Factory.PieceFactory;

public class Board {
    Cell[][] board;
    private static Board instance;

    public Board(int rows) {
    initializeBoard(rows);
    }
    public static Board getInstance(int row){
        if(instance==null){
            instance=new Board(row);
        }
        return instance;
    };

    private void initializeBoard(int rows){
    board=new Cell[rows][rows];

    setPieceRow(0,true);
    setPawnRow(1,true,rows);

    setPieceRow(rows-1,false);
    setPawnRow(rows-2,false,rows);
        for (int row = 2; row < rows - 2; row++) {
            for (int col = 0; col < rows; col++) {
                board[row][col] = new Cell(row, col, null);
            }
        }
    }

    private void setPieceRow(int r ,Boolean isWhite){
    board[r][0]=new Cell(r,0,PieceFactory.createPiece("rook",isWhite));
        board[r][1]=new Cell(r,0,PieceFactory.createPiece("knight",isWhite));
        board[r][2]=new Cell(r,0,PieceFactory.createPiece("bishop",isWhite));
        board[r][3]=new Cell(r,0,PieceFactory.createPiece("queen",isWhite));
        board[r][4]=new Cell(r,0,PieceFactory.createPiece("king",isWhite));
        board[r][5]=new Cell(r,0,PieceFactory.createPiece("bishop",isWhite));
        board[r][6]=new Cell(r,0,PieceFactory.createPiece("knight",isWhite));
        board[r][7]=new Cell(r,0,PieceFactory.createPiece("rook",isWhite));


    }
    private void setPawnRow(int r,Boolean isWhite,int totalCol){
    for(int i=0;i<totalCol;i++){
        board[r][i]=new Cell(r,i,PieceFactory.createPiece("pwan",isWhite));
    }
    }

    public Cell getCell(int r,int c){
        if(r>=0&&c<= board[0].length-1&&r<board.length&&c>=0){
            return board[r][c];
        }
        return null;
    }


}
