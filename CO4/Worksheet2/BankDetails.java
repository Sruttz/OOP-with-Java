//Create a class Bank and define final method to display fixed loan amount of
// Rs.1500000 of personal loan and implement various methods to display various loan
// schemes.
class Bank {
   final void displayPersonalLoan() {
       System.out.println("Fixed loan amount of Rs. 15,00,000 for personal loan.");
   }

   void displayLoanSchemes(int age) {
       if (age <= 25)
           System.out.println("Eligible for education loan of Rs. 10,00,000.");
       else if (age <= 45)
           displayPersonalLoan();
       else if (age <= 60)
           System.out.println("Eligible for house loan of Rs. 20,00,000.");
       else
           System.out.println("Sorry, no loan schemes available for age above 60.");
   }
}
public class BankDetails {
   public static void main(String[] args) {
       Bank b = new Bank();

       b.displayLoanSchemes(11);
       b.displayLoanSchemes(25);
       b.displayLoanSchemes(40);
       b.displayLoanSchemes(82);
   }
}
