package joinmethode;

class A implements Runnable{
    public void run(){
        System.out.println("Run methode");
    }
}
public class JoinMethode {
    
 public static void main(String[] args) {
       System.out.println("before join");  
       Thread t = new Thread(new A());
       t.start();
       try{
       t.join();
       }catch(InterruptedException r){}
       System.out.println("after joining");
    }    
}
