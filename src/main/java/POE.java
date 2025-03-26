import java.util.Scanner;
import javax.swing.JOptionPane;
public class POE{

    public static void main(String[] args){      
//Welcome page
        JOptionPane.showMessageDialog(null, "Welcome To EasyKanban Registration Page, Click OK To Processed");
       
//Names input(calling)
       Register obj = new Register();
       String name = obj.Setname();        
       
//Last name input(calling)
        String lastname = obj.Setlastname();
                       
//Username input(calling)
        String username = obj.Setusername("username");
         
 //password input(calling)
        String password = obj.Setpasswords("password");
        JOptionPane.showMessageDialog(null, "Registration successful!, Your information has successfully captured, Click OK to continue to the login page", "Registertion Page", JOptionPane.PLAIN_MESSAGE);
        
//Login input(calling)
//checkUserName, checkPasswordComplexity
//checks registerUser (calling)  
        Login obj2 = new Login(obj);
        Task obj3 = new Task();
        obj2.logusername();
        obj2.logpassword();
        //obj2.registerUser();
        //obj2.loginUser();
        if(obj2.returnLoginStatus().equals("Welcome " + obj.name + ", " + obj.lastname + ", it is great to see you again.")){ 
            obj3.Welcome();
            obj3.Menu();
        }
    }
}