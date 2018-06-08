package com.demo.y.product_consumer;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo02 {

    private int queueSize = 10;
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    public static void main(String[] args) {
        Demo02 d = new Demo02();
        new Thread(d.new ProductDemo02()).start();
        new Thread(d.new ConsumerDemo02()).start();
    }

    class ConsumerDemo02 implements  Runnable{

        @Override
        public void run() {
            consumer();
        }

        public void consumer(){
            while(true){
                try {
                    queue.take();
                    System.out.println("从队列取走一个元素，队列剩余"+queue.size()+"个元素");
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }

    class ProductDemo02 implements  Runnable{

        @Override
        public void run() {
            product();
        }

        public void product(){
            while(true){
                try {
                    queue.put(1);
                    System.out.println("从队列取走一个元素，队列剩余"+queue.size()+"个元素");
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }
}
