
package beautycenter;

import static beautycenter.BeautyCenter.stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class AboutUsController implements Initializable {

    String line="";
    
    @FXML
    Label label2;
    
     @FXML
    Button homebutton, trbutton, techbutton, aboutbutton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
        label2.setWrapText(true);
        java.io.File file1=new java.io.File("C:\\Users\\User\\Documents\\NetBeansProjects\\BeautyCenter\\src\\beautycenter\\aboutus.txt");

        try(
                Scanner input=new Scanner(file1)){
            while(input.hasNext()){
                line=line + "\n" + input.nextLine();
                label2.setText(line + "\n");
            }
        } catch(FileNotFoundException ex){
            Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
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
    
