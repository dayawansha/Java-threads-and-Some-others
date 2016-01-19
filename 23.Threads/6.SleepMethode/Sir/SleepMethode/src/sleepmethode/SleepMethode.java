package sleepmethode;
class A implements Runnable{
    public void run() {
        for (int x = 1; x < 4; x++) {
            System.out.println("Run by   " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
     }}
    }}
public class SleepMethode {
    public static void main(String[] args) {
         A a = new A();
         Thread one = new Thread(a, "Freed");
         Thread two = new Thread(a, "Lucy");
         //Thread three = new Thread(a, "Richy");
         
         one.start();
         two.start();
        // three.start();        
    }}
