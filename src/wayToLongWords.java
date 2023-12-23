import java.lang.*;
import java.util.*;
public class wayToLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberWord = Integer.parseInt(sc.nextLine());
        
        
        String[] words = new String[numberWord];
        for (int i = 0; i < numberWord; i++){
            words[i] = sc.nextLine();
        }
        
        for (String word : words){
            System.out.println(calculateLongWords(word));
        }
        
    }
    
    public static String calculateLongWords(String word){
        if (word.length() > 10){
            return word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
        } else {
            return word;
        }        
    }
}
