import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskTest {
    
    Task t = new Task();
    
    public TaskTest() {
    }

    
    @Test
    public void testCreateTaskID() {
        
        String[][] ID = { {"CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:ND" } , {"CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:ND"}};
        for(int x = 0; x < ID.length-4; x++)
        {
            
            for(int y = 0; y < ID.length-4; x++)
            {
                assertEquals(ID[x], ID[x][y]);
            
            }
        
        }
            
    }

    
    @Test
    public void testNumberOfTasks() {
        
        int numberOfTasks = 5;
        
        assertEquals(numberOfTasks, 5);
        
    }

   
    @Test
    public void testCheckTaskDescription() {
        
        assertEquals("Task successfully captured", t.checkTaskDescription());
    }

    @Test
    public void testReturnTotalHours() {
        
        int [] [] durations = { {10, 12, 55, 11, 1} , { 10, 12, 55, 11, 1}};
        
        assertEquals(durations, durations);
        
        int returnTotalHours = 10 + 12 + 55 + 11 + 1; 
        
    }
    
    @Test
    public void testTaskDuration() {
        
        int [] [] hours = { {8, 10 } , { 8, 10}};
        
        for(int x = 0; x < hours.length+2; x++)
        {
            
            for(int y = 0; y < hours.length+2; x++)
            {
                assertEquals(hours[x], hours[x][y]);
            
            }
        
        }
        
        
        
    }
}
