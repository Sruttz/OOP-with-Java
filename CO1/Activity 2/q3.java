//This example displays the first 50 prime numbers in five lines, each of which contains
// 10 numbers. An integer greater than 1 is prime if its only positive divisor is 1 or itself.
// For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
// The problem can be broken into the following tasks:
// • For number = 2, 3, 4, 5, 6, ..., test whether the number is prime.
// • Determine whether a given number is prime.
// • Count the prime numbers.
// • Print each prime number, and print 10 numbers per line.
public class q3 {
    public static void main(String[] args) {
        final int LIMIT = 50;
        final int NUMS_PER_LINE = 10;
        int count=0;
        int num=2;
        System.out.println("The first 50 prime numbers are:");
        while (count<LIMIT) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
                if (count % NUMS_PER_LINE == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }
}