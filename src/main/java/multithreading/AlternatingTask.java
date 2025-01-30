package multithreading;

public class AlternatingTask implements Runnable {
    private final Object monitor = new Object();
    private boolean doASwitch = false;

    @Override
    public void run() {
        printThreadName();
    }

    public void printThreadName() {
        synchronized (monitor) {
            while (true) { // бесконечный цикл
                try {
                    if (!doASwitch) {
                        System.out.println(Thread.currentThread().getName());
                        doASwitch = true;
                        monitor.notify();
                    }
                    else {
                        doASwitch = false;
                        monitor.wait();
                    }
                } catch (InterruptedException | IllegalMonitorStateException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
