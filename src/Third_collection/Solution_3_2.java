package Third_collection;
import java.util.Scanner;
// Призывная кампания

public class Solution_3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        String militaryCommissar = ", явитесь в военкомат";
        if(age>=18&&age<=28)
            System.out.println(name+militaryCommissar);
    }
}
