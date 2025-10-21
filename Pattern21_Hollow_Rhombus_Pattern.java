Pattern-21 Hollow Rhombus Pattern


Enter the value of n: 5
    *****
   *   *
  *   *
 *   *
*****

 
import java.util.*;
class Pattern21_Hollow_Rhombus_Pattern {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
        	 for(int space = 1; space <= n - row; space++) {
        		 System.out.print(" ");
        	 }
             for(int col = 1; col <= n; col++) {
            	 if(col == 1 || col == n || row == 1 || row == n) {
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