import java.util.Scanner;;
public class StringPalindrome {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        StringBuffer s1 = new StringBuffer(s);
        String s2 = s1.reverse().toString();
        if(s2.equals(s))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
