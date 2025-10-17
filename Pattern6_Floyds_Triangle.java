Pattern-6 Floyd's Triangle

Enter the value of n: 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 


import java.util.*;
class Pattern6_Floyds_Triangle {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         int printVal = 1;
         for(int row = 1; row <= n; row++){
             for(int col = 1; col <= row; col++){
                 System.out.print(printVal++ + " ");
             }
             System.out.println();
         }

    }
}