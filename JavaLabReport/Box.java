/*8.	Design a class named Box to represent a box. The class contains:
●	Three data fields named width, height and depth that specifies the width, height and depth of a box. The default values are -1 for all the sides.
●	A no-argument constructor that creates the default box.
●	A constructor that creates a box with the specified sides.
●	The getter-setter (accessor /mutator) methods for all the data fields.
●	A method named getVolume() that returns the volume of the box.
●	A method named getSurfaceArea() that returns the surface areas of the box.*/

package JavaLabReport;
public class Box {
    private double width;
    private double height;
    private double depth;

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double getwidth(){
        return width;
    }
    public void setwidth(double width){
        this.width = width;
    }
    public double getheight(){
        return height;
    }
    public void setheight(double height){
        this.height = height;
    }
    public double getdepth(){
        return depth;
    }
    public void setdepth(double depth){
        this.depth = depth;
    }
    public double getVolume(double width, double height, double depth){
             return width * height * depth;
    }
    public double getSurfaceArea(double width, double height, double depth){
            return 2 * ((width * height) + (height * depth) + (depth * width));
    }  
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.getVolume(10, 10, 10));
    }
}
