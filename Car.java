public class Car extends Vehical {
    int a;

    Car(String s, int n, int a){
        super(s,n);
        this.a=a;
    }

    @Override
    void printValue(){
        System.out.println(s+" "+n+" "+ a);
    }

}
