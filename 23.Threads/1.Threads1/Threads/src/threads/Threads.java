package threads;

class A implements Runnable {

    public void run() {
        System.out.println("run methode");
    }
}

public class Threads {

    public static void main(String[] args) {
        Thread t = new Thread(new A());
        t.start();
      //  Thread a = new Thread();
      //  a.start();
        System.out.println(" main methode ");
    }
}
