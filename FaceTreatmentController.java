
package beautycenter;

import static beautycenter.BeautyCenter.stage;
import static beautycenter.BodyTreatmentController.serv;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.hibernate.Query;
import org.hibernate.Session;


public class FaceTreatmentController implements Initializable {

    public static String serv;
    List<Service> fetchedData;
    
    @FXML
    VBox serv1, serv2, serv3;
    
    @FXML
    Button homebutton, trbutton, techbutton, aboutbutton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serv1.setOnMouseClicked(e ->{   
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                String st = "from Service";//name of POJO class
            
                Query q = session.createQuery(st);
            
                fetchedData = q.list();
            
            for(int i=0; i<fetchedData.size(); i++){
                if(fetchedData.get(i).getServID() == 1){
                    System.out.println("Service Name: "+fetchedData.get(i).getServName()+"\nPrice: "+fetchedData.get(i).getServPrice());
                    serv = "Service Name: "+fetchedData.get(i).getServName()+" Price: "+fetchedData.get(i).getServPrice();
                    
                }
            }
            
            try {
                        Parent root = FXMLLoader.load(getClass().getResource("Invoice.fxml"));
                        Scene scene=new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    
                    } catch (IOException ex) {
                        Logger.getLogger(BodyTreatmentController.class.getName()).log(Level.SEVERE, null, ex);
                    }

            session.close();
            
        });
        
        //******************************************************************************************************
        
        serv2.setOnMouseClicked(e ->{   
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                String st = "from Service";//name of POJO class
            
                Query q = session.createQuery(st);
            
                fetchedData = q.list();
            
            for(int i=0; i<fetchedData.size(); i++){
                if(fetchedData.get(i).getServID() == 2){
                    System.out.println("Service Name: "+fetchedData.get(i).getServName()+"\nPrice: "+fetchedData.get(i).getServPrice());
                    serv = "Service Name: "+fetchedData.get(i).getServName()+" Price: "+fetchedData.get(i).getServPrice();
                    
                }
            }
            
            try {
                        Parent root = FXMLLoader.load(getClass().getResource("Invoice.fxml"));
                        Scene scene=new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    
                    } catch (IOException ex) {
                        Logger.getLogger(BodyTreatmentController.class.getName()).log(Level.SEVERE, null, ex);
                    }

            session.close();
            
        });
        
        
        //******************************************************************************************************
        
        serv3.setOnMouseClicked(e ->{   
                String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
                MediaPlayer player0 = new MediaPlayer(new Media(path));
                player0.play();
                
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                String st = "from Service";//name of POJO class
            
                Query q = session.createQuery(st);
            
                fetchedData = q.list();
            
            for(int i=0; i<fetchedData.size(); i++){
                if(fetchedData.get(i).getServID() == 3){
                    System.out.println("Service Name: "+fetchedData.get(i).getServName()+"\nPrice: "+fetchedData.get(i).getServPrice());
                    serv = "Service Name: "+fetchedData.get(i).getServName()+" Price: "+fetchedData.get(i).getServPrice();
                    
                }
            }
            
            try {
                        Parent root = FXMLLoader.load(getClass().getResource("Invoice.fxml"));
                        Scene scene=new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    
                    } catch (IOException ex) {
                        Logger.getLogger(BodyTreatmentController.class.getName()).log(Level.SEVERE, null, ex);
                    }

            session.close();
            
        });
        
        
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
