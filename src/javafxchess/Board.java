package javafxchess;

import javafx.scene.Group;
import javafx.scene.paint.Color;

/**
 *
 * @author rh41776
 */
public class Board extends Group {
    private Tile[][] tiles;
    private int tilesize = 75;
    private Color lighttilecolor = Color.BLANCHEDALMOND;
    private Color darktilecolor = Color.GREEN;
    
    public Board(){
        this.tiles = new Tile[8][8];
        for (int row = 0; row < 8; row++){
            for (int col = 0; col < 8; col++){
              double xpos = col * tilesize;
              double ypos = row * tilesize;
              
              Tile tile = new Tile(xpos,ypos);
              
              if (row % 2 == 0){
                  if (col % 2 == 0){
                    tile.getSquare().setFill(lighttilecolor);
                  }
                  else {
                    tile.getSquare().setFill(darktilecolor);
                  }
              }
              if (row % 2 == 1){
                  if (col % 2 == 1){
                     tile.getSquare().setFill(lighttilecolor); 
                  }
                  else {
                      tile.getSquare().setFill(darktilecolor);
                  }
              }
              tiles[row][col] = tile; 
              this.getChildren().add(tile);
            }     
        } 
    }
    
    public Tile[][] getBoard(){
        
        return tiles;
    }
    
    /*public void printBoard(){
        for (int row = 0; row < tiles.length; row++){
            for (int col=0; col<tiles[0].length; col++){
                System.out.print(tiles[row][col].getTileNumber() + "|");
            }
            System.out.println();
        }
    }
    */
    
    public Tile getTile(int row, int col){
        return tiles[row][col];
    }
    
    
}
