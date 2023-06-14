//2.	Write a java program that checks whether a number is palindrome or not.

package JavaLabReport;

import java.util.Scanner;

public class palindrome {

    public boolean checkPalindrome(int number){
        int orginalNum = number;
        int r=0;
        while(number!=0){
            int a = number%10;
            r = r*10 + a;
            number/=10;
        }
        return orginalNum == r;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        palindrome obj = new palindrome();

        boolean palindromeNumber = obj.checkPalindrome(num);
        if(palindromeNumber)
        System.out.println(num +" is a palindrome number");
        else
        System.out.println(num + " is not a palindrome number");

    }
}
