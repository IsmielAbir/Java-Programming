public class generic<X, Y> {
    private X a;
    private Y b;

    public generic(X a, Y b){
        this.a=a;
        this.b=b;
    }

    public X getX(){
        return a;
    }
    public Y getY(){
        return b;
    }
    public void ShowTypes(){
        System.out.println("Types of X: "+ a);
        System.out.println("Types of Y: "+ b);

    }
    
}
