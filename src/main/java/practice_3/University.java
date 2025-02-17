package practice_3;

public class University {
    static String universityName = "Académie des Beaux-Arts";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("StudentID: " + studentID + ", Student Name: " +
                studentName + ", University: " + universityName);
    }

    public static void main(String[] args) {
        University stud1 = new University(1010, "Van Gogh");
        University stud2 = new University(1011, "Paul Gauguin");
        University stud3 = new University(1012, "Claude Monet");

        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();

        University.changeUniversityName("Paris College of Art");

        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();
    }
}