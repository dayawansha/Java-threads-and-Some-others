package creatdirectory;
import java.io.File;
import java.io.PrintWriter;

public class WriteData {
   
    public static void main(String[] args) {
     try{
     
         File ff = new File("MyFile");
         PrintWriter ppp = new PrintWriter(ff);
         ppp.println("sssssssssssseeeeeeeee");
         ppp.print(true);
         ppp.println((int) 123);
         ppp.print((float) 123.456);       
         
        //   formatinggggggg............................!!!!!!!!

         String heading1 = "Exam_name ";
         String heading2 = "Exam_grade ";

         String course1 = "java";
         String grade1 = "A";

         String course2 = "PHP";
         String grade2 = "B";

         System.out.println(" ");
         System.out.printf("%-15s %15s %n", heading1, heading2);
         System.out.println("-------------------------------");

         System.out.printf("%-15s %9s %n", course1, grade1);
         System.out.printf("%-15s %9s %n", course2, grade2);
         
         ppp.flush();
         ppp.close();
     }catch(Exception e) {   } 
    }    
}
