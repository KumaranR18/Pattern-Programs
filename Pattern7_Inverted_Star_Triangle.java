Pattern-7 Inverted Star Triangle


Enter the value of n: 5
* * * * * 
* * * * 
* * * 
* * 
*  


import java.util.*;
class Pattern7_Inverted_Star_Triangle {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n ; row++){
             for(int col = 1; col <= n - row + 1; col++){
                 System.out.print("* ");
             }
             System.out.println();
         }

    }
}