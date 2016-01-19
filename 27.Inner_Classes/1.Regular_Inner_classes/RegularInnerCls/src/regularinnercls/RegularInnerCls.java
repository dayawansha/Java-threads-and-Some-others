package regularinnercls;

class  OuterA{
    private int x = 1 ;
    static int y = 20 ;

    class InnerA{
    void m(){
        System.out.println(x);
         System.out.println(y);
}
}
}

public class RegularInnerCls {

    
    public static void main(String[] args) {
        
        OuterA a = new OuterA();
        OuterA.InnerA x = a.new InnerA();
        x.m();
    }   
}
