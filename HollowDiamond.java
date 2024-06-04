import java.util.Scanner;
public class HollowDiamond {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=n/2+1;
        int spaces=-1;
        int rows=1;
        while(rows<=n){
            int i=1;
            if(rows==1){
                i=2;
            }
            else{
                i=1;
            }
            while(i<=stars){
                System.out.print("*\t");
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print("\t");
                j++;
            }
            int k=1;
            if(rows==n){
                k=2;
            }
            else{
                k=1;
            }
            while(k<=stars){
                System.out.print("*\t");
                k++;
            }

            if(rows<=n/2){
                spaces+=2;
                stars--;
            }
            else{
                spaces-=2;
                stars++;
            }
            rows++;
            System.out.println();

        }

        
    }
    
}

//Output
*       *       *       *       *
*       *               *       *
*                               *
*       *               *       *
*       *       *       *       *
