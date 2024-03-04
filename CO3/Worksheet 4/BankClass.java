//2.Create an abstract class &#39;Bank&#39; with an abstract method &#39;getBalance&#39;.
// $100, $150 and $200 are deposited in banks A, B and C respectively.
// &#39;BankA&#39;, &#39;BankB&#39; and &#39;BankC&#39; are subclasses of class &#39;Bank&#39;, each
// having a method named &#39;getBalance&#39;. Call this method by creating an
// object of each of the three classes.
public class BankClass {
    public static void main(String[] args) {
        BankA a = new BankA();
        System.out.println(a.getBalance());

        BankB b = new BankB();
        System.out.println(b.getBalance());

        BankC c = new BankC();
        System.out.println(c.getBalance());
    }
}

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int balance = 100;

    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    int balance = 150;

    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    int balance = 200;

    int getBalance() {
        return balance;
    }
}
