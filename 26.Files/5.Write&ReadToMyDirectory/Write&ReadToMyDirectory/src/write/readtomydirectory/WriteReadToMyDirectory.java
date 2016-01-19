package write.readtomydirectory;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadToMyDirectory {
 
    public static void main(String[] args) {
        try{
        char array[] = new char[23];
        File f = new File("MyDirectory");
        f.mkdir(); // create the folder 
        File file = new File(f,"MyFile1");
        file.createNewFile();
        
            FileWriter fw = new FileWriter(file);
            fw.write("aaaa") ;
            fw.flush(); // if you have close the writer befor flushing IOException will be thrown
            fw.close();
           // fw.flush(); 
            
            FileReader fr = new FileReader(file);
            int t = fr.read(array);
            
            for(char c: array) System.out.print(c);         
            System.out.println(t);
        }catch(IOException ex){ } 
    }   
}
