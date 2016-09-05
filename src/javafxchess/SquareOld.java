
package javafxchess;

import javafx.event.EventType;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author rh41776
 */
public class SquareOld extends Rectangle {
    static int squarecount;
    private int squarenumber;
    private String name;
    private String squarelabel;
    private int row; 
    private int col;
    
    public SquareOld(double xpos, double ypos, double squaresize, int row, int col){
        this.setX(xpos);
        this.setY(ypos);
        this.setHeight(squaresize);
        this.setWidth(squaresize);
        this.squarenumber = squarecount;
        this.name = "Square" + squarecount;
        this.row = row;
        this.col = col;
        this.setOnMouseReleased(evt -> squareClicked(evt));
        squarecount++;
    }
    
    public String getSquareName(){
        
        return this.name;
    }
    
    public int getSquareNumber(){
        
        return this.squarenumber;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }

    private void squareClicked(MouseEvent evt) {
        System.out.println(evt.getSource());
        System.out.println(evt.getTarget());
    }
    
   
    
}
