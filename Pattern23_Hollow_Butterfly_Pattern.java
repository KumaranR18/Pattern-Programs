Pattern-23 Hollow Butterfly Pattern


Enter the value of n: 5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *	

 
import java.util.*;
class Pattern23_Hollow_Butterfly_Pattern {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= (n * 2) - 1; row++){
        	 int rowChange = row > n ? (n * 2) - row : row;
             for(int col = 1; col <= (n * 2); col++) {
            	 if( col <= rowChange || col > (2 * n) - rowChange) {
            		 System.out.print("*");
            	 }
            	 else {
            		 System.out.print(" ");
            	 }
             }
             System.out.println();
         }
    }
}	