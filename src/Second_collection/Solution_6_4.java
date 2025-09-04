package Second_collection;
// С каждым разом огромнее
public class Solution_6_4 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);
        System.out.println(hugeAmount);
    }
}
