// 1.	Write a java program that finds the factorial of a particular number through recursive function.

package JavaLabReport;

import java.util.Scanner;

public class factorial{

    public long CalculateFactorial(int number){
        if(number == 0 || number ==1)
        return 1;
        else 
        return number * CalculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        factorial obj = new factorial();

        long fact = obj.CalculateFactorial(num);
        System.out.println(num + " Factorial is: " +fact);

        
    }
}