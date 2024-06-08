package Interview_exam;
import java.util.Scanner;
public class HCF_GCD {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int rem=0;
        int divisor=sc.nextInt();
        int dividend=sc.nextInt();
        while(dividend % divisor !=0){
            rem=dividend % divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
