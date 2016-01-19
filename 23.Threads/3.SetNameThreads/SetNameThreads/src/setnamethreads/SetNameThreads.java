package setnamethreads;

class A implements Runnable {

    public void run() {
        System.out.println("run methode");
    }
}
public class SetNameThreads {

    public static void main(String[] args) {
        Thread a = new Thread( new A() ,"thread1") ;
     //   a.run();
       a.start();
        System.out.println(a.getName() );
        a.setName("new  name of thread1 ");
        System.out.println( a.getName() );
    }    
}
