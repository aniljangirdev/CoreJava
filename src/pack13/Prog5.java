package pack13;

import Utils.DateTimeUtil;

import java.util.TreeMap;
import java.util.concurrent.*;

public class Prog5 {
    //    private static final ThreadLocal<Integer> result = ThreadLocal.withInitial(() -> 0);
    protected static int result;

    private static final Object LOCK = new Object();


    public static void main(String[] args) {

//        DateTimeUtil.startTime();
//        usingThread();
//        DateTimeUtil.endTime();

//        usingThreadPool();
        callFeature();
    }

    private static void increment() {
        synchronized (LOCK) {
            result += 1;
        }
    }

    private static void usingThreadPool(){
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 25000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 25000; i < 50000; i++) {
                increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 50000; i < 75000; i++) {
                increment();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 75000; i <= 100000; i++) {
                increment();
            }
        });
//
//        int totalCore = Runtime.getRuntime().availableProcessors();
//        System.out.println(totalCore);
//        ExecutorService executorService = Executors.newFixedThreadPool(totalCore);
//        executorService.execute(t1);
//        executorService.execute(t2);
//        executorService.execute(t3);
//        executorService.execute(t4);
//
//        System.out.println(result);



    }

    private static void callFeature(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> submit = executorService.submit(() -> {
            Thread.sleep(5000);
            return 10;
        });

        try {
            System.out.println(submit.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private static void usingThread(){
        // should be correct result values
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 25000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 25000; i < 50000; i++) {
                increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 50000; i < 75000; i++) {
                increment();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 75000; i <= 100000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();

            System.out.println("result: " + result);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
