//3.	Write a java program that checks whether a number is prime or not.

package JavaLabReport;
import java.util.Scanner;
public class prime {

    public boolean checkPrime(int number){
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        prime obj = new prime();

        boolean primeNumber = obj.checkPrime(num);
        if(primeNumber)
        System.out.println(num+" is a Prime number");
        else 
        System.out.println(num + " is not a prime number");
    }
}