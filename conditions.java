import java.util.*;
public class conditions{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("1st Number is Greater");
        }
        else{
            System.out.println("2nd Number is Greater");
        }
        sc.close();

    }
}