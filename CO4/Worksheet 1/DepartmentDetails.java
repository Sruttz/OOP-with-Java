//Create an interface
// Department containing attributes deptName and deptHead. It also has 
// methods for printing the attributes. Create a class hostel containing
// hostelName, hostelLocation and numberOfRooms. The class contains method
// printing the attributes. Then write Student class extending the Hostel class
// and implementing the Department interface. This class contains attributes
// studentName, regdNo, electiveSubject and avgMarks. Write suitable printData
// method for this class.  Also, implement
// the  methods of the Department interface.
public class DepartmentDetails {
    public static void main(String[] args) {
        Hostel hostel = new Hostel("A Hostel", "Chennai", 100);
        Student student = new Student("A Hostel", "Chennai", 100,
                "John Doe", 101, "Physics", 85.5);
        hostel.printHostelData();
        student.printData();
        student.printDeptName();
        student.printDeptHead();

    }
}

interface Department {
    public void printDeptName();
    public void printDeptHead();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }
    public void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;
    public Student(String hostelName, String hostelLocation, int numberOfRooms,
                   String studentName, int regdNo, String electiveSubject,
                   double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }
    public void printDeptName() {
        System.out.println("Department Name: Communication");
    }
    public void printDeptHead() {
        System.out.println("Department Head: Mr. Ross");
    }
    public static void main(String[] args) {
        Student s = new Student("A Hostel", "Chennai", 100, "John Doe", 101, "Physics", 85.5);
        s.printHostelData();
        s.printData();
        s.printDeptName();
        s.printDeptHead();
    }
}
