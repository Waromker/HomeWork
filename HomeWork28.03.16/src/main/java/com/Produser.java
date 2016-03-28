package com;


import java.util.concurrent.BlockingQueue;

public class Produser extends Thread {
    private int lock = 0;
    private BlockingQueue queue;

    public Produser(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (lock != 1) {
            try {
                for (int i = 0; i < 20; i++) {
                    queue.put(i);
                    Thread.sleep(300);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            lock++;
        }
    }
}
