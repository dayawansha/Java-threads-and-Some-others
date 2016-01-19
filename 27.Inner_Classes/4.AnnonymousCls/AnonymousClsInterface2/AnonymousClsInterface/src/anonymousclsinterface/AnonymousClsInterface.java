package anonymousclsinterface;
interface Inner {
    void e();
}
class A {
    void m( Inner x ){
        System.out.println("A class m methode ");
}}

public class AnonymousClsInterface {
    public static void main(String[] args) {
        
        A a = new A();
        
        a.m(  /*start anonymous */new Inner() {
               public void e() {              ///   mehidi inner interface aka overide kara atha         
                System.out.println("aaaaaa");
            }
        } /*end anonymous*/  ); //   <----- end methode declaretion 
      
}}
