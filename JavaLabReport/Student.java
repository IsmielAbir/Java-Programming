/*7.	Design a class named Student that contains:
●	Data fields: studentId, studentName, batch, department of the students
●	A method named setStudentInfo() for initializing all data fields.
●	A no-argument constructor that initializes the default fields for a student.
●	The getter-setter (accessor /mutator) methods for all the data fields.
●	A method named printInfo() that print the information contains on the data fields.*/

package JavaLabReport;
public class Student {
    private String studentId;
    private String studentName;
    private int batch;
    private String department;

    Student() {
        studentId = "";
        studentName = "";
        batch = 0;
        department = "";
    }

    public void setStudentInfo(String studentId, String studentName, int batch, String department){
        this.studentId = studentId;
        this.studentName = studentName;
        this.batch = batch;
        this.department = department;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getBatch() {
        return batch;
    }
    public void setBatch(int batch) {
        this.batch = batch;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void printInfo(){
        System.out.println("Student Information:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Batch: " + batch);
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        Student std = new Student();
        std.setStudentInfo("ab", "id", 12, "cs");
        std.printInfo();
    }
}