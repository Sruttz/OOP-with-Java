//Using multiple catch statements perform actions for
// ArrayIndexOutofBoundException, ArithmeticException, NullPointerException,
// NumberFormatException, Exception.
class AgeNotWithinRangeException extends Exception
{
    public AgeNotWithinRangeException (String str)
    {
        super(str);
    }
}
class Student
{
    int rollNo;
    String name;
    int age;
    String course;
    Student(int rollNo,String name,int age,String course)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.course=course;
    }
}

public class statements {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Ross", 20, "History");
        try {
            Student s2 = new Student(199, "chandler", 45, "Maths");
            if (s2.age < 15 || s2.age > 21) {
                throw new AgeNotWithinRangeException("Age not within 15 to 21");
            }
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}