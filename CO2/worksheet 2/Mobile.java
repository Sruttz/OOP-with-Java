// Find the following call rates for mobile users
// a. Local call - 10 paisa per call
// b. ISD call – Rs 1.00 per call
// c. Network package cost - 1 GB – Rs 500

// Calculate and produce mobile bill for customer. Use constructor overloading such as Default and arguments constructor.

import java.util.*;

class mobile {
    double local, isd, network;

    mobile() {
        local = 0;
        isd = 0;
        network = 500;
    }

    mobile(double Local, double ISD, double Network) {
        local = Local;
        isd = ISD;
        network = Network;
    }

    void bill(int numLocal, int numISD) {
        System.out.println("Total bill is : " + ((numLocal * local) + (numISD * isd) + network));
    }
}

public class MobileBill {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        mobile obj1 = new mobile(); // Calling the default constructor
        mobile obj2 = new mobile(0.1, 1, 500); // Calling the Parameterized constructor

        System.out.print("Enter number of local calls and number of ISD calls made (obj1) : ");
        obj1.bill(scanner.nextInt(),scanner.nextInt());

        System.out.print("Enter number of local calls and number of ISD calls made (obj2) : ");
        obj2.bill(scanner.nextInt(),scanner.nextInt());

        scanner.close();
    }
}