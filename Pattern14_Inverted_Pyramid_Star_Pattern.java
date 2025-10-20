Pattern-14 Inverted Pyramid Star Pattern


Enter the value of n: 5
*********
 *******
  *****
   ***
    *

 
import java.util.*;
class Pattern14_Inverted_Pyramid_Star_Pattern {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = n; row > 0; row--){
             for(int space = 1; space <= n - row; space++ ){
                 System.out.print(" ");
             }
             for(int col = 1; col <= (row * 2) - 1; col++) {
            	 System.out.print("*");
             }
             System.out.println();
         }
    }
}