//Develop a Java code to print the name of the running thread
public class running_thread {
    public static void main(String[] args) {
        Thread curr = Thread.currentThread();
        String name = curr.getName();
        System.out.println("Current thread name: " + name);

        Thread thread = new Thread(() -> {
            String new_thread = Thread.currentThread().getName();
            System.out.println("Running thread name: " + new_thread);
            });
        thread.start();
    }
}