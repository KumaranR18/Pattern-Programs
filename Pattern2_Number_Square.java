Pattern-2 Number Square  

Enter the value of n: 5
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 


import java.util.*;
class Pattern2_Number_Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print(row+" ");
            }
            System.out.print("\n");
        }
    }
}