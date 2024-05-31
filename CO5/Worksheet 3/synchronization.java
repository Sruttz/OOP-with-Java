// Write a program using synchronization, where use 2 student
// class.(studentA, studentB). These studentA and studentB class has to
// print their teacher names of their courses.(use synchronized courseteacher
// method).

class CourseTeacher {
    private String teacherName;
    public synchronized void printTeacherName(String course, String studentName)
    {
        System.out.println(studentName + " is taking the " + course + " course.");
        System.out.println("The teacher for " + course + " is " + teacherName);
    }
    public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
    }
    }
    
class StudentA extends Thread {
        private CourseTeacher courseTeacher;
        private String course;
        public StudentA(CourseTeacher courseTeacher, String course) {
        this.courseTeacher = courseTeacher;
        this.course = course;
        }

        public void run() {
        courseTeacher.printTeacherName(course, "Ross");
    }
    }
    
class StudentB extends Thread {
        private CourseTeacher courseTeacher;
        private String course;
        public StudentB(CourseTeacher courseTeacher, String course) {
        this.courseTeacher = courseTeacher;
        this.course = course;
        }
        public void run() {
        courseTeacher.printTeacherName(course, "Joey");
    }
}

public class synchronization {
    public static void main(String[] args) 
    {
        CourseTeacher courseTeacher = new CourseTeacher();
        courseTeacher.setTeacherName("Chandler");
        StudentA studentA = new StudentA(courseTeacher, "Design and Analysis of Algorithms");
        StudentB studentB = new StudentB(courseTeacher, "Computer Science");
        studentA.start();
        studentB.start();
    }
}