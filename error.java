public class error {
    public static void main(String [] args){
        int a = 5,r;
        try{
             r = a/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }
    }
    
}
