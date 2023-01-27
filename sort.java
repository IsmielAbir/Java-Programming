import java.util.Scanner;
import java.util.Arrays;
public class sort {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] a = new int[num];
        for(int i=0;i<num;i++){
            a[i] = input.nextInt();
            //Arrays.sort(a);
            System.out.println(a[i]);
        }
        for(int i=0;i<num;i++){
            Arrays.sort(a);
            System.out.print(" "+a[i]);

        }
    }
    
}