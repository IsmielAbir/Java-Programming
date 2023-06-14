//5.	Write a java program to compute the sum of the following sequence:

package JavaLabReport;
import java.util.Scanner;
public class sequence{
   public static void main(String[] args) {
     int sum =0;
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    for(int i=1;i<=num;i++){
        sum+= i*i;
    }
    System.out.println("Sum of the sequence is: " + sum);

}
   }
