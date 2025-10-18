Pattern-11 Right-Aligned Star Pyramid


Enter the value of n: 5
    *
   **
  ***
 ****
*****


import java.util.*;
class Pattern11_Right_Aligned_Star_Pyramid {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
             for(int space = 1; space <= n - row; space++ ){
                 System.out.print(" ");
             }
             for(int col = 1; col <= row; col++) {
            	 System.out.print("*");
             }
             System.out.println();
         }
    }
}