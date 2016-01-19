package createdirectory;
 
import java.io.File;
import java.io.IOException;

public class CreateDirectory {

     
    public static void main(String[] args) {
         try {
            File f = new File("MyDirectory");
            f.mkdir();  // create the folder(Line A)
            File file = new File(f, "My file");
            file.createNewFile();
        } catch (IOException ex) {
        }
    }
}
