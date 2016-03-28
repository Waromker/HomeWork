package com;


import java.util.concurrent.BlockingQueue;

public class QueueIsEmptyTest extends Thread {
    private BlockingQueue queue;

    public QueueIsEmptyTest(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {


            for (int i = 0; i < 20; i++){
            if (queue.isEmpty()){
                System.out.println("This Queue is Empty");
            } else {
                System.out.println("Queue test number is === >" + queue.poll());
            }
                Thread.sleep(400);
            }

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
