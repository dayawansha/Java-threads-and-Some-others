package ststicinnercls;
class Outer {
    private int x = 10;
    static int y = 20;

    static class Inner {

        void m() {
            System.out.println( new Outer().x );
            System.out.println( y );
        }
        static void d() {
            System.out.println(" ????????? ");
        }
    }}
public class StsticInnerCls {

     public static void main(String[] args) {
         Outer.Inner a = new Outer.Inner();
         a.m();
         
         Outer.Inner.d();
     }}
