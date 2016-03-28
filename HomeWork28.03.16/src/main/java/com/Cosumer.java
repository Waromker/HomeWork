package com;


import java.util.concurrent.BlockingQueue;

public class Cosumer extends Thread {
    private BlockingQueue queue;

    public Cosumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {

            for(int i = 0; i < 10; i++) {
                System.out.println(" c == > " + queue.take());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
