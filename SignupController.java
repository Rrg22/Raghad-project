
package beautycenter;

import static beautycenter.BeautyCenter.stage;
import java.io.File;
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
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.hibernate.Session;


public class SignupController implements Initializable {

    String nameToStore, passToStore, emailToStore;
    
    @FXML
    TextField username, pass, email;
    Button login;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        String path = new File("src\\beautycenter\\sound\\ClickButton.wav").toURI().toString();
        MediaPlayer player0 = new MediaPlayer(new Media(path));
        player0.play();
        
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        nameToStore = username.getText();
        emailToStore = email.getText();
        passToStore = pass.getText();
        
        
        /*     -------------------SAVEE-------------     */
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user1 = new User(nameToStore,emailToStore,passToStore);
        
        int uid = (Integer) session.save(user1); //save it as object in database
        session.getTransaction().commit();
        session.close();
   
    }
    
    @FXML
    private void toLoginAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
}
