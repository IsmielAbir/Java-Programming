import java.util.Scanner;
public class area{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double traingle = 0.5*a*b;
        double circle = 3.141596*a*a;

        System.out.print("Area of Traingle: "+traingle);
        System.out.print("\nArea of Circle: "+circle);

    }
}