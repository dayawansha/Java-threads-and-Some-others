package methodeglocalinnercls;
class Outer {
    int x = 10;
    static int y = 20;

     void m(final int a, int b) {   
        final int p = 5;
        
        class Inner { 

            void d() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(a);
         //     System.out.println(b); 
                System.out.println(p);      // p variable aka final viya uthuya...
            }
        }
        Inner i = new Inner();
        i.d();
    }}
public class MethodeLocalInnerCls {

   public static void main(String[] args) { 
       Outer t = new Outer();
       t.m(1, 2);
    }   
}
