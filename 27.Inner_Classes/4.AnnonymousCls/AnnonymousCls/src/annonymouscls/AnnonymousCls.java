package annonymouscls;

class A {

    void m() {
        System.out.println("A class m methode");
    }   
    void n(){}
}
public class AnnonymousCls {

    public static void main(String[] args) {
        A a = new A() {
            void m() {
                System.out.println("anonymous class ");
            }
            public void d() {
                System.out.println("d methode ");
            }
          
        };
        a.m();
    //    a.d();  compile error
    }}
