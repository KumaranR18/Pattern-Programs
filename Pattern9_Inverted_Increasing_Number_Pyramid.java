Pattern-9 Inverted Increasing Number Pyramid


Enter the value of n: 5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


import java.util.*;
class Pattern9_Inverted_Increasing_Number_Pyramid {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
             for(int col = 1; col <= n - row + 1; col++){
                 System.out.print(col + " ");
             }
             System.out.println();
         }
    }
}



import java.util.*;
class Pattern9_Inverted_Increasing_Number_Pyramid {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = n; row > 0; row--){
             for(int col = 1; col <= row; col++){
                 System.out.print(col + " ");
             }
             System.out.println();
         }
    }
}