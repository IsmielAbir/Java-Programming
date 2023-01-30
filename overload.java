public class overload {
    public double radius, height, width, base;

  

    public double getArea(double radius){
        return 3.141596*radius*radius;
    }
    public double getArea(double height, double width){
        return height*width;
    }


}
