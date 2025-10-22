Pattern-26 Hollow Mirror Number Pyramid


Enter the value of n: 5
1        1
12      21
123    321
1234  4321
1234554321

 
import java.util.*;
class Pattern26_Hollow_Mirror_Number_Pyramid {
    public static void main(String[] args) {	
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
        	 for(int col = 1; col <= row; col++) {
        		 System.out.print(col);
        	 }
        	 for(int space = 1; space <= (n * 2) - (2 * row); space++) {
        		 System.out.print(" ");
        	 }
        	 for(int col = row; col >= 1 ; col--) {
            	 System.out.print(col);
             }
             System.out.println();
         }
    }
}			