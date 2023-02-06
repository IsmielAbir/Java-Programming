import java.util.LinkedList;

public class studentclassList {
    public static void main(String[] args) {
        LinkedList<studentclass> list = new LinkedList<>();

        studentclass s = new studentclass(101, "Ab", "11");
        studentclass s1 = new studentclass(102, "Ac", "11");
        studentclass s2 = new studentclass(103, "Ad", "11");
        studentclass s3 = new studentclass(104, "Ae", "11");
        studentclass s4 = new studentclass(105, "Af", "11");
        studentclass s5 = new studentclass(106, "Ag", "11");
        studentclass s6 = new studentclass(107, "Ai", "11");

        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        for(studentclass ss: list){
            System.out.println(ss.id+" "+ ss.name+" "+ ss.c);

        }

       

        
    }
}
