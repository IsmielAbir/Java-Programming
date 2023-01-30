public class bmi_a_test {
    public static void main(String[] args) {
        bmi_a BMI = new bmi_a("Ab", 145, 70);
        System.out.println("The bmi for "+ BMI.getName() + " is ("+BMI.getBMI() + ") "+ BMI.bmiStatus());

        overload a = new overload();
        System.out.println("Radius: " + a.getArea(5) + "\nSquare: "+a.getArea(10,20) );
    }
    
}
