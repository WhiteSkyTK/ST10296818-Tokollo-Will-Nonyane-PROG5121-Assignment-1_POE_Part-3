import static jdk.jfr.FlightRecorder.register;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;

public class JUnitTest{
    
    public JUnitTest(){
    }
    @BeforeAll
    @Test
    public static void testLoginSuccessful(){
        //Calling methods
        Register obj = new Register();
        Login Test = new Login(obj);
        
        //testing name input is correct
        System.out.println("Test for if Input for Name is correct");
        String expectedname = obj.Setname();
        String actualname = obj.name;
        assertEquals(expectedname,actualname);
        System.out.println("The name input is taken: " + (expectedname == actualname) + "\n");

        //testing lastname input is corrcet
        System.out.println("Test for if Input for Lastname is correct");
        String expectedlastname = obj.Setlastname();
        String actuallastname = obj.lastname;
        assertEquals(expectedlastname,actuallastname);
        System.out.println("The lastname input is taken: " + (expectedlastname == actuallastname) + "\n");

        //testing if register username input are correct
        System.out.println("Test for if Input for Username is correct");
        String expectedusername = "Username successfully captured";
        String actualusername = obj.Setusername("username");
        assertEquals(expectedusername,actualusername);
        System.out.println("The username input is take: " + (expectedusername == actualusername) + "\n");

        //testing if register password input is correct
        System.out.println("Test for if Input for Password is correct");
        String expectedpassword = obj.Setpasswords("password");
        String actualpassword = "Password successfully captured";
        assertEquals(expectedpassword,actualpassword );
        System.out.println("The password input is taken: " + (expectedpassword == actualpassword) + "\n");

        
        //testing if login conditions are correct
        System.out.println("Test for if Input conditions for Username and Password is correct");
        String expectedusername_password = Test.registerUser();
        String actualusername_password = "WhiteSky it okay";
        assertEquals(expectedusername_password,actualusername_password);
        System.out.println("The username and password input conditions are Used: " + (expectedusername_password == actualusername_password) + "\n");

        //testing if the Registertion for username and password is the same as the Login username and password
        System.out.println("testing if the Registertion is the same as the Login");
        boolean expectedlogUser = Test.loginUser();
        boolean actuallogUser = true;
        assertEquals(expectedlogUser,actuallogUser);
        System.out.println("The username and password inputs are the same: " + (expectedlogUser == actuallogUser) + "\n");
        
        //testing if login status is displayed
        System.out.println("testing if LoginStatus is displayed");
        String expectedlogStatus = Test.returnLoginStatus();
        String actuallogStatus = "Welcome " + obj.name + ", " + obj.lastname + ", it is great to see you again.";
        assertEquals(expectedlogStatus,actuallogStatus);
        System.out.println("The LoginStatus is Displayed: " + (expectedlogUser == actuallogUser) + "\n");
    }
    
    @Test
        public void LoginUnsuccessful(){
        //Calling methods
        Register obj = new Register();
        Login Test = new Login(obj);
        
        //testing if register username input are correct
        System.out.println("Test for if Input for Username is correct conditions");
        String expectedusername = "Username successfully captured";
        String actualusername = obj.Setusername("username");
        assertEquals(expectedusername,actualusername);
        System.out.println("The username input is taken as: " + (expectedusername == actualusername) + "\n");

        //testing if register password input is correct
        System.out.println("Test for if Input for Password is correct conditions");
        String expectedpassword = obj.Setpasswords("password");
        String actualpassword = "Password successfully captured";
        assertEquals(expectedpassword,actualpassword );
        System.out.println("The password input is taken as: " + (expectedpassword == actualpassword) + "\n");

        
        //testing if login conditions are correct
        System.out.println("Test for if Input conditions for Username and Password are the same");
        String expectedusername_password = Test.registerUser();
        String actualusername_password = obj.passwords;
        assertNotEquals(expectedusername_password,actualusername_password);
        System.out.println("The username and password input conditions Used is: " + (expectedusername_password == actualusername_password) + "\n");

        //testing if the Registertion for username and password is the not same as the Login username and password
        System.out.println("testing if the Registertion is not the same as the Login");
        boolean expectedlogUser = Test.loginUser();
        boolean actuallogUser = false;
        assertEquals(expectedlogUser,actuallogUser);
        System.out.println("The username and password inputs are both not the same: " + (expectedlogUser == actuallogUser) + "\n");
        
        //testing if login status is displayed
        System.out.println("testing if LoginStatus is displays the login unsuccessful ");
        String expectedlogStatus = Test.returnLoginStatus();
        String actuallogStatus = "Welcome " + obj.name + ", " + obj.lastname + ", it is great to see you again.";
        String actuallogStatus1 = "Username or password incorrect, please try again.";
        assertNotEquals(expectedlogStatus,actuallogStatus);
        assertEquals(actuallogStatus1,expectedlogStatus);
        System.out.println("The LoginStatus is Displaying the false return: " + (expectedlogStatus == actuallogStatus1) + "\n");
    }

    
   /* 
    @Test
    public void Name_LastnameUnsuccessful(){
        //Calling methods
        Register obj = new Register();
        Login Test = new Login(obj);
        
        //testing name input is INcorrect
        System.out.println("Test for if Input for Name is correct");
        String expectedname = obj.Setname();
        String actualname = obj.name;
        assertEquals(expectedname,actualname);
        System.out.println("The name input is taken: " + (expectedname == actualname) + "\n");

        //testing lastname input is INcorrcet
        System.out.println("Test for if Input for Lastname is INcorrect");
        String expectedlastname = obj.Setlastname();
        String actuallastname = obj.lastname;
        assertEquals(expectedlastname,actuallastname);
        System.out.println("The lastname input is taken: " + (expectedlastname == actuallastname) + "\n");
    }
        */
        
}
