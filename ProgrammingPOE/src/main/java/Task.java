import javax.swing.JOptionPane;

public class Task {
    
    int taskNumber;
    int taskDuration;
    int numberOfTasks;
    int returnTotalHours;
    String taskName;
    String developerDetails;
    String taskID;    
    String taskDescription;    
    String taskStatus;
    String fullDetails;
    boolean taskDescriptionCheck = false;
    int temp = 0;
    int numCounter = 0;
  
    
    public String createTaskID()
    {

      String firstTwoLetters = taskName.substring(0,2);
      String lastThreeLetters = developerDetails.substring(developerDetails.length()-3, developerDetails.length());
      String taskID = firstTwoLetters.toUpperCase() + ":" + taskNumber + ":" + lastThreeLetters.toUpperCase();
      
      //JOptionPane.showMessageDialog(null, taskID);
      
      return taskID;
    }
     
   
   public String printTaskDetails()
    {
      
       fullDetails = "Task Name: " + taskName + "\n" + "Task Number: " + taskNumber + "\n" + "Task Description: " + taskDescription + "\n" + "Developer Details: " + developerDetails + "\n" + "Hours used for task: " + taskDuration + "\n" + "Task status: " + taskStatus + "\n" + "Task ID: " + createTaskID();
        
       return fullDetails;
    } 
   
   
   
   public boolean checkTaskDescription()
   {
        if (taskDescription.length() >=50)
        {
           taskDescriptionCheck = false;
           
        }
        else
        {
           taskDescriptionCheck = true;
           
        }
       return taskDescriptionCheck;
       
   }
   
   public int returnTotalHours()
   {
    
       return returnTotalHours;
       
   }

    
}
