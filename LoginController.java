/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautycenter;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import static beautycenter.BeautyCenter.stage;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.ResultSet;
import java.util.List;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class LoginController implements Initializable {
    
    String nameToStore ,passToStore;
    List<User> fetchedData;
    
    @FXML
    TextField userName, pass;
    
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
        MediaPlayer player0 = new MediaPlayer(new Media(path));
        player0.play();
        savedb();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

 public void savedb(){
            nameToStore = userName.getText();
            passToStore = pass.getText();
     
            if(nameToStore.equals(null)){
                 userName.setText("Please enter user name");
                 userName.setStyle("-fx-text-fill: red;");
            }else if(passToStore.equals(null)){
               pass.setText("Please enter password");
               pass.setStyle("-fx-text-fill: red;");
            
            }else{
    /*     ------------------- Retrive -------------     */
        try {
            
            
            
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String st = "from User";//name of POJO class
            
            Query q = session.createQuery(st);
            
            fetchedData = q.list();
            
            for(int i=0; i<fetchedData.size(); i++){
                if(fetchedData.get(i).getName().equals(nameToStore) && fetchedData.get(i).getPassword().equals(passToStore)){
                    System.out.println("name::  "+fetchedData.get(i).getName());
                    Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
                    Scene scene=new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            } 
            
           
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }    
            }
}
 
 
 /*public void retrive(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<User> ConList = null;
        String queryStr = "from users";
        Query query = session.createQuery(queryStr);
        ConList = query.list();
        session.close();
        System.out.println("contact list size: "+ConList.size());
        
        for(User s: ConList)
        {
            System.out.println("name: "+s.getName());
        }
        
    }*/

 
}
