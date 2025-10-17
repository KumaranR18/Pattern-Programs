Pattern-5 Binary Right-Angled Triangle Pattern

Enter the value of n: 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 


import java.util.*;
class Pattern5_Binary_Right_Angled_Triangle_Pattern{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int printVal;
        for(int row = 1; row <= n; row++){
        	 printVal = row % 2 == 0 ? 0 : 1;
            for(int col = 1; col <= row; col++){
                System.out.print(printVal+" ");
                printVal = printVal == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}