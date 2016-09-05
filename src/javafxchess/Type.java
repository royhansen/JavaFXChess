/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxchess;

/**
 *
 * @author rh41776
 */
public enum Type {
    PAWN (1, 1),
    KNIGHT (2, 3),
    BISHOP (3, 3),
    ROOK (4, 5),
    QUEEN (5, 9),
    KING (6, 10);
    
    private final int piecetype;
    private final int piecevalue;
    
    Type(int piecetype, int piecevalue){
        this.piecetype = piecetype;
        this.piecevalue = piecevalue;
    }
    
    int piecetype(){
        return this.piecetype;
    }
    int piecevalue(){
        return this.piecevalue;
    }
    
}
