import java.util.*;

class SortingThread implements Runnable {
   private int[] array;

   public SortingThread(int[] array) {
       this.array = array;
   }

   public void run() {
       System.out.println("Sorting Thread: Sorting array...");
       Arrays.sort(array);
       System.out.println("Sorting Thread: Array sorted: " + Arrays.toString(array));
   }
}

class SearchingThread implements Runnable {
   private int[] array;
   private int target;

   public SearchingThread(int[] array, int target) {
       this.array = array;
       this.target = target;
   }

   public void run() {
       System.out.println("Searching Thread: Searching for " + target + " in the array...");
       int index = Arrays.binarySearch(array, target);

       if (index >= 0) {
           System.out.println("Searching Thread: " + target + " found at index " + index);
       } else {
           System.out.println("Searching Thread: " + target + " not found in the array");
       }
   }
}

public class SortSearch {
   public static void main(String[] args) {
       int[] numbers = {12,11,5,4,7,8,2,56,79,16,22,9};
       SortingThread sortingThread = new SortingThread(numbers.clone());
       SearchingThread searchingThread = new SearchingThread(numbers.clone(), 56);
       Thread thread1 = new Thread(sortingThread);
       Thread thread2 = new Thread(searchingThread);
       thread1.start();
       thread2.start();
   }
}
