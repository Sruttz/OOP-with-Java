//Construct a program for the following input and output case.
// S1= this is a test. This is a test. This is a test?
public class q1 {
    public static void main (String args [])
    {
    String s1 = "this is a test.This is a test. This is a test ?";
    System.out.println("Length of this string: " + s1.length());
    System.out.println("The character at position 6: " + s1.charAt(6));
    System.out.println("The substring from 26 to 32: " + s1.substring(26,
    32));
    int indexOfA = s1.indexOf('a');
    System.out.println("The index position of first 'a': " + indexOfA);
    int indexOfIBM = s1.indexOf("IBM");
    System.out.println("The index of the beginning of the substring 'IBM': "
    + indexOfIBM);
    }
    }