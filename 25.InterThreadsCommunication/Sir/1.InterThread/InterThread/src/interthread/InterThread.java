package interthread;
class ThreadX extends Thread{
    int total;
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                total += i;             
            }
            System.out.println("fuck off...");
      ////////////// notify();
    }}}
public class InterThread extends Thread {
    
    public static void main(String[] args) {
       ThreadX b = new ThreadX();
       b.start();
       
       synchronized(b){
         try{
             System.out.println("wait for b to complete...");
             b.wait();
         }catch(InterruptedException e) {  } 
           System.out.println("Total is " + b.total);
       }}}
