import java.util.*;

public class feverChecker {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Body temperature : ");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println(" you have a Fever");
        }else{
            System.out.println("You don't have a Fever");
        }
        sc.close();
    }
    
}
