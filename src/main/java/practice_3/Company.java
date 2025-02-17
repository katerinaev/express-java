package practice_3;

public class Company {
    static String companyName = "Universe";

    final int employeeID;
    private String employeeName;

   Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public void printEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID + " Employee Name: " + employeeName +
                " Company: " + companyName);
    }
}
