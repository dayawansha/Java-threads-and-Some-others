package rename.deleting;

import java.io.File;
import java.io.IOException;

public class RenameDeleting {

    public static void main(String[] args) throws IOException {
        File delDir = new File("delDir");
        delDir.mkdir();
        
        File delFile1 = new File(delDir, "delFile1.text");  // add delFile1 file to directory
        delFile1.createNewFile();
        
        File delFile2 = new File(delDir, "delFile2.text");   // add delFile2 file to directory
        delFile2.createNewFile();
        
        delFile1.delete();  // delete a file
        System.out.println("delDir1 is " + delDir.delete()); // delete dfile
        File newName = new File("new Dir ");  // rename directory
        delDir.renameTo(newName);             // rename directory
    }  
}
