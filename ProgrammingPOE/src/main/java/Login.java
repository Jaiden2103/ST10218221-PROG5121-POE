import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Login 
{
    protected static Scanner a;
    protected static String filepath = "AccDetails.txt";
    protected static String name;
    protected static String surname;
    
    public static void writeToTextFile(String username, String name, String surname, String password)
    {
        File myFile = new File(filepath);
        
        try
        {
            FileWriter writer = new FileWriter(myFile, true);
            
            BufferedWriter writeDetails = new BufferedWriter(writer);
            writeDetails.write(username+" "+name+" "+surname+" "+password); // adds varaiables
            writeDetails.write(System.getProperty("line.separator"));
            writeDetails.close();
              
            
            writer.close();
        }
        catch(IOException e)
        {
            //System.out.println("error");
            
            JOptionPane.showMessageDialog(null,"Error", "something went wrong", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static Boolean findCredentialsInTextFile(String username, String password)
    {
        boolean credentialsAreFound = false;
        
        String tempUsername;
        String tempPassword;
        String tempName;
        String tempSurname;
        
        try
        {
            
            Scanner textFileScanner = new Scanner (new File (filepath));
            textFileScanner.useDelimiter("[ \n]");
            
            while(textFileScanner.hasNext() && !credentialsAreFound)
            {
                tempUsername = textFileScanner.next();
                tempName = textFileScanner.next();
                tempSurname = textFileScanner.next();
                tempPassword = textFileScanner.next();
                
                
                
                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))        
                {
                    credentialsAreFound = true;
                     name = tempName;
                     surname = tempSurname;
                    
                }
                
            }
        
            textFileScanner.close();
            
        } 
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Something went wrong");
            
        }
    
        return credentialsAreFound;
    
    }
    
    public static String getFirstName()
    {
    
        return name;
    
    }
    
    public static String getSecondName()
    {
    
        return surname;
    
    }
}

