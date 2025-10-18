Pattern-12 Reverse Right-Aligned Star Pyramid


Enter the value of n: 5
*****
 ****
  ***
   **
    *

 
import java.util.*;
class Pattern12_Reverse_Right_Aligned_Star_Pyramid {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
        	 int colTimes = n - row + 1;
             for(int space = 1; space <= n - colTimes; space++ ){
                 System.out.print(" ");
             }
             for(int col = 1; col <= colTimes; col++) {
            	 System.out.print("*");
             }
             System.out.println();
         }
    }
}


import java.util.*;
class Pattern12_Reverse_Right_Aligned_Star_Pyramid {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = n; row > 0; row--){
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