public class Animal {
   public static class General{
    public void Eat(){
        System.out.print("Eating ----");
    }
    public void Sleep(){
        System.out.print("Sleeping ----");
    }
   }
    public static class Cat extends General{
        public void call(){
            System.out.print("Cat call sound----");
        }
    }

}



