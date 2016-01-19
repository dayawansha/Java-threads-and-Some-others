package read2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class ReadFile2 {
    private String path;
    
    public ReadFile2(String file_path){
    path = file_path;
    }
    
    public String[] openFile(int x ) throws IOException{
        String line = null;
        
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
      //  int numberOfLines = 280;
        String[] textData = new String[x];
        int  i;
        
        for(i = 0; i <= x ; i++){
        textData[i] = textReader.readLine();
        }
        while ((line = textReader.readLine()) != null) {
                System.out.println(line);
            }
        textReader.close();
        return textData;
    }
    
    int readLines1() throws IOException{
    FileReader file_to_read =  new FileReader("C://abc.txt");
    BufferedReader bf = new BufferedReader(file_to_read);
    
    String aLine;
    int numberOfLines = 0;
    
    while(( aLine = bf.readLine())  != null ){  numberOfLines++;  }
    bf.close();
    return numberOfLines ;
    }

     
    public static void main(String[] args) {
     
        String file_name = "C://abc.txt";
        try{
        ReadFile2 file = new ReadFile2("C://abc.txt");
        file.readLines1();
       // String[] aryLines  = file.openFile();
        
      /*  int i;
        for(i = 0 ; i < aryLines.length; i++){  System.out.println(aryLines[i]);}*/
        
        }catch(IOException e){ System.out.println(e);}
    }   
}
