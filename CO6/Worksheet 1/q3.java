// Print birth date, year, month.
// Input: 26/2/1980

public class q3 {
    public static void main(String[] args)
    {
    String input = "10/09/2007";
    String[] parts = input.split("/");
    String day = parts[0];
    String month = parts[1];
    String year = parts[2];
    System.out.println(day);
    System.out.println(month);
    System.out.println(year);
    }
    }