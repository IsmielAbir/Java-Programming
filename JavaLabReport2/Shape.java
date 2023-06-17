/*12.	Design a class named Shape and its two subclasses named Rectangle and Square. The Shape class has 2 fields named side1 and side2 which represents the length and width of any shape. All the subclasses have two methods named calculateArea() and
calculatePerimeter() which returns the area and perimeter of a shape.*/

package JavaLabReport2;
public class Shape{
    double side1;
    double side2;
    Shape(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
}
class Rectangle extends Shape{
    Rectangle(double side1, double side2){
        super(side1, side2);
    }
    public double calculateArea(double side1, double side2){
        return side1*side2;
    }
    public double calculatePerimeter(double side1, double side2){
        return 2*side1*side2;
    }
     public String toString() {
        return "Rectangle [side1=" + side1 + ", side2=" + side2 + "]";
    }
}
class Square extends Shape{
    Square(double side1, double side2){
        super(side1, side2);
    }

    public double calculateArea(double side1, double side2){
        return side1*side2;
    }
    public double calculatePerimeter(double side1, double side2){
        return 4*side1*side2;
    }
     public String toString() {
        return "Square [side1=" + side1 + ", side2=" + side2 + "]";
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(15, 25);
        System.out.println(rec.calculateArea(15, 24));
        Square sq = new Square(15, 15);
        System.out.println(sq);
        System.out.println(sq.calculateArea(15.15, 15));
    }
}