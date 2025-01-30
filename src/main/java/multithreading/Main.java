package multithreading;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        // Task 1
        for(int i = 0; i < 10; i++) {
            Thread task1Thread =  new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i <= 100; i++) {
                        System.out.println(i + " -> this is " + this.getName());
                    }
                }
            };
            System.out.println(task1Thread.getName() + " is created");
            task1Thread.start();
        }

        // Task 2
        Thread task2Thread = new Thread("Task2Thread") {
            @Override
            public void run() {
                System.out.println("This is a state of Task2Thread AFTER it is started - " + this.getState());
            }
        };
        System.out.println("This is a state of Task2Thread BEFORE it is started - " + task2Thread.getState());
        task2Thread.start();

        // Task 3
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100);

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    /*if (j == 0) {
                        System.out.println(Thread.currentThread().getName() + " has started counting");
                    }*/
                    counter.increment();
                }
                latch.countDown(); // Signal that this thread is done
                // System.out.println(Thread.currentThread().getName() + " has finished counting");
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final count is " + counter.getCount());

        // Task 4
        AlternatingTask task = new AlternatingTask();

        Thread task4Thread1 = new Thread(task, "Task4Thread1");
        Thread task4Thread2 = new Thread(task, "Task4Thread2");

        task4Thread1.start();
        task4Thread2.start();
    }
}
