//Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The
// program shall print &quot;Coza&quot; in place of the numbers which are multiples of 3, &quot;Loza&quot; for multiples of 5, &quot;Woza&quot; for
// multiples of 7, &quot;CozaLoza&quot; for multiples of 3 and 5, and so on. The output shall look like:
public class CozaLoza {
    public static void main(String[] args) {
    int lowerBound = 1;
    int upperBound = 110;
    int numbersPerLine = 11;
    for (int i = lowerBound; i <= upperBound; i++) {
    // Check for multiples of 3, 5, and 7
    if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
    System.out.print("CozaLozaWoza ");
    else if (i % 3 == 0 && i % 5 == 0)
    System.out.print("CozaLoza ");
    else if (i % 3 == 0)
    System.out.print("Coza ");
    else if (i % 5 == 0)
    System.out.print("Loza ");
    else if (i % 7 == 0)
    System.out.print("Woza ");
    else
    System.out.print(i + " ");
    if (i % numbersPerLine == 0)
    System.out.println();
    }
    }
    }