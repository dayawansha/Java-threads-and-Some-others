package deadlocks;
public class DeadLocks {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource 2  
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {              //////////   t1 visin resource1 ge lock aka gena yay.
                    System.out.println("Thread 1: locked resource A");
                 
                    synchronized (resource2) {             ///  t1 ta,  resource2 ge lock aka soya gatha nohaka,  because aya tibennet2 gawa nisa.
                        System.out.println("Thread 1: locked resource B");
                    }
                }
            }};
        // t2 tries to lock resource2 then resource 1  
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {    ////////  t2 visin resouce2 ge lock aka gena yay. 
                    System.out.println("Thread 2: locked resource B");
                  
                    synchronized (resource1) {    //t2 ta,  resource1 ge lock aka soya gatha nohaka, because aya tibennet1 gawa nisa.
                        System.out.println("Thread 2: locked resource A");                      
                    }
                }
            }};
        t1.start();   
        t2.start();
    }
}
