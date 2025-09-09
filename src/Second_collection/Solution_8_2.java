package Second_collection;
import java.util.Scanner;
// Чтение чисел

public class Solution_8_2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int g = scan.nextInt();
        int h = scan.nextInt();
        int p = scan.nextInt();
        int result = (g+h+p)/3;
        System.out.println(result);
    }
}
