/*9.	Write class Car that has two fields: model that represents the model of the car; and year that represents the year of manufacturing. It has accessor methods and toString method that returns a string representing the information of a car.*/

package JavaLabReport;
public class Car {
    private String model;
    private int year;
    Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString(){
        return "Car model: " + model + " Year: "+ year;
    }
    public static void main(String[] args) {
        Car car = new Car("ford", 2010);
        System.out.println(car.toString());
    }
}
