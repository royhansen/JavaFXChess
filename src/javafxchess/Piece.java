
package javafxchess;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author rh41776
 */
public abstract class Piece extends ImageView {
    private Type type;
    private Side side;
    
    public Piece(Type type, Side side){
        this.type = type;
        this.side = side;
    }
    
    public Type getPieceType(){
        return this.type;
    }
    
    public int getPieceValue(){
        return this.type.piecevalue();
    }
}

