package CO5.Exceptions;
// Write a Java Program to Handle the User Defined Exception Using Throw
// Keyword. Create a class Student with attributes roll no, name, age and course.
// Initialize values through parameterized constructor. If age of student is not in
// between 15 and 21 then generate user-defined exception
// “AgeNotWithinRangeException”.
public class student {
    public static void main(String[]args)
    {
        try{
            int[] myArray= new int[5];
            myArray[10]=70;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error occurred");
        }
        try{
            int x=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error occurred");
        }
        try{
            String s=null;
            s.length();
        }
        catch(NullPointerException e){
            System.out.println("Null pointer error occurred");
        }
        try{
            int num= Integer.parseInt("abc");
        }
        catch(NumberFormatException e){
            System.out.println("Number format error occurred");
        }
        try{
            float x=1.0f/0;
        }
        catch(Exception e){
            System.out.println("Some other exception occurred");
        }
    }
}
