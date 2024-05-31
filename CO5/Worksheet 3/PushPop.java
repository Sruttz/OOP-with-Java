//Write a Java program which handles Push operation and Pop operation on stack concurrently.
import java.util.Stack;
class StackOperations {
private Stack<Integer> stack;
private int maxSize;
private boolean isPushable = true;
public StackOperations(int maxSize) {
    this.maxSize = maxSize;
    stack = new Stack<>();
}
public synchronized void push(int value) {
    while (!isPushable) {
    try {
    wait();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    if (stack.size() < maxSize) {
    stack.push(value);
    System.out.println("Pushed: " + value);
    isPushable = (stack.size() < maxSize);
    notifyAll();
    } else {
    System.out.println("Stack is full. Cannot push " + value);
    }
    }
    public synchronized int pop() {
    while (isPushable && stack.isEmpty()) {
    try {
    wait();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    if (!stack.isEmpty()) {
    int value = stack.pop();
    System.out.println("Popped: " + value);
    isPushable = true;
    notifyAll();
    return value;
    } else {
    System.out.println("Stack is empty. Cannot pop.");
    return -1;
    }
    }
}
class PushOperation implements Runnable {
    private StackOperations stackOps;
    private int value;
    public PushOperation(StackOperations stackOps, int value) {
        this.stackOps = stackOps;
        this.value = value;
    }
    public void run() {
    stackOps.push(value);
    }
}
class PopOperation implements Runnable {
    private StackOperations stackOps;
    public PopOperation(StackOperations stackOps) {
    this.stackOps = stackOps;
    }
    public void run() {
    stackOps.pop();
    }
}
public class PushPop {
public static void main(String[] args) {
    StackOperations stackOps = new StackOperations(5);
    // Push operations
    Thread pushThread1 = new Thread(new PushOperation(stackOps, 10));
    Thread pushThread2 = new Thread(new PushOperation(stackOps, 20));
    Thread pushThread3 = new Thread(new PushOperation(stackOps, 30));
    Thread pushThread4 = new Thread(new PushOperation(stackOps, 40));
    Thread pushThread5 = new Thread(new PushOperation(stackOps, 50));
    Thread pushThread6 = new Thread(new PushOperation(stackOps, 60));
    // Pop operations
    Thread popThread1 = new Thread(new PopOperation(stackOps));
    Thread popThread2 = new Thread(new PopOperation(stackOps));
    Thread popThread3 = new Thread(new PopOperation(stackOps));
    pushThread1.start();
    pushThread2.start();
    pushThread3.start();
    pushThread4.start();
    pushThread5.start();
    pushThread6.start();
    popThread1.start();
    popThread2.start();
    popThread3.start();
}
}