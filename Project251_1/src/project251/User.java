
package project251;
import java.util.ArrayList;
public class User {
    private String SSN;
    private String password;
    private String FName;
    private String LName;
    private String level;
    private String section;
    ArrayList<User> user = new ArrayList<>();

    public User(String SSN, String password) {
        this.SSN = SSN;
        this.password = password;  
       
    }
    
    public void AddUser(String SSN,String password){
        user.add(new User(SSN, password));
    }

    public String getSSN() {
        return SSN;
    }

    public String getPassword() {
        return password;
    }
  
    public boolean Login(String SSN,String password){
        for(int i=0;i< user.size();i++) {
            User a = user.get(i);
            if (a.getSSN().equals(SSN)) {
                // If SSN matches, check password
                if (a.getPassword().equals(password)) {
                    System.out.println("Login successful.");
                    return true;
                } else {
                    System.out.println("Incorrect password.");
                    return false;
                }
            }
        }
        System.out.println("User not found.");
        return false;
        }
    }
    

