package Interview_exam;
import java.util.Scanner;
public class Fibonnacci {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n; i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(a);      //this syso. is to print the series...
                                        //if n=6 then it print 0112358 
        }
        System.out.print(a);            //this syso. is to print the no. at that position
    }
}
