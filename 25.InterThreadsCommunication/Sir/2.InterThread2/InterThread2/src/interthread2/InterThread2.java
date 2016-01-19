package interthread2;

class A {}
class B {}

public class InterThread2 {

    public static void main(String[] args) {
        System.out.println("point 1");
        A a = new A();
        B b = new B();
        synchronized (b) {
            try {
                a.wait();        //  b.wait();  yedu wita compile wima sidu wey;
            } catch (InterruptedException e) {  }
        }
        System.out.println("Total is ;");
    }
}
