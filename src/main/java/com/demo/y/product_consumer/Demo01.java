package com.demo.y.product_consumer;

import java.util.PriorityQueue;

public class Demo01 {

    private  int queueSize = 10;
    private  PriorityQueue<Integer> queue = new PriorityQueue<Integer>(queueSize);

    public static void main(String[] args) {
        Demo01 d = new Demo01();

        ConsumerDemo01 consumer = d.new ConsumerDemo01();
        ProducDemo01 product = d.new ProducDemo01();
        consumer.start();
        product.start();
    }

    class ConsumerDemo01 extends Thread {
        @Override
        public void run() {
            consum();
        }

        public void consum() {
            while (true) {
                synchronized (queue) {
                    try {
                        while (queue.size() == 0) {
                            System.out.println("队列空，等待数据");
                            queue.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        queue.notify();
                    }
                    queue.poll();
                    queue.notify();
                    System.out.println("从队列取走一个元素，队列剩余" + queue.size() + "个元素");
                }
            }
        }
    }

    class ProducDemo01 extends Thread {
        @Override
        public void run() {
            product();
        }

        public void product() {
            while (true) {
                synchronized (queue) {
                    try {
                        while (queue.size() == queueSize) {
                            queue.wait();
                            System.out.println("从队列取走一个元素，队列剩余" + queue.size() + "个元素");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        queue.notify();
                    }
                    queue.offer(1);
                    queue.notify();
                    System.out.println("向队列取中插入一个元素，队列剩余空间：" + (queueSize - queue.size()));
                }
            }
        }
    }
}


