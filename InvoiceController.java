
package beautycenter;

import static beautycenter.BodyTreatmentController.serv;
import static beautycenter.TechnologyController.techChoice;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class InvoiceController implements Initializable {

   @FXML 
   TextArea area;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        area.setText("Thank You To Visit Us\n\n"+serv+"\n\nTechnology: "+techChoice);
    }    
    
}
