package Interview_exam;
import java.util.Scanner;
public class Inverse_Typecast {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=1;
        double sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+pos * Math.pow( 10, rem-1);
            n=n/10;
            pos++;
        }
        System.out.println((int)(sum));

    }
    
}
