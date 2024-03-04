// A retail store management now wants to provide discount based on following
// scenario. Write a java code to implement the same using class, objects and
// methods.
import java.util.Scanner;
class RetailStore {
    double purchaseAmount;
    double calculateDiscount() {
        if (purchaseAmount >= 1000) {

            return 0.05 * purchaseAmount;
        } else if (purchaseAmount >= 500) {
   
            return 0.02 * purchaseAmount;
        } else if (purchaseAmount > 0) {

            return 0.01 * purchaseAmount;
        } else {

            return 0.0;
        }
    }
}
public class RetailDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RetailStore myStore = new RetailStore();
        System.out.print("Enter the purchase amount: ");
        myStore.purchaseAmount = scanner.nextDouble();
        double discount = myStore.calculateDiscount();
        System.out.println("The discount on the purchase is: " + discount);
        scanner.close();
    }
}