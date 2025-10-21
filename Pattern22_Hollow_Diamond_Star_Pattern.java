Pattern-22 Hollow Diamond Star Pattern


Enter the value of n: 5
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********		

 
import java.util.*;
class Pattern22_Hollow_Diamond_Star_Pattern {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= (n * 2); row++){
        	 int rowChange = row > n ? (n * 2) - row + 1 : row;		      
             for(int col = 1; col <= (n * 2); col++) {				      //Combining Star + Spaces = to Print Right side star (n + row) - 1  (row = rowChange)
            	 if( col <= n - (rowChange - 1) || col > (n + rowChange) - 1) {       //  n - (row - 1) Half Star (Inverted pyramid)  + (row * 2) - 2 (Another Half from Row 6 - 10)
            		 System.out.print("*");					      //  (n - row + 1) + (row * 2) - 2 
            	 }								      //  (n + 1) + (row - 2)     // row * 2 = It has 2 rows 
            	 else {								      //  (n + row - 1)         // Final Formula (to print Right side star)
            		 System.out.print(" ");
            	 }
             }
             System.out.println();
         }
    }
}