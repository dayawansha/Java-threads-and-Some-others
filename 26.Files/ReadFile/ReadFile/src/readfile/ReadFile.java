package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    
     
    public static void main(String[] args) throws IOException {
         String line = null;
        try{
         
           BufferedReader br = new BufferedReader( new FileReader("abc.txt"));
             while ((line = br.readLine()) != null) {
           String a = br.readLine();
           System.out.println(a);    
    }}
    catch(IOException ex) { System.out.print(ex); }
    
}}
