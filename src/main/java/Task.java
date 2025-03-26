import java.util.ArrayList;
import javax.swing.JOptionPane;

//this is the declearation for all the need input for strings and int, including the arrays needed for storing user info
public class Task {
    ArrayList<String> Taskname = new ArrayList<String>();
    ArrayList<String> Description = new ArrayList<String>();
    ArrayList<String> Developername = new ArrayList<String>();
    ArrayList<String> Developerlast = new ArrayList<String>();
    ArrayList<String> Statusname = new ArrayList<String>();
    ArrayList<String> taskID = new ArrayList<String>();
    ArrayList<String> Print = new ArrayList<String>();
    ArrayList<Integer> TaskDuration = new ArrayList<Integer>();
    
    //decleartion from values from while loop to work and counter to allow the program to restart when needed
    public String se;
    public int we;
    public int p;
    public int option;
    public int Tasknum;
    public static int z;
    public int totalHours = 0;
    public static int currentTaskIndex = 0;
    public boolean validReportOption;
    
    //welcome message that displays when the login is correct using a if statement
    public String Welcome(){
        JOptionPane.showMessageDialog(null, "Welcome To EasyKanban", "Goodmoring", JOptionPane.PLAIN_MESSAGE);
        return null;
    }
    
    // this is the menu method that allows the user to pick a option they want and loops until user selects quit or exit
    public String Menu(){
        validReportOption = true;
        do{
            //this is the try-catch which stop errors from poping up in tthe console and use them to display error as a Joptionpane
            try{
                option = Integer.parseInt(JOptionPane.showInputDialog("Please Choose A Feature" + "\n" + "1. Add Tasks" + "\n" + "2. Show Reports" + "\n" + "3. Quit"));
                switch(option){
                    case 1:
                        addTasks();
                        break;
                    case 2:
                        //this calls the showReport methods which holds display options and more
                        ShowReport();
                        break;
                    case 3:
                        //exit option to allow user to quit the program
                        exit();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invaild Input Ensure Input Are Vaild", "Error 203", JOptionPane.PLAIN_MESSAGE);
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input. Please Enter A Valid Input.", "Error 203", JOptionPane.PLAIN_MESSAGE);
                validReportOption = false;
            }
        }
        while(option != 3 || !validReportOption);
        return null;
    }
    
    /*this is the addtask method which user the delearation to store the info so
    it not removed from the memory, plus it calls all the input methods need for
    the user info while calculating the total hours and also displaying it after
    the input has been done and also takes in the number of tasks the user wants
    and the info is used in the loops and arrays to determine the size of the array*/
    public int addTasks(){
        //input which thats in the number of task the user wants to input
        Tasknum = Integer.parseInt(JOptionPane.showInputDialog(null, " Please Input The Number Of Task You Would Like To Add: " ,"Task Page", JOptionPane.QUESTION_MESSAGE));
        for(int i = 0 ;i < Tasknum ;i++){
            Taskname();
            checkTaskDescrition();
            Developername();
            Developerlast();
            TaskDuration();  
            TaskStatus();
            createTaskID();
            returnTotalHours(); 
            printTaskDetails();
            currentTaskIndex++;
            z++;
            JOptionPane.showMessageDialog(null, "Task Has Been Captured Successfully");
        }
        return z;
    }
    
    //this is task input which takes the task names and stores it in a array
    public String Taskname(){
        String task;
        do{
            task = JOptionPane.showInputDialog(null, "Enter The Task Name : " ,"Task Page ", JOptionPane.QUESTION_MESSAGE);
            this.se = task;
            Taskname.add(task);
            if(task == null){
                exit();
            }
            if(task.isBlank()){
                JOptionPane.showMessageDialog(null, "No Input", "Error 401!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Task Name Captured", "Task Page ", JOptionPane.PLAIN_MESSAGE);              
                return task;  
            }
        }
        while(task.isBlank());
        return task;
    }
    
    //this is the method which takes the user name and stores it in a array
    public String Developername(){
        String se;
        do{
            se = JOptionPane.showInputDialog(null, "Enter Your Name : " ,"Task Page ", JOptionPane.QUESTION_MESSAGE);
            this.se = se;
            Developername.add(se);
            if(se == null){
                exit();
            }
            if(se.isBlank()){
                JOptionPane.showMessageDialog(null, "No Input", "Error 401!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Name Captured, Hope You Are Doing Good ", "Task Page ", JOptionPane.PLAIN_MESSAGE);               
                return se;
            }
        }
        while(se.isBlank());
        return se;
    }
    
    //this is the method used to store the lastname in a array of the user
    public String Developerlast(){
        String se;
        do{
            se = JOptionPane.showInputDialog(null, "Enter Your Lastname : " ,"Task Page ", JOptionPane.QUESTION_MESSAGE);
            this.se = se;
            Developerlast.add(se);
            if(se == null){
                exit();
            }
            if(se.isBlank()){
                JOptionPane.showMessageDialog(null, "No Input", "Error 401!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Last Name Captured", "Task Page ", JOptionPane.PLAIN_MESSAGE);                      
                return se;
            }
        }
        while(se.isBlank());
        return se;
    }
    
    //this is the taskduration method which takes the user durations for a task and saves them in a array
    public int TaskDuration(){
        int e = 0;
        boolean validInput = true;
        do{
            try{
                e = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Task Duration : " ,"Task Page ", JOptionPane.QUESTION_MESSAGE));
                this.we = e;
                TaskDuration.add(e);
                if(e == 0){
                    JOptionPane.showMessageDialog(null, "The Duration Can't Be 0 ", "Error 406!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "The Duration Has Been Captured ", "Task Page ", JOptionPane.PLAIN_MESSAGE);               
                    return e;
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input. Please Enter A Valid Input.", "Error 203", JOptionPane.PLAIN_MESSAGE);
                validInput = false;
            }
        }
        while(e == 0 || !validInput);
        return e;   
    }
    
    //this is the method used to set the taskstatus of the user choice in a array
    public int TaskStatus(){
        int e = 0;
        boolean validInput = true;
        do{
            try{
                e = Integer.parseInt(JOptionPane.showInputDialog("Please Choose A Feature" + "\n" + "1. To Do" + "\n" + "2. Done" + "\n" + "3. Doing"));
                this.we = e;
                switch(e){
                    case 1:
                        Statusname.add("To Do");
                        break;
                    case 2:
                        Statusname.add("Done");
                        break;
                    case 3:
                        Statusname.add("Doing");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invaild Input Ensure Input Are Vaild", "Error 203", JOptionPane.PLAIN_MESSAGE); 
                        validInput = false;
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input. Please enter a valid input.", "Error 203", JOptionPane.PLAIN_MESSAGE);
                validInput = false;
            }
        }
        while(e >= 4 || e <= 0 || !validInput);
        return e;
    }
    
    //this is the method used to check if the user input is correct if not it loops and returns false or if correct it return true. plus input are saved in a array
    public boolean checkTaskDescrition(){
        String e;
        do{
            e = JOptionPane.showInputDialog(null, "Enter The Task Description : " ,"Task Page ", JOptionPane.QUESTION_MESSAGE);
            Description.add(e);
            if(e == null){
                exit();
            }
            if(e.length() >= 50){
                JOptionPane.showMessageDialog(null, "Please Enter A Task Description Of Less Than 50 Characters ", "Task Page ", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            if(e.length() <= 0){
                 JOptionPane.showMessageDialog(null, "Please Enter A Task Description ", "Task Page ", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Task Description Successfully Captured", "Task Page ", JOptionPane.PLAIN_MESSAGE);
                return true;
            }
        }
        while(e.length() >= 50 || e.length() <= 0);
        return false; 
    }
    
    //this is the method used to create a TaskID automatically using substring from user input while making them in capital letter. plus they are stored in a array
    public String createTaskID(){
        String se = Taskname.get(z).substring(0,2).toUpperCase() + ":" + z + ":" + Developerlast.get(z).substring(Developerlast.get(z).length() - 3).toUpperCase();
        taskID.add(se);
        this.se = se;
        return se; 
    }
    
    //This is the method used to store the task deatails of the inputed info in all the array inplanted
    public String printTaskDetails(){
        String e = "Task Status: " + Statusname.get(z) + "\nDeveloper Details: " +
        Developername.get(z) + " " + Developerlast.get(z) + "\nTask Number: " + z + "\nTask Name: " + Taskname.get(z) +
        "\nTask Description: " + Description.get(z) + "\nTask ID: " + taskID.get(z) + "\nTask Duration: " + TaskDuration.get(z);        
        Print.add(e);
        this.se = e;
        return e;
    }
    
    //this method is used to calculate the total hours for all the enter Duration using a for loop on the Meun()
    public int returnTotalHours(){
        totalHours += TaskDuration.get(z);
        return totalHours; 
    }
    
    //This method is used to quit the program and it is also used as a cancel button on the options
    public String exit(){
        JOptionPane.showMessageDialog(null, "Thank You For Using The System, Goodbye", "Exit", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        return null;
    }
    
    //this is the method that displays the task which has a Done status
    public String DisplayDoneTaskStatus(){ 
        int q = 0;
        for(int z = 0;z < Statusname.size(); z++){
            if(Statusname.get(z).equals("Done")){
                JOptionPane.showMessageDialog(null, "Task With Status Done: " + "\n" + "Developer: " + Developername.get(z) + " " + Developerlast.get(z) + "\n"
                + "Task Name: " + Taskname.get(z) + "\n" + "Task Duration: " + TaskDuration.get(z));
                q = 5;
            }
        }
        if(q != 5){
            JOptionPane.showMessageDialog(null, "There Are No Task With The Status Done ");
            return "False";
        }
        return "True";
    }
    
    //this is the method that allow the user to check which task has the longers time
    public String LongestTaskDuration(){
        int maxDuration = 0;
        int maxIndex = -1;
        for(int z = 0;z < TaskDuration.size(); z++){
            if(TaskDuration.get(z) > maxDuration){
                maxDuration = TaskDuration.get(z);
                maxIndex = z;
            }
        }
        if(maxIndex != -1){
            JOptionPane.showMessageDialog(null, "Task With The Longest Duration" + "\n" + "Task Name: " + Taskname.get(maxIndex) + "\n" + "Developer Name: " + Developername.get(maxIndex) + 
            "\n" + "Developer Lastname: " + Developerlast.get(maxIndex) + "\n" + "Task Duration: " + TaskDuration.get(maxIndex));
            return "True";
        }
        else{
            JOptionPane.showMessageDialog(null, "Unknown Error Found, Please Clear The All Task", "Error 712", JOptionPane.PLAIN_MESSAGE);
            return "False";
        }
    }
    
    //this is the method that allow the user to search task by name
    public String SearchTaskName(){
        int index = -1;
        String search;
            do{
                search = JOptionPane.showInputDialog(null, "Searching For Which Task: " ,"Search Page ", JOptionPane.QUESTION_MESSAGE);
                if(search == null){
                    exit();
                }
                if(search.isBlank()){
                    JOptionPane.showMessageDialog(null, "No Input", "Error 401!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    for(int i = 0; i < Taskname.size(); i++){
                        if(search.equalsIgnoreCase(Taskname.get(i))){
                            index = i;
                            break;
                        }
                    }
                    if(index != -1){
                        JOptionPane.showMessageDialog(null, "Task Found" + "\n" + "Task Name: " + Taskname.get(index)
                        + "\n" + "Developer Name: " + Developername.get(index) + "\n" + "Developer Lastname: " + Developerlast.get(index)
                        + "\n" + "Task Status: " + Statusname.get(index));
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Task Not Found");
                        return "False";
                    }
                }
            }
            while(search.isBlank());
            return "True";
        }
    
    //this is the method that allows the user to search for a ask by the dev
    public String SearchDeveloperTasks(){
        int Index = -1;
        String name;
        do{
            name = JOptionPane.showInputDialog(null, "Searching For Which Developer: " ,"Search Page ", JOptionPane.QUESTION_MESSAGE);
            if(name == null){
                exit();
            }
            if(name.isBlank()){
                 JOptionPane.showMessageDialog(null, "No Input", "Error 401!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(int i = 0; i < Developername.size(); i++){
                    if(Developername.get(i).equalsIgnoreCase(name)){
                        JOptionPane.showMessageDialog(null, "Developer " + Developername.get(i) + " Found" + "\n"
                        + "Task Name: " + Taskname.get(i) + "\n"
                        + "Task Status: " + Statusname.get(i));
                        Index = i;
                    }
                }
                if(Index == -1){
                    JOptionPane.showMessageDialog(null, "No Tasks Has Been Assigned To This Developer");
                    return "False";
                }
            }
        }
        while(name.isBlank());
        return "True";
    }
    
    //This is the method that allow you to delete a task from the array
    public String DeleteTask(){
        int index = -1;
        String task;
        do{
            task = JOptionPane.showInputDialog(null, "Which Task Do You Want To Delete: " ,"Delete Page ", JOptionPane.QUESTION_MESSAGE);
            if(task == null){
                exit();
            }
            if(task.isBlank()){
                JOptionPane.showMessageDialog(null, "No Input", "Error 401!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(int i = 0; i < Taskname.size(); i++){
                    if(Taskname.get(i).equalsIgnoreCase(task)){
                        index = i;
                        break;
                    }
                }
                if(index != -1){
                    Taskname.remove(index);
                    Developername.remove(index);
                    Developerlast.remove(index);
                    Statusname.remove(index);
                    totalHours -= TaskDuration.get(index);
                    TaskDuration.remove(index);
                    Print.remove(index);
                    JOptionPane.showMessageDialog(null, "Task Deleted Successfully");
                    if(currentTaskIndex > 0){
                        currentTaskIndex--;
                        z--; 
                    }
                    //method which restart the counter when ever the arraylist is empty 
                    if(Taskname.size() == 0){
                        currentTaskIndex = 0;
                    }
                    return "True";
                }
                else{
                    JOptionPane.showMessageDialog(null, "Task Not Found");
                    return "False";
                }
            }
        }
        while(task.isBlank());
        return "False";
    }
    
    //this method allow the user to be able to pick a option from the Show report list which is in the menu
    public void ShowReport(){
        do{
            try{
                p = Integer.parseInt(JOptionPane.showInputDialog("Please Choose A Feature" + "\n" + "1. Display Done Task Status" + "\n" + 
                "2. Longest Task Duration" + "\n" + "3. Search Task Name" + "\n" + 
                "4. Search Developer Tasks" + "\n" + "5. Delete Task" + "\n" + 
                "6. Display All Task" + "\n" + "7. Clear All Tasks" + "\n" + "8. Back"));
                validReportOption = true;
                switch(p){
                    case 1:
                        if(currentTaskIndex == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            DisplayDoneTaskStatus();
                        }
                        break;
                    case 2:
                        if(currentTaskIndex == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            LongestTaskDuration();
                        }
                        break;
                    case 3:
                        if(currentTaskIndex == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            SearchTaskName();
                        }
                        break;
                    case 4:
                        if(currentTaskIndex == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            SearchDeveloperTasks();
                        }
                        break;
                    case 5:
                        if(currentTaskIndex == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            DeleteTask();
                        }
                        break;
                    case 6:
                        if(totalHours == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            Print();
                        }
                        break;
                    case 7:
                        if(currentTaskIndex == 0){
                            JOptionPane.showMessageDialog(null, "There Are No Task Added, Please Add Tasks First");
                        }
                        else{
                            clear();
                        }
                        break;
                    case 8:
                        //back button to allow the user to go back in the program when needed
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invaild Input Ensure Input Are Vaild", "Error 203", JOptionPane.PLAIN_MESSAGE);
                        validReportOption = false;
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input. Please Enter A Valid Option.", "Error 203", JOptionPane.PLAIN_MESSAGE);
                validReportOption = false;
            }
        }
        while(p >= 9 || !validReportOption);
    }
    
    //This is the clear method with allows the arrays to be cleared when need to
    public int clear(){
        do{
            try{
                p = Integer.parseInt(JOptionPane.showInputDialog("Are You Sure You To Clear All Tasks" + "\n" + "1. Yes" + "\n" + "2. No"));
                switch(p){
                    case 1:
                        if(p == 1){
                            Taskname.clear();
                            Description.clear();
                            Developername.clear();
                            Developerlast.clear();
                            Statusname.clear();
                            taskID.clear();
                            Print.clear();
                            TaskDuration.clear();
                            currentTaskIndex = 0;
                            totalHours = 0;
                            z = 0;
                            JOptionPane.showMessageDialog(null, "All Tasks Has Been Cleared");
                        }
                        else{
                            break;
                        }
                        break;
                    case 2:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invaild Input Ensure Input Are Vaild", "Error 203", JOptionPane.PLAIN_MESSAGE);       
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input. Please Enter A Valid Input.", "Error 203", JOptionPane.PLAIN_MESSAGE);
            }
        }
        while(p >= 3 || p <= 0);
        return currentTaskIndex + totalHours;
    }
    
    //This method is to display all the details in the arrays when called
    public String Print(){
        for(int z = 0 ;z < Taskname.size() ;z++){
            JOptionPane.showMessageDialog(null, Print.get(z));
        }
        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
        return null;
    }
}