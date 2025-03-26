import java.util.Scanner;
import javax.swing.JOptionPane;
public class Register{
    public String usernames;
    public String passwords;
    public String name;
    public String lastname;
    
    //name input
    public String Setname(){
        int Z = 0;
        String name;
        do{
            name = JOptionPane.showInputDialog(null, "Enter your name : " ,"Registration Page", JOptionPane.QUESTION_MESSAGE);
            this.name = name;
            if(name == null){
                exit();
            }
            if(name.isBlank()){
                JOptionPane.showMessageDialog(null, "No input", "Error 401!", JOptionPane.ERROR_MESSAGE);
                Z++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Name successfully captured", "Registertion Page", JOptionPane.PLAIN_MESSAGE);               
                return this.name;     
            }
            if(Z == 3){
                exit();
            }
        }
        while(Z < 3);
        return this.name;      
    }
    
    //lastname input
    public String Setlastname(){
        int Y = 0;
        String lastname;
        do{
            lastname = JOptionPane.showInputDialog(null, "Enter your last name : " ,"Registertion Page", JOptionPane.QUESTION_MESSAGE);
            this.lastname = lastname;
            if(lastname == null){
                exit();
            }
            if(lastname.isBlank()){
                JOptionPane.showMessageDialog(null, "No input", "Error 401!", JOptionPane.ERROR_MESSAGE);
                Y++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Lastname successfully captured", "Registertion Page", JOptionPane.PLAIN_MESSAGE); 
                return this.lastname;
            }
            if(Y == 3){
                exit();
            }
        }
        while(Y < 3);
        return this.lastname;  
    }
    
    //username input
    public String Setusername(String username){
        int v = 0;
        do{
            username = JOptionPane.showInputDialog(null, "Enter your username : " ,"Registertion Page", JOptionPane.QUESTION_MESSAGE);
            this.usernames = username;
            if(username == null){
                exit();
            }
            if(username.length() <= 5 && username.contains("_")){
                JOptionPane.showMessageDialog(null, "Username successfully captured", "Registertion Page", JOptionPane.PLAIN_MESSAGE);
                return "Username successfully captured";
            }
            else{
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted please ensure that your username contains an underscore and is no more than 5 characters in length.", "Error 403!", JOptionPane.ERROR_MESSAGE);     
                v++;
            }
            if(v == 3){
                exit();
            }
        }
        while(v < 3);
        return "Username is not correctly formatted please ensure that your username contains an underscore and is no more than 5 characters in length.";     
    }

    //password input
    public String Setpasswords(String password){
        int p = 0;
        do{
            password = JOptionPane.showInputDialog(null, "Please enter your password : " ,"Registertion Page", JOptionPane.QUESTION_MESSAGE);
            this.passwords = password;
            if(password == null){
                exit();
                return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
            }
            if(password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!£@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")){
                JOptionPane.showMessageDialog(null, "Password successfully captured", "Registertion Page", JOptionPane.PLAIN_MESSAGE);
                return "Password successfully captured";
            }  
            else{
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.", "Error 404!", JOptionPane.ERROR_MESSAGE);
                p++;
                
            }
            if(p == 3){
                exit();
            }
        }
        while(p < 3);
        return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
    }
    
    //exit method for this class
    public String exit(){
        JOptionPane.showMessageDialog(null, "Thank you for using the system", "Exit", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        return null;

    }
}