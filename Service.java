
package beautycenter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="test.service")
public class Service implements java.io.Serializable{
    
    
    @Id
    @Column(name="id_service")
    private int servID;
    
    @Column(name="servic_name")
    private String servName;
    
    @Column(name="service_price")
    private double servPrice;

    
    //************constructor *************
    public Service() {
    }

    public Service(String servName, double servPrice) {
        this.servName = servName;
        this.servPrice = servPrice;
    }

    public int getServID() {
        return servID;
    }

    public void setServID(int servID) {
        this.servID = servID;
    }

    public String getServName() {
        return servName;
    }

    public void setServName(String servName) {
        this.servName = servName;
    }

    public double getServPrice() {
        return servPrice;
    }

    public void setServPrice(double servPrice) {
        this.servPrice = servPrice;
    }
    
    
    
    
}
