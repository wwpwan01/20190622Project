package com.wwp;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ReenTranloc.java
 * @Description TODO
 * @createTime 2020年11月10日 12:20:00
 */
public class ReenTrantlock<T> {
    private final LinkedList<T> list = new LinkedList<T>();
    private final int MAX = 10;
    private int count = 0;

    Lock lock = new ReentrantLock();

    Condition condition = lock.newCondition();
    Condition persion = lock.newCondition();

    public synchronized void add(T t) {
        lock.lock();
        try {
            while (list.size() == MAX) {
                condition.await();
            }
            list.add(t);
            ++count;
            persion.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public synchronized T get() {
        T t = null;
        try {
            lock.lock();
            while (list.size() == 0) {
                persion.await();
            }
            t = list.removeFirst();
            count--;
            persion.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return t;
    }

    public static void main(String[] args) {
        Test<String> test = new Test<String>();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    test.add(Thread.currentThread().getName() + " " + j);
                    System.out.println("生产：" + Thread.currentThread().getName() + " " + j);
                }
            }, "c" + i).start();
        }
        /*try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println(test.get());

                }
            }, "P" + i).start();
        }

    }

}
