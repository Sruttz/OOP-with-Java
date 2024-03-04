//Define a class which contains method “DisplayColor” which takes one character
// as argument. Raise an exception, if the character is not an alphabet. If the alphabet
// is a color of the rainbow, display the color name. If it is any other alphabet, report
// an exception.
import java.util.Scanner;

public class color_display {
    public void DisplayColor(char ch) {
        switch(ch) {
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
            case 'O':
            case 'o':
                System.out.println("Orange");
                break;
            case 'Y':
            case 'y':
                System.out.println("Yellow");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;
            case 'B':
            case 'b':
                System.out.println("Blue");
                break;
            case 'I':
            case 'i':
                System.out.println("Indigo");
                break;
            case 'V':
            case 'v':
                System.out.println("Violet");
                break;
            default:
                throw new IllegalArgumentException("Invalid character");
        }
    }

    public static void main(String[] args) {
        color_display cd = new color_display();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character representing a color: ");
        char ch = scan.nextLine().charAt(0);
        cd.DisplayColor(ch);
        scan.close();
    }
}