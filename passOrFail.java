import java.util.*;
public class passOrFail{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = Sc.nextInt();
        String result = (marks>=33)?"pass":"Fail";
        System.out.println( result);
        Sc.close();

    }
}