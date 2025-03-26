import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class JUnitTest_Part2{
    //this is the unit test that test the true and false of the description method
    @Test
    public void testCheckTaskDescription(){
        // Test for if the welcome message displayed
        Task task = new Task();
        task.Tasknum = 1;
        
        System.out.println("Testing for if the welcome message displayed");
        String expected2 = task.Welcome();
        String actual2 = null;
        assertEquals(expected2, actual2);
        System.out.println("Test for if the welcome message displayed is: " + (expected2 == actual2) + "\n");
        
        //Test for description less than 50 characters
        //Please use the information givin in the {} for better result
        System.out.println("Testing for if description less than 50 characters");
        boolean expected = true;
        boolean actual = task.checkTaskDescrition();
        assertEquals(expected, actual);
        System.out.println("Test for description less than 50 characters: " + (expected == actual) + "\n");
        
        //Please use the information givin in the {} for better result
        //Test for description more than 50 characters
        
        System.out.println("Testing for if description is more than 50 characters");
        
        boolean expectedD = false;
        boolean actualD = task.checkTaskDescrition();
        assertEquals(expectedD, actualD);
        System.out.println("Test for if description less than 50 characters: " + (expectedD == actualD) + "\n");
    }
        
    //this is the test unit that tests if the TaskID is creating the right ID while also Returning in to,
    
    @Test
    public void testCreateTaskID(){
        Task task = new Task();
        task.Tasknum = 1;
        //Please use the information givin in the {} for better result Or the info will be automated
        // Test for valid task name and developer last name
        System.out.println("Testing for if valid task name and developer last name return the TaskID");
      
        task.Taskname();
        task.Developerlast();

        //the info is auto inputed and auto tested, and the test is made below while it result is displayed on the console
        String actual = task.createTaskID();
        String expected = task.se;

        assertEquals(expected, actual);
        System.out.println("Test for if task name and developer last name gives right TaskID is: " + (expected == actual) + "\n");
        
        //Please use the information givin in the {} for better result Or the info will be automated
        // Test for valid task name and developer last name with different inputs
        System.out.println("Testing for if task name and developer last name returns the right TaskID");
        
        task.Taskname();
        task.Developerlast();

        //info is auto inplanted and auto tested while it is displayed in the console
        String actual1 = task.createTaskID();
        String expected1 = task.se;
       
        assertEquals(expected1, actual1);
        System.out.println("Test for if task name and developer last name returns the right TaskID is: " + (expected1 == actual1) + "\n");
    }
        
    
    /*This is the test unit which calculates the total hours using a loop because
    this method does not have a loop it loops in the menu() method*/
        
    @Test
    public void testReturnTotalHours(){
        Task task = new Task();
        //Please use the information givin in the {} for better result Or the info will be automated
        // Test for total hours calculation
        System.out.println("Testing for total hours calculation");
        task.Tasknum = 3;
        
        // Simulating the loop to add multiple tasks
        for (int i = 0; i < task.Tasknum; i++){
            task.TaskDuration();
             task.totalHours += task.returnTotalHours();
        }
        int expected = task.totalHours;
        //the method to check if it is true plus the output to display on the console
        int actual = task.totalHours;
        assertEquals(expected, actual);
        System.out.println("Test for total hours calculation is: " + (expected == actual) + "\n");
    
    }
    
}
