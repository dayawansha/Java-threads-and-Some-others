package threadpriority;

public class ThreadPriority {

      public static void main(String[] args) {
          Thread t1 = new Thread();
          Thread t2 = new Thread();
          t1.setPriority(3);
          t2.setPriority(8);
          System.out.println(t1.getPriority());
          System.out.println(t2.getPriority());
    }    
}
