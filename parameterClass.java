public class parameterClass {
    String name, gender;
    int age;

    void setInformation(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
        System.out.println("Age is: "+age);

    }
    
}
