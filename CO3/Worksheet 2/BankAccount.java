//Assume that a bank maintains 2 kinds of Accounts for customers, one class called as savings
// account and other class called as current account. The savings account provides deposit,
// interest and withdrawal facilities. The current account provides deposit, withdrawal facilities
// but no interest. Include necessary methods in order to achieve the following tasks.
// a. Accept deposit from a customer and update the balance for both savings and current
// account
// b. Permit withdrawal and update the balance for both savings and current account
// c. Compute deposit and simple interest for savings account (6%-interest rate)
// d. Display the balance for current and savings account
import java.util.Scanner;
class Customer {
    int acc_no;
    double balance = 10000;
    String name, bank, branch;
    double d_amt, w_amt;
    void display() {
        System.out.println("\n**Customer details\nBank name:" + bank + "\nBranch name:" + branch + "\nAccount number:" + acc_no + "\nName:" + name + "\nInitial Balance:" + balance);
    }
    void deposit() {
        balance += d_amt;
    }
    void withdrawal() {
        balance -= w_amt;
    }
}
class Savings extends Customer {
    void interest() {
        balance += (balance * 6) / 100;
    }
    double display1() {
        System.out.println("\nSavings Account\nBalance after deposit (with interest): " + balance);
        return balance;
    }
}
class Current_Account extends Customer {
    double display2() {
        System.out.println("\nCurrent Account\nBalance after deposit: " + balance);
        return balance;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creating a Savings account object
        Savings s = new Savings();
        System.out.print("Enter the bank name:");
        s.bank = scan.nextLine();
        System.out.print("Enter the branch:");
        s.branch = scan.nextLine();
        System.out.print("Enter your Savings Account number:");
        s.acc_no = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your name:");
        s.name = scan.nextLine();
        System.out.print("Enter the deposit amount:");
        s.d_amt = scan.nextDouble();
        System.out.print("Enter the withdrawal amount:");
        s.w_amt = scan.nextDouble();
        scan.nextLine();
        s.display();
        s.deposit();
        s.interest();
        s.display1();
        s.withdrawal();
        System.out.println("Balance after withdrawal: " + s.balance);
        // Creating a Current Account object
        Current_Account curr = new Current_Account();
        System.out.print("\nEnter the bank name:");
        curr.bank = scan.nextLine();
        System.out.print("Enter the branch:");
        curr.branch = scan.nextLine();
        System.out.print("Enter your Current Account number:");
        curr.acc_no = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your name:");
        curr.name = scan.nextLine();
        System.out.print("Enter the deposit amount:");
        curr.d_amt = scan.nextDouble();
        System.out.print("Enter the withdrawal amount:");
        curr.w_amt = scan.nextDouble();
        curr.display();
        curr.deposit();
        curr.display2();
        curr.withdrawal();
        System.out.println("Balance after withdrawal: " + curr.balance);
        scan.close();
    }
}