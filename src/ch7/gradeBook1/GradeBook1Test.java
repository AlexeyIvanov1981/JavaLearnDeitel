package ch7.gradeBook1;

public class GradeBook1Test {
    public static void main(String[] args) {
        int[][] grades = {{87, 96, 70},
                          {68, 87, 90},
                          {94, 100, 90},
                          {100, 81, 82},
                          {83, 65, 85},
                          {78, 87, 65},
                          {85, 75, 83},
                          {91, 94, 100},
                          {76, 72, 84},
                          {87, 93, 73}};
        GradeBook1 gradeBook1 = new GradeBook1("CS101 Introduction to Java Programming", grades);

        System.out.printf("Welcome to the grade book for%n%s%n%n", gradeBook1.getCourseName());
        gradeBook1.processGrades();
    }
}
