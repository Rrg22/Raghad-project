
package beautycenter;

import static beautycenter.BeautyCenter.stage;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class HomePageController implements Initializable {

    
    
    @FXML
    Button techButton, home;
    @FXML
    Button homebutton, trbutton, techbutton, aboutbutton;
    
    @FXML
    private void goTechno(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Technology.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
        MediaPlayer player0 = new MediaPlayer(new Media(path));
        player0.play();
    }
    
    @FXML
    private void goTreatment(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Treatments.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
        MediaPlayer player0 = new MediaPlayer(new Media(path));
        player0.play();
    }
    
    
    
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //-----------------------navigation bar ---------------------------------
        homebutton.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
        trbutton.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                Parent root = FXMLLoader.load(getClass().getResource("Treatments.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
        techbutton.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                Parent root = FXMLLoader.load(getClass().getResource("Technology.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
        aboutbutton.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
    }    
    
}
