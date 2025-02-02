
package beautycenter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BeautyCenter extends Application {
     public static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        //Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
