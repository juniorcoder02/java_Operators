import java.util.*;

public class numberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
        
        
        String result = (num>=0)?"Positive integer":"Negative integer";
        System.out.println(result);
        sc.close();



    }

}
