Pattern-3 Right-Angled Triangle Pattern

Enter the value of n: 5
* 
* * 
* * * 
* * * * 
* * * * * 


import java.util.*;
class Pattern3_Right_Angled_Triangle_Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}