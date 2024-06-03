import javax.print.attribute.standard.OutputDeviceAssigned;

public class PatternPrinting {
    public static void main(String[] args) throws Exception{
        /*TO PRINT FIVE STARS IN 5 ROWS AND EACH ROW HAVING 5 STARS
        int n=5;
        int rows=1;
        int star = n;
        while(rows<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            rows++;
            System.out.println();

        }

Q2
        int n=5;
        int rows=1;
        int star=1;
        while(rows<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            rows++;
            System.out.println();
            star++;
OUTPUT
* 
* *
* * *
* * * *
* * * * *
        }


Q3
        int n=5;
        int rows=1;
        int star=5;
        while(rows<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            rows++;
            System.out.println();
            star--;

            #OUTPUT#
            * * * * * 
            * * * *
            * * *
            * *
            *
        }


Q4
        int n=5;
        int rows=1;
        int stars=5;
        int space=n-1;
        while(rows<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            rows++;
            System.out.println();
            stars--;
            space++; 

        #OUTPUT#
        * * * * * 
          * * * *
            * * *
              * *
                *   
        }


Q5
        int n=5;
        int rows=1;
        int stars=1;
        int space=4;
        while(rows<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            rows++;
            System.out.println();
            stars++;
            space--; 
        }
OUTPUT
          * 
        * *
      * * *
    * * * *
  * * * * *
        


        Q6
        int n=5;
        int rows=1;
        int stars=5;
        int space=n-2;
        while(rows<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            rows++;
            System.out.println();
            stars--;
            space+=2; 
        }    
        OUTPUT
        * * * * * 
            * * * *
                * * *
                     * *
                         *
        

                         Q7
        int n=5;
        int rows=1;
        int stars=1;
        int space=n-1;
        while(rows<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            rows++;
            System.out.println();
            stars++;
            space--; 
        }
        * 
       * *
      * * *
     * * * *
    * * * * *
        

            Q8
        int n=5;
        int rows=1;
        int spaces=n-1;
        int star=5;
        while(rows<=n){
            int i=1;
            while(i<=spaces){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            rows++;
            spaces++;
            star--;
            System.out.println();
        }
            Output
        * * * * * 
         * * * *
          * * *
           * *
            *           
        


        Q9
        int n=5;
        int rows=1;
        int stars=1;
        int spaces=n-1;
        while(rows<=n){
            int i=1;
            while(i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                if(j%2!=0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                }
                j++; 
            }
            rows++;
            System.out.println();
            stars+=2;
            spaces--;
        }
        OUTPUT
        * 
      * ! *
    * ! * ! *
  * ! * ! * ! *
* ! * ! * ! * ! *
        

Q10: "MUST TRY IN EVERY REVISION"
        int n=5;
        int rows=1;
        int spaces=(2*n)-3;
        int stars=1;
        while(rows<=n){
            int i=1;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(rows==n){
                k=2;
            }
            while(k<=stars){
                System.out.print("* ");
                k++;
            }
            rows++;
            stars++;
            spaces-=2;
            System.out.println();
        }
        Output
*               * 
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *
        


Q11
DOUBT
        int n=5;
        int rows=1;
        int stars=n;
        int spaces=-1;
        while(rows<=n){
            int i=1;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(rows==n){
                k=2;
            }
            while(k<=stars){
                System.out.print("* ");
                k++;
            }
            rows++;
            stars-=2;
            spaces++;
            System.out.println();
        }


//Q12. BEST FOR PRACTICE
        int n=5;
        int stars=1;
        int rows=1;
        while(rows<=(2*n-1)){
            int i=1;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }                                         //MIRRORING CONCEPT
            if(rows<n){
                stars++;
            }
            else{
                stars--;
            }
            rows++;
            System.out.println();

        }
        OUTPUT
* 
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*       


//Q13 Reverse of Above Ques
        int n=5;
        int spaces=n-1;
        int stars=1;
        int rows=1;
        while(rows<=2*n-1){
            int i=1;
            while(i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
                                   //mirror concept
            if(rows<n){
                spaces--;
                stars++;
            }
            else{
                spaces++;
                stars--;
            }
            rows++;
            System.out.println();

        }



Q14
        int n=5;
        int stars=n;
        int spaces=n-1;
        int rows=1;
        while(rows<=2*n-1){
            int i=1;
            while(i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            if(rows<n){
                spaces--;
                stars--;
            }
            else{
                spaces++;
                stars++;
            }
            rows++;
            System.out.println();
        }
        //OUTPUT
          * * * * * 
        * * * *
      * * *
    * *
  *
    * *
      * * *
        * * * *
          * * * * *
        




Q15
        int n=5;
        int spaces=n-3;
        int rows=1;
        int stars=n;
        while(rows<=2*n-1){
            int i=1;
            while(i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            if(rows<n){
                stars--;
                spaces+=2;
            }
            else{
                stars++;
                spaces-=2;
            }
            rows++;
            System.out.println();
        }


        //Output
        * * * * * 
            * * * *
                * * *
                    * *
                        *
                    * *
                * * *
            * * * *
        * * * * *
        



//Q16
        int n=7;
        int stars=n/2;
        int spaces=1;
        int rows=1;
        while(rows<=n){
            int i=1;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=stars){
                System.out.print("* ");
                k++;
            }
            if(rows<n/2+1){
                stars--;;
                spaces+=2;
            }
            else{
                stars++;
                spaces-=2;
            }
            rows++;
            System.out.println();
        }

        //OUTPUT
* * *   * * * 
* *       * *
*           *

*           *
* *       * *
* * *   * * *
        


Q17
        int n=7;
        int stars=n-3;
        int spaces=-1;
        int rows=1;
        while(rows<=n){
            int i=1;
            if(rows==1){                      //condition for extra 1 star
                i=2;
            }
            else{
                i=1;
            }
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=spaces){
                System.out.print("  ");
                j++;
            }
            int k;                       
            if(rows==n){                      //condition for extra 1 star
                k=2;
            }
            else{
                k=1;
            }
            while(k<=stars){
                System.out.print("* ");
                k++;
            }
                                            //mirror
            if(rows<4){
                stars--;
                spaces+=2;
            }
            else{
                stars++;
                spaces-=2;
            }
            rows++;
            System.out.println();
        }

        //OUTPUT
* * * * * * * 
* * *   * * *
* *       * *
*           *
* *       * *
* * *   * * *
* * * * * * *
        


                                                           //NUMBER PRINTING
//Q18                                                   
        int n=5;
        int rows=1;
        int stars=1;
        int spaces=n-1;
        while(rows<=n){
            int i=1;
            while(i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print(rows +" ");
                j++; 
            }
            rows++;
            System.out.println();
            stars+=2;
            spaces--;
        }

        
        //output
          1 
        2 2 2
      3 3 3 3 3
    4 4 4 4 4 4 4
  5 5 5 5 5 5 5 5 5
  
        


//Q19
        int n=5;
        int rows=1;
        int stars=1;
        int spaces=n-1;
        int val=1;
        while(rows<=n){
            int i=1;
            while(i<=spaces){
                System.out.print(" \t");          // we use \t for 4 spaces and make pattern good and visible
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print(val +"\t");
                val++;
                j++; 
            }
            rows++;
            System.out.println();
            stars+=2;
            spaces--;
        }

        //output
                                1
                        2       3       4
                5       6       7       8       9
        10      11      12      13      14      15      16
17      18      19      20      21      22      23      24      25

        */
        


//Q20   
        int n=5;
        int rows=1;
        int stars=1;
        int spaces=n-1;
        while(rows<=n){
            int i=1;
            while(i<=spaces){
                System.out.print(" \t");          // we use \t for 4 spaces and make pattern good and visible
                i++;
            }
            int j=1;
            int val=1;
            while(j<=stars){
                System.out.print(val +"\t");
                val++;
                j++; 
            }
            rows++;
            System.out.println();
            stars+=2;
            spaces--;
        }


        






    }


    
}
