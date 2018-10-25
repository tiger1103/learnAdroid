package learn.thread.demo;

public class Ticket implements Runnable{
    private int num = 400;
    public void run(){
        while (true){
            synchronized(this) {
                if (num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {

                    }
                    System.out.println(Thread.currentThread().getName() + ".......sale...." + num--);
                }
            }
        }
    }
}
