import java.util.*;

public class miniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :  ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd Number :  ");
        float num2 = sc.nextFloat();
        System.out.print("Enter Operator(+,-,*,/) :");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':System.out.println(num1+num2);
            break;
            case '-':System.out.println(num1-num2);
            break;
            case '*':System.out.println(num1*num2);
            break;
            case '/':System.out.println(num1/num2);
            break;
            default:System.out.println("Invalid Operator ");
        }
        sc.close();

    }
}