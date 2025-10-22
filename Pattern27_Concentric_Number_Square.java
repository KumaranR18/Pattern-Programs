Pattern-27 Concentric Number Square


Enter the value of n: 5
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5 

 
import java.util.*;
class Pattern27_Concentric_Number_Square {
    public static void main(String[] args) {	
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for (int row = 1; row <= 2 * n - 1; row++) {
             for (int col = 1; col <= 2 * n - 1; col++) {
                 int minDist = Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                 System.out.print((n - minDist + 1) + " ");
             }
             System.out.println();
         }
    }
}					


import java.util.*;
class Pattern27_Concentric_Number_Square {
    public static void main(String[] args) {	
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= (n * 2) - 1; row++){
        	 for(int col = 1; col <= (n *2 ) - 1; col++) {
        		 int topd = row, downd = (n * 2) - row, leftd = col, rightd = (n * 2) - col;       //topd = 1st row, downd = last row, leftd = 1st col, rightd = last column
        		 int mins = Math.min(Math.min(topd,downd), Math.min(leftd, rightd));
        		 System.out.print((n - mins + 1 ) + " ");
        	 }
             System.out.println();
         }
    }
}			