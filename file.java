import java.io.File;
import java.io.IOException;
public class file{
    public static void main(String [] args){
       try{
         File file = new File("create_test_file.txt");
        if(file.createNewFile())
        System.out.println("File created "+ file.getName());
        
        else
        System.out.println("File is already created");
       }
       catch(IOException e){
        System.out.println("Error occurd");
        e.printStackTrace();
       }
        
    }
}