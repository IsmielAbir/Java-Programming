import java.util.Scanner;
public class multiplication {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number that you want to multiplication: ");
        int num = input.nextInt();
        int c=0;
        while(c<=10){
            System.out.println(num + " X " + c + " = " + num*c);
            c++;
        }
    }
    
}
