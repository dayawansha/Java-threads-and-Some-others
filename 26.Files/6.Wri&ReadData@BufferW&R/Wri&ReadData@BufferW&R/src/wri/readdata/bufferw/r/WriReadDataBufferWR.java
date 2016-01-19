package wri.readdata.bufferw.r;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriReadDataBufferWR {

     public static void main(String[] args) throws IOException {
       try{
       char array[] = new char[10];
       File f = new File("MyDirectory");
       f.mkdir(); // create the folder
       
       File file = new File(f, "MyFile");
       file.createNewFile();
       
       System.out.println(f.isDirectory());  
       System.out.println(file.isFile());
       
           BufferedWriter bw = new BufferedWriter( new FileWriter(file));
           bw.write("eeeeeeeeeeeeeeee");
           bw.flush();
           bw.close();
           
           BufferedReader br = new BufferedReader( new FileReader(file) );
           br.read(array); // Line A
           
           for(char c : array) System.out.print(c);
           
       }catch(IOException ex){  }  
    }
    
}
