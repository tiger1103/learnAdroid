package com.example.administrator.myapplication;

import android.provider.Settings;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import learn.functionInterface.demo.Book2;
import learn.functionInterface.demo.Message;
import learn.functionInterface.demo.Message2;
import learn.thread.demo.Input;
import learn.thread.demo.Output;
import learn.thread.demo.Resource;
import learn.thread.demo.Ticket;

public class DemoTest {
    @Test
    public void saleTicketTest(){
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        CountDownLatch c =  new CountDownLatch(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void resourceDemoTest(){
        //创建资源
        Resource r = new Resource();
        Input i = new Input(r);
        Output o = new Output(r);
        Thread t1 = new Thread(i);
        Thread t2 = new Thread(o);
        CountDownLatch c =  new CountDownLatch(2);
        t1.start();
        t2.start();
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void functionInterface(){
        /*Message msg = ()->"hello world";
        System.out.println(msg.getInfo());
        msg.print();
        Message.fun();*/

        //引用构造方法
        /*Message2 msg = Book2::new;
        System.out.println(msg.getClass());
        msg.getInfo();*/

        //引用静态方法
    }
}
