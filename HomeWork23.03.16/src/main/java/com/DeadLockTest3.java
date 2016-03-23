package com;

public class DeadLockTest3 {
    private static Object object1 = new Object();
    private static Object object2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        MyThreadFirst myThreadFirst = new MyThreadFirst();
        MyThreadSecond myThreadSecond = new MyThreadSecond();


        myThreadFirst.start();
        myThreadSecond.start();
    }

    static class MyThreadFirst extends Thread {
        public void run() {
            try {
                System.out.println("Try to hold object 1");
                synchronized (object1) {
                  // Thread.sleep(1000);

                    System.out.println("Try to hold object 2");

                    synchronized (object2) {
                        System.out.println("Inside object2");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class MyThreadSecond extends Thread {
        public void run() {
            try {
                System.out.println("Try to hold object 2");
                synchronized (object2) {
                  //  Thread.sleep(1000);

                    System.out.println("Try to hold object 1");

                    synchronized (object1) {
                        System.out.println("Inside object1");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}

