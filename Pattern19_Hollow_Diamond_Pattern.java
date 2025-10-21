Pattern-19 Hollow Diamond Pattern


Enter the value of n: 5
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *


 
import java.util.*;
class Pattern19_Hollow_Diamond_Pattern {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= (2 * n) - 1; row++){
        	 int rowChange = row > n ? (2 * n) - row : row;
             for(int space = 1; space <= n - rowChange; space++ ){
                 System.out.print(" ");
             }
             for(int col = 1; col <= (2 * rowChange) - 1; col++) {
            	 if(col == 1 || col == (2 * rowChange) - 1) {
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