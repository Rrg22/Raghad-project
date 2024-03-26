
package beautycenter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="users")
public class User implements java.io.Serializable{
    
    @Id
    @Column(name="user_id")
    private int userid;
    
     @Column(name="uname")
    private String name;
     
    @Column(name="email")
    private String email;
      
    @Column(name="pass")
    private String password;

    
    //--------------constructors
    
    //empty constructor
    public User() {
    }

    //// constructor to be used in login
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //// constructor to be used in sign up
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
