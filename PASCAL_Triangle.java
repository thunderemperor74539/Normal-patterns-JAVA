package Interview_exam;
import java.util.Scanner;
public class PASCAL_Triangle {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=6;
        int rows=0;
        int stars=1;
        int spaces=n-1;
        while(rows<n){
            int i=1;
            while(i<=spaces){
                System.out.print(" ");
                i++;
            }
            int j=0;
            int val=1;
            while(j<stars){
                System.out.print(val+ " ");
                val=((rows-j)*val)/(j+1);
                j++;
            }
            rows++;
            stars++;
            spaces--;
            System.out.println(); 
        }
    }

}
