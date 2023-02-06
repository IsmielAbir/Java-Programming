public class VarArgs {
    void add(int ... num){
        int sum=0;
        for(int a:num){
            sum+=a;
        }
        System.out.println(sum);
    }
}
