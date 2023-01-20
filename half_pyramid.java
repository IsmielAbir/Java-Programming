import java.util.Scanner;
public class half_pyramid {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your number: ");
        int a = input.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
