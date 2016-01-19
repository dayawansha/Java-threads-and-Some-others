package readlineinbufferreader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadLineINBufferReader {

    public static void main(String[] args) {            
         try{
    
       File f = new File("MyDirectory");
       f.mkdir(); // create the folder
       
       File file = new File(f,"MyFile");
       file.createNewFile();
       
           BufferedWriter bw = new BufferedWriter( new FileWriter(file) );
           bw.write("sssSSSsAAAAAA");
           bw.flush();
           bw.close();
           
           BufferedReader br = new BufferedReader( new FileReader(file) );
           
           String a = br.readLine();
           System.out.print(a);   // prints sssSSSsAAAAAA
           
          
       }catch(IOException ex){  } 
    }   
}
