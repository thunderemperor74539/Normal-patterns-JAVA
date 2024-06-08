package Interview_exam;
import java.util.Scanner;
public class Prime_no {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2; i<=n-1; i++){
            if(n%i==0)
                count++;
                break;
        }
        if(count>=1){
            System.out.print("not prime");
        }
        else{
            System.out.print("prime");
        }
    }
}