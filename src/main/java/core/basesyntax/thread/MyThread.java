package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(99);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
