import java.util.Scanner;
public class BMI{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilogram: ");
        float weight = input.nextFloat();
        System.out.print("Enter your height in meter: ");
        float height = input.nextFloat();

        float bmi = weight / (height*height);
        System.out.print("Your BMI is: ");

        System.out.print(bmi);


    }
}