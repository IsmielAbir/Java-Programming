import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort {
    public static void main(String [] args){
       ArrayList<Integer> num = new ArrayList<>();
       num.add(10);
       num.add(5);
       num.add(45);
       num.add(9);
       num.add(40);
       num.add(560);
       num.add(49);

       System.out.println(num);
       Collections.sort(num);
       System.out.println("Sorting in Assending Order: "+num);

    }
    
}
