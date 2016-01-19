package threadx;

class ThreadA extends Thread{
  int total;
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                total += i;
            }
            System.out.println("fuck off.....");
         notifyAll();
        }}}
class Reader extends Thread {
    ThreadA c;
    public Reader(ThreadA a) {
        c = a;
    }
    public void run() {
        synchronized ( c ) {
            try {
                System.out.println("wait for calculation ");
                c.wait();
            } catch (InterruptedException e) {  }
            System.out.println("Total is " + c.total);
        }
    }}
public class ThreadX {

    public static void main(String[] args) {
        ThreadA b = new ThreadA();
        
       Reader c = new Reader(b);
       c.start();
       b.start();
        
     /*   Reader d = new Reader(b);
        d.start();
        
        Reader e =  new Reader(b);
        e.start();*/
        
     //  b.start();
    }
    
}
