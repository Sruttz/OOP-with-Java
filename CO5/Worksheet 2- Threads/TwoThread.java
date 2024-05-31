class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TwoThread {
    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();
        Thread t2 = new Thread(o);
        Thread t1 = new Thread(e);
        t2.start();
        t1.start();
    }
}