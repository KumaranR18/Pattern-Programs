Pattern-25 Centered Palindromic Number Pyramid


Enter the value of n: 5
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

 
import java.util.*;
class Pattern25_Centered_Palindromic_Number_Pyramid {
    public static void main(String[] args) {	
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
        	 for(int space = 1; space <= n - row; space++) {
        		 System.out.print("  ");
        	 }
        	 for(int col = 1; col <= row; col++) {
        		 System.out.print(col + " ");
        	 }
        	 for(int col = row-1; col >= 1 ; col--) {
            	 System.out.print(col + " ");
             }
             System.out.println();
         }
    }
}				