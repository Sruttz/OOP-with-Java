//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. (using switch case)
import java.util.Scanner;
public class w3q2 {
    public static void main(String[] args){
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7: ");
        int week= myObj3.nextInt();
        System.out.println(getDayName(week));
        myObj3.close();
    }

    public static String getDayName(int day){
        String dayName = "";
        switch (day) {
            case 1: dayName="Sunday"; break;
            case 2: dayName="Monday"; break;
            case 3: dayName="Tuesday"; break;
            case 4: dayName="Wednesday"; break;
            case 5: dayName="Thursday"; break;
            case 6: dayName="Friday"; break;
            case 7: dayName="Saturday"; break;
            default:dayName="Invalid day range";
        }
        return dayName;
    }
}
