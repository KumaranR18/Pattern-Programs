Pattern-15 Diamond Star Pattern

Enter the value of n: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 
import java.util.*;
class Pattern15_Diamond_Star_Pattern{
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= (n * 2) - 1; row++){
        	 int rowChange = row > n ? (n * 2) - row : row;
             for(int space = 1; space <= n - rowChange ; space++ ){
                 System.out.print(" ");
             }
             for(int col = 1; col <= (rowChange * 2) - 1; col++) {
            	 System.out.print("*");
             }
             System.out.println();
         }
    }
}