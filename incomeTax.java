import java.util.*;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Annual income :");
        int income = sc.nextInt();
        float tax;
        if (income < 500000) {
            tax = 0;
            System.out.println("Your total tax is : " + tax);
            System.out.println("your total income after tax deduction is : " + (income - tax));

        } else if (income > 500000 && income < 1000000) {
            tax = (income * 20) / 100;
            System.out.println("Your total tax is : " + tax);
            System.out.println("your total income after tax deduction is : " + (income - tax));

        } else {
            tax = (income * 30) / 100;
            System.out.println("Your total tax is : " + tax);
            System.out.println("your total income after tax deduction is : " + (income - tax));
        }
        sc.close();
    }
}