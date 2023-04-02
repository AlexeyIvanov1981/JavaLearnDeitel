package ch7.gradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = { 60, 70, 85, 65, 91, 50, 79, 55, 54, 60, 87, 68, 94, 100, 83, 78, 85, 91, 76, 87,
                60, 70, 85, 65, 91, 50, 79, 55, 54, 60, 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", gradeBook.getCourseName());

        gradeBook.processGrades();

    }
}
