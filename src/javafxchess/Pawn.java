
package javafxchess;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author rh41776
 */
public class Pawn extends Piece {
        Image image = new Image("images/pieces.png");
         
        
    public Pawn(Side side){
        super(Type.PAWN, side);
        this.setImage(image);
        
        Rectangle2D viewportRect = new Rectangle2D(665, 0, 133, 133);
        this.setViewport(viewportRect);
        this.setFitWidth(75);
        this.setPreserveRatio(true);
        this.setOnMouseReleased(evt -> pieceClicked(evt));
    }

    private void pieceClicked(MouseEvent evt) {
        System.out.println(evt.getSource());
        System.out.println(evt.getTarget());
    }
    
}
