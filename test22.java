public class test22 {
    public static void main(String[] args) {
        int hoursRate = 70;
        client c = new client("Shah", 70);
        c.display();
        System.out.println("Worker rate is: "+c.getHours()*hoursRate);
    }
}