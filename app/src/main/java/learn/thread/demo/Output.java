package learn.thread.demo;

public class Output implements Runnable {
    Resource r ;
    public Output(Resource r ){
        this.r = r;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if(!r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.name + ".................." + r.sex);
                r.flag=false;
                r.notify();
            }
        }
    }
}
