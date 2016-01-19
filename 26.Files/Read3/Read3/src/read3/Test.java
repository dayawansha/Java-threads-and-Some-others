package read3;

import java.io.*;

public class Test {

    public static void main(String[] args) {
       
        String fileName = "1 V00654.txt";
        String line = null;
        String g = "";
           
        try {
            
            FileReader fileReader = new FileReader(fileName);
            
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while ((line = bufferedReader.readLine()) != null) {
                 g = line + g;  
            }
          
            bufferedReader.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex + "\nUnable to open file " + fileName);

        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        
        System.out.println(g);

    }

}
