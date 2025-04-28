package student.company;
/**
 * This class is the one that determines the grade
 * that the students will get according to their marks
 * @author Muhammad Afiq Muhaimin
 */
public class InternshipStudent extends Student {
    private int mark;  // Field to store the student's mark

    // Constructor
    public InternshipStudent(int mark) {
        this.mark = mark;
    }

    // Getter for mark
    public int getMark() {
        return mark;
    }

    // Setter for mark
    public void setMark(int mark) {
        this.mark = mark;
    }

    //If-Else statement to determine grade
    public void grading() {
        char grade;

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Student's grade: " + grade);
    }
}
