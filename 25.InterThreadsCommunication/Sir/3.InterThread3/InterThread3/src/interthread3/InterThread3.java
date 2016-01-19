package interthread3;
 
class A {}

public class InterThread3 {

    public static void main(String[] args) {
        System.out.println("poit 1");
        A a = new A();
        synchronized (a) {
            try {
                a.wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("poit 2 ");
    }}
