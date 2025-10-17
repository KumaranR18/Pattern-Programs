Pattern-4 Number Right-Angled Triangle

Enter the value of n: 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


import java.util.*;
class Pattern4_Number_Right_Angled_Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.print("\n");
        }
    }
}