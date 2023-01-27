public class client{
    String name;
    int hoursWorked;

    client(String name, int hoursWorked){
        this.name = name;
        this.hoursWorked= hoursWorked;
    }

    public int getHours(){
        return hoursWorked;
    }
    public void display(){
        System.out.println("Name is: "+name+"\nHours worked: "+hoursWorked);
    }
    
}
