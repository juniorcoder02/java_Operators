import java.util.*;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Number :");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Number should be positive");
        } else {
            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
        sc.close();

    }
}