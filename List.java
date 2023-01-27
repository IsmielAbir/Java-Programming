import java.util.ArrayList;
public class List {
    public static void main(String [] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(2, 50);

        System.out.println(number);
        //number.remove(0);

        int c =number.indexOf(40);
        System.out.println(c);

    }
}