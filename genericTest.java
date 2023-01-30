public class genericTest {
    public static void main(String [] args){
        generic<String, String> input = new generic<String,String>("Ab","Sh");
        input.ShowTypes();
        generic<String, Integer> person = new generic<String,Integer>("SH", 45);
        person.ShowTypes();
    }
}
