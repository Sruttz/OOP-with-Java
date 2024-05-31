//Create two threads with one thread for sorting and another thread for searching a number use join().
import java.util.Arrays;
class SortThread extends Thread {
    int[] array;
    SortThread(int[] array) {
        this.array = array;
    }
    public void run() {
        Arrays.sort(array);
        System.out.println("Array sorted: " + Arrays.toString(array));
    }
}

class SearchThread extends Thread {
    int[] array;
    int target;
    SearchThread(int[] array, int target) {
        this.array = array;
        this.target = target;
    }
    public void run() {
        int index = Arrays.binarySearch(array, target);
        if (index >= 0) {
            System.out.println("Number " + target + " found at index " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

public static class SortSearch{
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6, 3, 9, 4, 7};
        int targetNumber = 6;
        SortThread sortThread = new SortThread(numbers);
        SearchThread searchThread = new SearchThread(numbers, targetNumber);
        sortThread.start();
        try {
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchThread.start();
        }
    }
}