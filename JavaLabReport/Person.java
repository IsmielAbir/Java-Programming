/*11.	Create a class named 'Person' having the following members:
●	Class Variable:
1	- Name
2	- Age
3	- Phone number
4	– Institution Name
●	Two classes 'Student’ and 'Teacher' inherit the 'Person' class.
●	The 'Student' and 'Teacher' classes have class variables 'studentId' and 'Designation' respectively. The 'Student' and 'Teacher' classes also have a method/function named ‘printStudent’ and ‘printTeacher’ respectively which prints all the information related with Student and Teacher respectively.
●	Initialize member variables through objects directly from the main class.
●	Call the printStudent and printTeacher methods through respective objects.*/
package JavaLabReport;
public class Person{
    public String name;
    public int age;
    public String phoneNumber;
    public String Institution;
    Person(String name, int age, String phoneNumber, String Institution){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.Institution = Institution;
    }
}
class Student extends Person{
    public String studentId;
    Student(String name, int age, String phoneNumber, String Institution, String studentId){
        super(name, age, phoneNumber, Institution);
        this.studentId = studentId;     
    }
    public void printStudent(){
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Institution Name: " + Institution);
        System.out.println("Student ID: " + studentId);
  }
}
class Teacher extends Person{
    public String designation;
    Teacher(String name, int age, String phoneNumber, String Institution, String designation){
        super(name, age, phoneNumber, Institution);
        this.designation = designation;
    }
    public void printTeacher(){
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Institution Name: " + Institution);
        System.out.println("Designation: " + designation);
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "1234567890", "ABC School", "S001");
        Teacher teacher = new Teacher("Jane Smith", 35, "9876543210", "XYZ University", "Professor");
        student.printStudent();
        System.out.println();
        teacher.printTeacher();
    }
}





   







