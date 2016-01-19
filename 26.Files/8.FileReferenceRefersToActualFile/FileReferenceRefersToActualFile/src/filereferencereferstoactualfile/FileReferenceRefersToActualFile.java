package filereferencereferstoactualfile;

import java.io.File;
import java.io.IOException;

public class FileReferenceRefersToActualFile {

     public static void main(String[] args) throws IOException {
         File f = new File("MyDerectore");
         f.mkdir();
         File file = new File(f,"MyFile");
         file.createNewFile();
         System.out.println(f.isFile() );           //f
         System.out.println(file.isDirectory() );   // f      
         System.out.println(f.isDirectory() );      // t
         System.out.println(file.isFile() );        // t    
    }   
}
