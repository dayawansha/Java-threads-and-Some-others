package nonargument;

public class NonArgument extends Thread {  
    public void run(){
            System.out.println("run methode");
    }
    public static void main(String[] args) {
        
      NonArgument a = new NonArgument();
       a.start();  
     //  Thread b = new Thread();
    //   b.start();
    }  
}
