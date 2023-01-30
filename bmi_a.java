public class bmi_a {

    public static final double w = 0.45;
    public static final double h = 0.0254;
   private String name;
   private double weight, height;

   public bmi_a(String name, double weight, double height){
    this.name = name;
    this.weight = weight;
    this.height = height;
   }

   public String getName(){
    return name;
   }
   public double getBMI(){
    double bmi = (weight*w) /((height*h)*(height*h));
    return bmi;
   }

   public String bmiStatus(){
    double Final_bmi = getBMI();

    if(Final_bmi < 18.5)
    return "Underweight";
    else if(Final_bmi >18.5 && Final_bmi <25)
    return "Normal";
    else if(Final_bmi >25 && Final_bmi <30)
    return "Over Weight";
    else
    return "Obese";

   }
    
}
