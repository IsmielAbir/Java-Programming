import java.util.Scanner;
public class letter {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter characters: ");
        String s = input.nextLine();
        s = s.toLowerCase();
        char [] ch = s.toCharArray();

        int[] counts = new int[26];

        for(int i=0;i<ch.length;i++){
            char c = ch[i];
            if(Character.isLetter(c)){
                int index = c - 'a';
                counts[index]++;
            }
        }
        
        System.out.println("Letter counts: ");
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                char c = (char) (i+'a');
                System.out.println(c+" : "+ counts[i]);
            }
        }
    }
    
}
