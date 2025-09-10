package Third_collection;
import java.util.Scanner;
// Тепло или холодно

public class Solution_3_1 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scan = new Scanner(System.in);
        int tem = scan.nextInt();
        if(tem<0)
        System.out.println(cold);
        else
            System.out.println(warm);
    }
}
