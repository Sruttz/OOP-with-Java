//Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
import java.util.ArrayList;
class thread_1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class thread_2 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}
public class Welcome {
    public static void main(String[] args) {
        thread_1 t1= new thread_1();
        thread_2 t2= new thread_2();
        t1.start();
        t2.start();
    }
}