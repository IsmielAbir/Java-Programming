public class tryCatch {

   
public static void main(String [] args){
int a=1, b=0,d=0;


    try{
        d = divide(a,b);
    }
    catch(ArithmeticException e){
        System.out.println("Error");

    }
    System.out.println(d);
    
    
    
}
private static int divide(int a, int b){
    return a/b;
}
    
}

