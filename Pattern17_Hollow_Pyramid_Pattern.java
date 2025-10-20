Pattern-17 Hollow Pyramid Pattern


Enter the value of n: 5
    *
   * *
  *   *
 *     *
*********


 
import java.util.*;
class Pattern17_Hollow_Pyramid_Pattern {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
             for(int space = 1; space <= n - row; space++ ){
                 System.out.print(" ");
             }
             for(int col = 1; col <= (2 * row) - 1; col++) {
            	 if(col == 1 || col == (2 * row) - 1 || row == n) {
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