package files1;

import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args) {

        try {
            File f = new File("MyFile");     //  create file object in ram
            System.out.println(f.exists());  // return true if the actual file exists in HD
            boolean b = f.createNewFile();   // return true if it create a new file in HD
            System.out.println(b);

            System.out.println(f.exists()); // checks the existence of the actual file

        } catch (IOException ex) {}}
}
