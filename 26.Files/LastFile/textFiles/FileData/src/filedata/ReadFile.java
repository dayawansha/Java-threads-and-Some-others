package filedata;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFile {

    private String path;

    public ReadFile(String file_path) {
        path = file_path;
    }

    public String[] openFile(int x) throws IOException {
        String line = null;

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        
        String[] textData = new String[x];

        for (int i = 0; i < x; i++) {
            textData[i] = textReader.readLine();
        }

        while ((line = textReader.readLine()) != null) {
            System.out.println(line);
        }
        textReader.close();
        return textData;
    }

    int readLines1() throws IOException {

        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        String aLine;
        int numberOfLines = 0;

        while ((aLine = bf.readLine()) != null) {
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }

    private static String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String file_name1 = "C:/1 V00654.txt";
        try {

            ReadFile file1 = new ReadFile(file_name1);
            String[] arayLines1 = file1.openFile(file1.readLines1());
            String x = convertStringArrayToString(arayLines1);
            System.out.println(x);
            
         /*   for (int i = 0; i < arayLines1.length; i++) {
                System.out.println(arayLines1[i]);
            }*/
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

/* try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String file_name1 = "C:/1 V00654.txt";
        String file_name2 = "C:/2 X61145.txt";
        
        ReadFile file1 = new ReadFile(file_name1);
        ReadFile file2 = new ReadFile(file_name2);
        
        String[] arayLines1 = file1.openFile(file1.readLines1());
        String[] arayLines2 = file1.openFile(file2.readLines1());
        
        String str1 = br.readLine();
 
         
        String str2 = br.readLine();
 
        LongestCommonSubsequence obj = new LongestCommonSubsequence(); 
        String result = obj.lcs(str1, str2);
        System.out.println("\nLongest Common Subsequence : "+ result);
        
        
        }catch(IOException e) {  System.out.println(e);}*/
