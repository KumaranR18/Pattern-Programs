Pattern-10 Diamond Half Pyramid


Enter the value of n: 5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 


import java.util.*;
class Pattern10_Diamond_Half_Pyramid {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= (2 * n) - 1; row++){
        	 int colTimes = row > n ? (2 * n) - row : row;
             for(int col = 1; col <= colTimes; col++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}