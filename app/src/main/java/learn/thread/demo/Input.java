package learn.thread.demo;

public class Input implements Runnable{
    Resource r;
    int x = 0;
    public Input(Resource r){
        this.r = r;
    }
    @Override
    public void run() {
        while (true){
            synchronized (r) {
                if(r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x == 0) {
                    r.name = "张三";
                    r.sex = "男";
                } else {
                    r.name = "lisi";
                    r.sex = "nv";
                }
                r.flag=true;
                r.notify();
            }
            x = (x + 1) % 2;
        }
    }
}
