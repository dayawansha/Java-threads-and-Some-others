package methodeglobleinner2;
import static methodeglobleinner2.Outer.m;

class Outer {
    int x = 10;
    static int y = 20;

    static void m(final int a, int b) {                
         final int p = 5;
         
        class Inner {
            void d() {
                Outer z = new Outer();
                System.out.println(z.x);   // x wa kelinma gatha nohaka........!!!  object akak haraha gatha uthuya....
                
                System.out.println(y);
                System.out.println(a);
         //     System.out.println(b); 
                System.out.println(p);  // p variable aka final viya uthuya...               
            }
        }
        Inner i = new Inner();
        i.d();
    }}
public class MethodeLocalInner2 {

     public static void main(String[] args) {
        // m(1, 2);                  /// //   import kara atha.....!!
        Outer.m(1, 2);                //  compile wey,,,ok................!!!!!
    }   
}
