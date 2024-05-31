//  Create two threads and print even numbers with one thread and odd numbers with another thread.
class EvenThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 }
 
 class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
 
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 }
 
 public class EvenOddThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);
        thread1.start();
        thread2.start();
    }
 }
 