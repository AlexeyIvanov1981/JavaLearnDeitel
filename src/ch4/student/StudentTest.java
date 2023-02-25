package ch4.student;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("John Doo", 99.9);
        Student student2 = new Student("Bob Snow", 70.2);

        System.out.printf("%s's has grade is: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's has grade is: %s%n", student2.getName(), student2.getLetterGrade());

    }

}
