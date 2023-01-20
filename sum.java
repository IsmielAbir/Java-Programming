import java.util.Scanner;
public class sum{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] a = new int[num];
        int s=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            a[i] = input.nextInt();
            s=s+a[i];
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print("Total Sum is: "+s + "\n");
        System.out.print("Max num is: "+ max + "\n");
    }
}