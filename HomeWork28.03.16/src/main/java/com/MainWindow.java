package com;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainWindow {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue queue = new ArrayBlockingQueue(1);
        Produser produser = new Produser(queue);
        Cosumer cosumer = new Cosumer(queue);
        QueueIsEmptyTest queueIsEmptyTest = new QueueIsEmptyTest(queue);

        produser.start();
        cosumer.start();
        queueIsEmptyTest.start();

    }
}
