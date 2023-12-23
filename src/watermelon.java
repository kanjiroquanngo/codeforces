import java.lang.*;
import java.util.*;
public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        checkWatermelon(input);
    }
    
    public static void checkWatermelon(int input){
        if (input > 2 && input <= 100 && input % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
