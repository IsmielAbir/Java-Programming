import java.util.Scanner;
public class percent {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double a = input.nextDouble();
        double b = (a/100);
        double c = b * 1.85;
        System.out.print(c);

    }
    
}
