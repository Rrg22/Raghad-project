/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class TechnologyController implements Initializable {

    public static String techChoice;
    
    @FXML
    Label label1, label11, label111;
    
    @FXML
    Button homebutton, trbutton, techbutton, aboutbutton;
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label1.setWrapText(true);
        label11.setWrapText(true);
        label111.setWrapText(true);
        
        
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
            
        
        //----------------------- choose technology ---------------------------------
        
        label1.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                
                techChoice = "Tech1";
                System.out.println(techChoice);
                
                Parent root = FXMLLoader.load(getClass().getResource("Treatments.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
         label11.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                
                techChoice = "Tech2";
                System.out.println(techChoice);
                
                Parent root = FXMLLoader.load(getClass().getResource("Treatments.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         
         
          label111.setOnMouseClicked(e ->{
            try {
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                
                techChoice = "Tech3";
                System.out.println(techChoice);
                
                Parent root = FXMLLoader.load(getClass().getResource("Treatments.fxml"));
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(TechnologyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
                
                
    }    
    
    
}
