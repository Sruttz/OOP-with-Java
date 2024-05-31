//Create thread in the two different ways [extending Thread, implementing Runnable] and
//print a message. Include sleep method in your code.
class ExtendedThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread by extending Thread class is running.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class RunnableThread implements Runnable {
    public void run() {
        try {
            System.out.println("Thread by implementing Runnable interface is running.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class test_two_thread {
    public static void main(String[] args) {
        Thread extendedThread = new ExtendedThread();
        extendedThread.start();
        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();
    }
}