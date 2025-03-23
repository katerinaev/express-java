package practice_3;

public class University {
    static String universityName = "Académie des Beaux-Arts";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("StudentID: " + studentID + ", Student Name: " +
                studentName + ", University: " + universityName);
    }
}