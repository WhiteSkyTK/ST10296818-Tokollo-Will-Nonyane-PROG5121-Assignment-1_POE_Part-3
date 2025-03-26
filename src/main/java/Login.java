import java.util.Scanner;
import javax.swing.JOptionPane;
public class Login {
    //decleartion
    private Register register;
    public String username;
    public String password;
    Scanner input = new Scanner(System.in);
    Task Q = new Task();
    
    public Login(Register register){
        this.register = register;
    }
    
    //Login username input
    public String logusername(){
        String username = JOptionPane.showInputDialog(null, "Please enter your username: " ,"Login User", JOptionPane.QUESTION_MESSAGE);
        this.username = username;
        return this.username;
    }
    
    //set username String for Login 
    public void setUsername(String username){
        this.username = username;
    }
    //return username String for Login
    private String getUsername(){
        return this.username;
    }
    
    //Login password input
    public String logpassword(){
        String password = JOptionPane.showInputDialog(null, "Please enter your password: " ,"Login User", JOptionPane.QUESTION_MESSAGE);
        this.password = password;
        return this.password;
    }
    
    //set password String for Login
    public void setPassword(String password){
        this.password = password;
    }
    //return password String for Login
    private String getPassword(){
        return this.password;
    }
    
    // Check username format
    public boolean checkUserName(){
        if(username.length() <= 5 && username.contains("_")){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Check password complexity format
    public boolean checkPasswordComplexity(){
        if(password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!£@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Check Register user info and Loop if not right
    public String registerUser(){
        int IV = 0;
        int IVP = 0; 
        do{
            if(IV < 3){
                String username = JOptionPane.showInputDialog(null, "Please enter your username: " ,"Login User", JOptionPane.QUESTION_MESSAGE);
                this.username = username;
                if(username == null){
                register.exit();
                }
                if(checkUserName()){
                    IV = 3; 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.", "Error 403!", JOptionPane.ERROR_MESSAGE); 
                    IV++;
                    return "WhiteSky it not okay";
                }
            }
        if(IVP < 3){
            String password = JOptionPane.showInputDialog(null, "Please enter your password: " ,"Login User", JOptionPane.QUESTION_MESSAGE);
            this.password = password;
            if(password == null){
                register.exit();
                }
            if(checkPasswordComplexity()){
                IVP = 3;
            }
            else{
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.", "Error 404!", JOptionPane.ERROR_MESSAGE);
                IVP++;
                return "WhiteSky it not okay";
            }
        }
    }
        while(IV < 3 || IVP < 3);
        return "WhiteSky it okay";
 }
    
    //Check username Login with register username and password Login with register password
    public boolean loginUser(){
        if(this.getUsername().equals(register.usernames) && this.getPassword().equals(register.passwords)){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Return login status from conditions from above
    public String returnLoginStatus(){
        if(loginUser()){
            JOptionPane.showMessageDialog(null, "Welcome " + register.name + ", " + register.lastname + ", it is great to see you again.", "Login successful!", JOptionPane.PLAIN_MESSAGE);
            
            return "Welcome " + register.name + ", " + register.lastname + ", it is great to see you again.";
        }
        else{
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.", "Error code 1", JOptionPane.ERROR_MESSAGE);
            return "Username or password incorrect, please try again.";
        }
    }
}