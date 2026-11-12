package PieceFactoryPackage.Factory;

import PieceFactoryPackage.ConcretePieces.*;
import PieceFactoryPackage.Piece;
import PieceMovementStrategyPattren.ConcreteStrategy.*;

public class PieceFactory {
    public static Piece createPiece(String type, Boolean isWhite){
        switch (type.toLowerCase()){
            case "king":
                return new King(isWhite,false,new KingStrategy());
            case "queen":
                return new Queen(isWhite,false,new QueenStrategy());
                
            case "rook":
                return new Rook(isWhite,false,new RookStrategy());
                
            case "pwan":
                return new Pwan(isWhite,false,new PwanStrategy());
                
            case "knight":
                return new Knight(isWhite,false,new KnightStrategy());
                
            case "bishop":
                return new Bishop(isWhite,false,new BishopStrategy());
            default:
                 new IllegalStateException("There is no state like this please provide the valide state");

        }
        return null;
    }
}
