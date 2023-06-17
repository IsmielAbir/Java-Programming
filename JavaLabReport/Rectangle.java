/*6.	Design a class named Rectangle to represent a rectangle. The class contains:
●	Two data fields named len and wid that specifies the length and width of the rectangle. The default values are 1 for all the sides.
●	A no-argument constructor that creates the default rectangle.
●	A constructor that creates a rectangle with the specified sides.
●	The getter-setter (accessor /mutator) methods for all the data fields.
●	A method named getArea() that returns the area of the rectangle.
●	A method named getPerimeter() that returns the perimeter.*/

package JavaLabReport;


public class Rectangle {
    private double len;
    private double wid;

    Rectangle(){
        len = 1.0;
        wid = 1.0;
    }
    Rectangle(double len, double wid){
        this.len = len;
        this.wid= wid;
    }
    public double getlen(){
        return len;
    }
    public void setlen(double len){
        this.len = len;
    }

    public double getwid(){
        return wid;
    }
    public void setwid(double wid){
        this.len = wid;
    }
    
    public double getArea(double len, double wid){
        return len*wid;
    }
    public double getPerimeter(double len, double wid){
        return 2*len*wid;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getlen());
        System.out.println(rectangle.getPerimeter(15, 15));
    }
}