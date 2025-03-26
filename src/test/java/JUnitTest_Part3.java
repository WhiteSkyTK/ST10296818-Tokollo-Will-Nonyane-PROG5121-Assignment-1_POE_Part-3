import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class JUnitTest_Part3 {
    
    public JUnitTest_Part3() {
    }
    //This test method test all the methods need in part3 
    //it tests the population and delete method and display also including the search methods
    @Test
    public void testDeveloperArrayPopulated(){
        //The population is first
        Task task = new Task();
        //testing the populating of Name
        System.out.println("Testing for if the name is Taken");
        String expected = task.Developername();
        String actual = task.se;
        assertEquals(expected, actual);
        System.out.println("Test for if the name is: " + (expected == actual) + "\n");
        task.Developername.add(actual);
        
        //testing the populating of Lastname
        System.out.println("Testing for if the Lastname is Taken");
        String expected1 = task.Developerlast();
        String actual1 = task.se;
        assertEquals(expected1, actual1);
        System.out.println("Test for if the Lastname is: " + (expected1 == actual1) + "\n");
        task.Developerlast.add(actual1);
        
        //testing the populating of Task Description
        System.out.println("Testing for if the Task Description is Taken");
        boolean expected5 = task.checkTaskDescrition();
        boolean actual5 = true;
        String ex = task.se;
        assertEquals(expected5, actual5);
        System.out.println("Test for if the Task Description is: " + (expected5 == actual5) + "\n");
        task.Description.add(ex);
        
        //testing the populating of Task name
        System.out.println("Testing for if the Task name is Taken");
        String expected2 = task.Taskname();
        String actual2 = task.se;
        assertEquals(expected2, actual2);
        System.out.println("Test for if the Task name is: " + (expected2 == actual2) + "\n");
        task.Taskname.add(actual2);
        
        //testing the populating of Task Duration
        System.out.println("Testing for if the Task Duration is Taken");
        int expected3 = task.TaskDuration();
        int actual3 = task.we;
        assertEquals(expected3, actual3);
        System.out.println("Test for if the Task Duration is: " + (expected3 == actual3) + "\n");
        task.TaskDuration.add(actual3);
        task.returnTotalHours();
        
        //testing the populating of Task Status
        System.out.println("Testing for if the Task status is Taken");
        int expected4 = task.TaskStatus();
        int actual4 = task.we;
        assertEquals(expected4, actual4);
        System.out.println("Test for if the Task status is: " + (expected4 == actual4) + "\n");
        if(task.we == 1){
            task.Statusname.add("To Do");
        }
        if(task.we == 2){
            task.Statusname.add("Done");
        }
        if(task.we == 3){
            task.Statusname.add("Doing");
        }
        
        //testing the Create TaskID
        System.out.println("Testing for if the TaskID is Taken");
        String expected6 = task.createTaskID();
        String actual6 = task.se;
        assertEquals(expected6, actual6);
        System.out.println("Test for if the TaskID is: " + (expected6 == actual6) + "\n");
        task.taskID.add(actual6);
        
        //testing the Display report
        System.out.println("Testing for if the task display is Shown");
        String expected7 = task.printTaskDetails();
        String actual7 = task.se;
        assertEquals(expected7, actual7);
        task.Print.add(actual7);
        System.out.println("Test for if the task display is: " + (expected7 == actual7) + "\n");
        task.Print();
        
        //testing the longest duration method
        System.out.println("Testing for if the task with the longest duration is displayed");
        String expected0 = task.LongestTaskDuration();
        String actual0 = "True";
        assertEquals(expected0, actual0);
        System.out.println("Test for if the longest duration is: " + (expected0 == actual0) + "\n");
        
        //testing the task with done method 
        System.out.println("Testing for if the task with the longest duration is displayed");
        String expected12 = task.DisplayDoneTaskStatus();
        String actual12 = "True";
        assertEquals(expected12, actual12);
        System.out.println("Test for if the longest duration is: " + (expected12 == actual12) + "\n");
        
        //testing the search task with taskname method 
        System.out.println("Testing for if the task searched is displayed");
        String expected13 = task.SearchTaskName();
        String actual13 = "True";
        assertEquals(expected13, actual13);
        System.out.println("Test for task search is: " + (expected13 == actual13) + "\n");
        
        //testing the search task with developer method 
        System.out.println("Testing for if the developer searched is displayed");
        String expected14 = task.SearchDeveloperTasks();
        String actual14 = "True";
        assertEquals(expected14, actual14);
        System.out.println("Test for developer search is: " + (expected14 == actual14) + "\n");
        
        //testing the delete method 
        System.out.println("Testing for if the task is removed");
        String actual10 = "True";
        String expected10 = task.DeleteTask();
        assertEquals(expected10, actual10);
        task.Print.remove(actual7);
        System.out.println("Test for the task deletion is: " + (expected10 == actual10) + "\n");
    }
   
    /*
    This methods dont work and are here for future modifications
    @Test
    public void testDisplayRepory(){
        
    }
    
    @Test
    public void testDeleteTask(){
       
    }
    
    @Test
    public void testDisplayTaskByDeveloper(){
        
    }
    @Test
    public void testSearchTask(){
        
    }
*/
    
}
