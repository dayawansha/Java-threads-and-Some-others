package yieldmethode;

class A extends Thread{
    public void run(){
        System.out.print("A");
        System.out.print("A");
        Thread.yield();
        System.out.print("A");
    }}
class B extends Thread{
    public void run(){
        System.out.print("B");
        System.out.print("B");
     //   Thread.yield();
        System.out.print("B");
    }}
public class YieldMethode {
 public static void main(String[] args) {      
     A a = new A();
     B b = new B();
 //  A c = new A();
       
     a.start();
 //  Thread.yield();
     b.start();
   //  Thread.yield();
     System.out.print("C");
//   Thread.yield();
           
    }   
}
