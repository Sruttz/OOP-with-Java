//Use nested loops to print the following output:
//     1
//    212
//   32123
//  4321234
// 543212345

// Your program prints five lines. Each line consists of three parts. The first part comprises the spaces before the numbers; the second part, the leading numbers, such as 3 2 1 on line 3; and the last part, the ending numbers, such as 2 3 on line 3.
public class q2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++) {
            for (int j=n;j>=1;j--) {
                if (j<=i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int k=2;k<=i;k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    } 
}