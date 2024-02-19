
package mystudent;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Hello from class App \n\n");

        // Create student objects
        Student myStudent1 = new Student();


        myStudent1.firstName = "Susie";
        myStudent1.lastname = "Q";
        myStudent1.age = 19;
        myStudent1.idNumber = 1234567;
        myStudent1.gpa = 3.9;
        myStudent1.major = "Computer Science";
        myStudent1.city = "Miami";
        myStudent1.state = "FL";
        myStudent1.year = "Freshman";

        Student myStudent2 = new Student();
        myStudent2.firstName = "Lucy S.";
        myStudent2.lastname = "Diamond";
        myStudent2.age = 47;
        myStudent2.idNumber = 9876543;
        myStudent2.gpa = 3.2;
        myStudent2.major = "Nursing";
        myStudent2.city = "San Jose";
        myStudent2.state = "CA";
        myStudent2.year = "Junior";

        // Create student objects from CODE 2
        Student myStudent3 = new Student();
        myStudent3.firstName = "Bob";
        myStudent3.lastname = "Dylan";
        myStudent3.major = "Art";
        myStudent3.gpa = 3.0;
        myStudent3.age = 32;

        Student myStudent4 = new Student();
        myStudent4.firstName = "David";
        myStudent4.lastname = "Bowie";
        myStudent4.major = "Music";
        myStudent4.gpa = 2.5;
        myStudent4.age = 25;

        // Output profiles of all students
        profile(myStudent1);
        profile(myStudent2);
        profile(myStudent3);
        profile(myStudent4);
    }

    public static int profile(Student student) {
        System.out.println("First name of student: " + student.firstName);
        System.out.println("Last name of student: " + student.lastname);
        System.out.println("Age: " + student.age);
        System.out.println("ID: " + student.idNumber);
        System.out.println("Major: " + student.major);
        System.out.println("City: " + student.city);
        System.out.println("State: " + student.state);
        System.out.println("year: " + student.year);
        System.out.println("GPA: " + student.gpa);
        System.out.println("====================================================");
        return 0;
    }
}
