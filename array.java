import java.util.Scanner;
public class array{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] a = new int[num];
        for(int i=0;i<num;i++){
            a[i] = input.nextInt();
            System.out.print(a[i]+" ");
        }
    }
}