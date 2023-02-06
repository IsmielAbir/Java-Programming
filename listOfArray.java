import java.util.ArrayList;
import java.util.List;

public class listOfArray {
    public static void main(String [] args){
        List<Integer> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        b.add("Ab");
        b.add("sh");
        int d = b.size();
        System.out.println(b+" "+ d);
       

        a.add(10);
        a.add(20);
        System.out.println(a);
        int c = a.get(1);
        System.out.println(c);
}
}
