import java.util.Scanner;
public class LMS1c {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int morningUsage = sc.nextInt();
        int eveningUsage = sc.nextInt();
        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption: " + totalUsage);


    }
}