package yieildmethode2;
class Producer extends Thread {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("I am Producer : Produced Item " + i);
            Thread.yield();
        } }}
class Consumer extends Thread {
    public void run() {
        for (int i = 20; i < 24; i++) {
            System.out.println("I am Consumer : Consumed Item " + i);
            Thread.yield();
        } }}
public class YieildMethode2 {
    public static void main(String[] args) {
        Thread p = new Producer();
        Thread c = new Consumer();

        p.setPriority(Thread.MIN_PRIORITY); //Min Priority
        c.setPriority(Thread.MAX_PRIORITY); //Max Priority

        p.start();
        c.start();
    }}
