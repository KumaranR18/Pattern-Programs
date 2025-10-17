Pattern-1 Square

Enter the value of n: 5
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 


import java.util.*;
class Pattern1_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}