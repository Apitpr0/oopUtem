package student.company;

public class SMPDisplay {
    public static void main(String[] args) {
        // 1. Create a StudentLI object (assuming this is your InternshipStudent)
        InternshipStudent studentLI = new InternshipStudent(78); // Using sample mark 78

        // a. Display student information
        System.out.println("Student Information:");
        System.out.println("-------------------");
        System.out.println("Student Type: Internship Student");
        System.out.println("Current Mark: " + studentLI.getMark());

        // b. Display internship information
        System.out.println("\nInternship Information:");
        System.out.println("-----------------------");
        System.out.println("This student is participating in the internship program");
        System.out.println("Grading follows the internship evaluation criteria");

        // c. Display student's grade
        System.out.println("\nGrade Evaluation:");
        System.out.println("-----------------");
        studentLI.grading();
    }
}