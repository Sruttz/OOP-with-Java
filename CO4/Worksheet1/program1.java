//Create an interface Department containing attributes deptName and deptHead. It also has
// methods for printing the attributes. Create a class hostel containing hostelName,
// hostelLocation and numberOfRooms. The class contains method printing the attributes. Then
// write Student class extending the Hostel class and implementing the Department interface.
// This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write
// suitable printData method for this class. Also, implement the methods of the Department
// interface.
interface Department {
    String getDeptName();
    String getDeptHead();
    default void printDetails() {
        System.out.println("Department Name: " + getDeptName());
        System.out.println("Department Head: " + getDeptHead());
    }
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }
    void printDetail() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regNo;
    String electiveSubject;
    double avgMarks;
    Student(String studentName, int regNo, String electiveSubject,
            double avgMarks, String hostelName, String hostelLocation, int numberOfRooms) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }
    public String getDeptName() {
        return "Computer Science";
    }
    public String getDeptHead() {
        return "Mr. Joey";
    }
    void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printDetail(); // calling superclass method
    }
}

public class program1 {
    public static void main(String[] args) {
        Student s = new Student("Sruthika", 122, "Blockchain", 96.7, "Day_Scholar", "Nyc", 0);
        s.printDetails(); // implementing interface method
        s.printData();
    }
}