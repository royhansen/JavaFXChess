package javafxchess;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author rh41776
 */
public class JavaFXChess extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Board board = new Board();
        
        Text message = new Text("Message:");
        message.setY(board.getBoundsInParent().getHeight() + 20);
        
        Pawn pawn = new Pawn(Side.LIGHT);
        Tile tile = board.getTile(5, 3);
        tile.addPiece(pawn);
        
        
        Group root = new Group();
        root.getChildren().addAll(board, message);
        
        Scene scene = new Scene(root, 800, 660);
        
        primaryStage.setTitle("Garrett's Chess Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
