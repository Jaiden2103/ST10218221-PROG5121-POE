import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class TaskRun {
    
    static String[] developerArray;
    
    
    public static void main(String[] args) {
        
        Task t = new Task();
       
        // a JOptionPane enabled to show task options and which numbers correlate to which option and welcome to application
        
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "For Option:  \n Press 1 to Add Tasks \n Press 2 to View Reports \n Press 3 to Quit"));
        
        //an if statement going into the options
        
        
       if(choice == 1)  
       {
       
            t.numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of tasks to be added: ")); 
            
            
           
            t.taskName = JOptionPane.showInputDialog(null, "Please enter in task name: ");
            
            //t.taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task number: "));
            
            t.taskDescription = JOptionPane.showInputDialog(null, "Describe your task: ");
            
            t.developerDetails = JOptionPane.showInputDialog(null, "Please enter details of developer: ");
            
            
            
            t.taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of hours used: "));
            
            
           //Combo box functionality
             
             
           String[] options = { "Done", "To Do", "Doing"};
            
           JComboBox comboBox = new JComboBox(options);
            
           JOptionPane.showMessageDialog(null,  comboBox);
       
           t.taskStatus = (String) comboBox.getSelectedItem();
       
           // summary output
           
           JOptionPane.showMessageDialog(null, "Task Name: " + t.taskName + "\n" + "Task Number: " + t.taskNumber + "\n" + "Task Description: " + t.taskDescription + "\n" + "Developer Details: " + t.developerDetails + "\n" + "Hours used for task: " + t.taskDuration + "\n" + "Task status: " + t.taskStatus + "\n" + "Task ID: " + t.createTaskID());
            
            
           //task description parameters
           
         
           
            // for loop allowing to run code again if there are more than 1 number of tasks 
        
        for(int i = 0; i < t.numberOfTasks-1; i++)  
           
        {
            
           // developerArray = new String[t.numberOfTasks];
            
            t.numCounter++;
            
            t.taskName = JOptionPane.showInputDialog(null, "Please enter in task name: ");
            
            //t.taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task number: "));
            
            t.taskDescription = JOptionPane.showInputDialog(null, "Describe your task: ");
            
            t.developerDetails = JOptionPane.showInputDialog(null, "Please enter details of developer: ");
            
            //developerArray[i] = t.developerDetails;
            
           // t.numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of tasks to be added: "));
            
            t.taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of hours used: "));
            
            JOptionPane.showMessageDialog(null, comboBox);
       
            t.taskStatus = (String) comboBox.getSelectedItem();
            
           
            JOptionPane.showMessageDialog(null, "Task Name: " + t.taskName + "\n" + "Task Number: " + t.numCounter + "\n" + "Task Description: " + t.taskDescription + "\n" + "Developer Details: " + t.developerDetails + "\n" + "Hours used for task: " + t.taskDuration + "\n" + "Task status: " + t.taskStatus + "\n" + "Task ID: " + t.createTaskID());
        
        }
        
        
       }
       
       boolean yes = true;
       boolean no = false;
       int selection;
       
       if(choice == 2)
       {
           selection = JOptionPane.showConfirmDialog(null, "Would you like to continue?");
           
           yes = (selection == JOptionPane.YES_OPTION);
           
           no = (selection == JOptionPane.NO_OPTION);
           
           while(yes)
           {
                   
                String[] developer = {"Mike Smith", "Edward Harrison" , "Samantha Paulson" , "Glenda Oberholzer"};
            
                String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
            
                int[] duration = {5, 8, 2, 11 };
            
                String[] taskStatus = {"To DO", "Doing", "Done", "To Do "};
            
                String[] taskID = {"CL:1:MIK", "CF:2:EDW", "CR:3:SAM", "AA:4:GLE"};
            
            
                int options = Integer.parseInt(JOptionPane.showInputDialog("Report Of Tasks" + "\n" + "1. Display developer and details for completed tasks " + "\n" + "2. Display the Developer with the longest Duration " + "\n" + "3. Search for a task" + "\n" + "4. Search for all tasks " + "\n" + "5. Delete Task" + "\n" + "6. Task Report" + "\n" + "7. Exit"));
            
                if(options == 1)
                {
                
                    JOptionPane.showMessageDialog(null, "Developer: " + developer[2] + "\n Task name: " + taskNames[2] + "\n Task Duration: " + duration[2] + "\n Task status: " + taskStatus[2] +  "\n Task ID: " + taskID[2]);
            
                }
            
                else if(options == 2)
                {
            
                    JOptionPane.showMessageDialog(null, developer[3] + "\n" + duration[3] );
                
                }
           
                else if(options ==3)
                {
            
                    String taskName2 = JOptionPane.showInputDialog("Enter desired task name: ");
            
                    if(taskName2.equals(taskNames[0]))
                    {
               
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[0] +  "\n Developer: " + developer[0] +  "\n Task status: " +taskStatus[0]);
               
                    }
                    else if(taskName2.equals(taskNames[1]))
                    {
            
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[1] +  "\n Developer: " + developer[1] + "\n Task status: " +taskStatus[1]);
            
                    }
                    else if(taskName2.equals(taskNames[2]))
                    {
            
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[2] +  "\n Developer: " + developer[2] +  "\n Task status: " +taskStatus[2]);
            
                    }
                    else if(taskName2.equals(taskNames[3]))
                    {
            
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[3] + "\n Developer: " + developer[3] +  "\n Task status: " +taskStatus[3]);
            
                    }
                }
             
                else if(options == 4)
                {
                    String developer2 = JOptionPane.showInputDialog("Enter desired developer name: ");
            
                    if(developer2.equals(developer[0]))
                    {
               
                        JOptionPane.showMessageDialog(null, "Task name: " +  taskNames[0] + "\n" + "Task status: " + taskStatus[0]);
               
                    }
                    else if(developer2.equals(developer[1]))
                    {
            
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[1]  + "\n" + "Task status: " + taskStatus[1]);
            
                    }
                    else if(developer2.equals(developer[2]))
                    {
            
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[2]  + "\n" + "Task status: " + taskStatus[2]);
            
                    }
                    else if(developer2.equals(developer[3]))
                    {
            
                        JOptionPane.showMessageDialog(null, "Task name: " + taskNames[3]  + "\n" + "Task status: " + taskStatus[3]);
            
                    }
                }
            
                else if(options == 5)
                {
            
                    String deleteTask = JOptionPane.showInputDialog("Enter the task you would like to delete");   
              
                    ArrayList <String> newList = new ArrayList<>(Arrays.asList(taskNames));    
              
                    newList.remove(deleteTask);       
              
                    JOptionPane.showMessageDialog(null,"Entry\n" + deleteTask + "\nsuccessfully deleted");
                }
            
                else if(options == 6)
                {
            
                    JOptionPane.showMessageDialog(null, "Developer: " + developer[0] + "\n Task Name: " + taskNames[0] + "\n Task ID: " + taskID[0] + "\n Task Duration: " + duration[0] + "\n Task Status: " + taskStatus[0] );
            
                    JOptionPane.showMessageDialog(null, "Developer: " + developer[1] + "\n Task Name: " + taskNames[1] + "\n Task ID: " + taskID[1] + "\n Task Duration: " + duration[1] + "\n Task Status: " + taskStatus[1] );
            
                    JOptionPane.showMessageDialog(null, "Developer: " + developer[2] + "\n Task Name: " + taskNames[2] + "\n Task ID: " + taskID[2] + "\n Task Duration: " + duration[2] + "\n Task Status: " + taskStatus[2] );
            
                    JOptionPane.showMessageDialog(null, "Developer: " + developer[3] + "\n Task Name: " + taskNames[3] + "\n Task ID: " + taskID[3] + "\n Task Duration: " + duration[3] + "\n Task Status: " + taskStatus[3] );
            
                }
                
                else if(options == 7)
                {
                
                    System.exit(0);
                
                }
               
           }
       }
       
       
       else if(choice == 3)
       {
           
            System.exit(0);
            
       }
       
       if(t.checkTaskDescription()==true)
       {
           
        JOptionPane.showMessageDialog(null,"Task successfully captured");
        JOptionPane.showMessageDialog(null,t.printTaskDetails());
        
       }
       else
       {
           
           JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
           
       }
       
       
       if (0 < t.numberOfTasks)
       {
       
           t.temp = t.temp + t.taskDuration;
       
           JOptionPane.showMessageDialog(null, "Total Hours worked is: " + t.temp + " hours");
       
       }
       
       
    }
         
}    
    

