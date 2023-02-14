package Function;
import java.util.Scanner;
public class Takinginput {
    public static void main(String[] args) {
        System.out.println("TAKING INPUT FROM USER");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("SUM OF THESE NUMBERS " +sum);

    }
}






