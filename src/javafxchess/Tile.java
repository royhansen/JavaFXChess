
package javafxchess;

import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


/**
 *
 * @author rh41776
 */
public class Tile extends Group {
    private Square square;
    private Piece piece;
   
    
    public Tile(double xpos, double ypos){
        this.setLayoutX(xpos);
        this.setLayoutY(ypos);
        this.square = new Square();
        this.getChildren().add(this.square);
        this.setOnMouseClicked(evt -> tileClicked(evt));
    }
    
    public Square getSquare(){
        return this.square;
    }

    private void tileClicked(MouseEvent evt) {
        removePiece();
    }
    
    public void addPiece(Piece piece){
        this.piece = piece;
        this.getChildren().add(piece);
    }
    
    public void removePiece(){
        this.getChildren().remove(piece);
        this.piece = null;
    }
   
}
