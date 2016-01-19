package file2;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {
        char array1[] = new char[25];
        try {
            File f = new File("My file2");
            FileWriter fw = new FileWriter(f);  // Line A(do 2 things)
            System.out.println(f.exists());    // true

            fw.write("this is my first file");   // length is 21
            fw.flush();
            fw.close();
            
            FileReader fr = new FileReader(  f  );
           int Stringlength1 = fr.read(array1);     // read the file in to the char array pass as argument
            System.out.println(Stringlength1);        // 21

           for (int i= 0; i<25; i++){                 // print char array
               System.out.print(array1[i]);
           }
            fr.close();
        } catch (IOException ex) {
            System.out.println("IO");
        }
    }}
