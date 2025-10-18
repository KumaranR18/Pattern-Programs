Pattern-8 Inverted Number Triangle


Enter the value of n: 5
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 


import java.util.*;
class Pattern8_Inverted_Number_Triangle {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = 1; row <= n; row++){
             for(int col = 1; col <= n - row + 1; col++){
                 System.out.print(n - row + 1 + " ");
             }
             System.out.println();
         }

    }
}



import java.util.*;
class Pattern8_Inverted_Number_Triangle {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for(int row = n; row > 0; row--){
             for(int col = 1; col <= row; col++){
                 System.out.print(row + " ");
             }
             System.out.println();
         }

    }
}