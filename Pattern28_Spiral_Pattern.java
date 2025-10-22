Pattern-28 Spiral Pattern


Enter the value of n: 5
01 02 03 04 05 
16 17 18 19 06 
15 24 25 20 07 
14 23 22 21 08 
13 12 11 10 09 

 
import java.util.*;

class Pattern28_Spiral_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: "); 
        int n = sc.nextInt();
        int data = 1;
        int[][] db = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {  
            for (int i = left; i <= right; i++) {      // Left to Right
                db[top][i] = data++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {      // Top to Bottom
                db[i][right] = data++;
            }
            right--;

            for (int i = right; i >= left; i--) {      // Right to Left
                db[bottom][i] = data++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {      // Bottom to Top
                db[i][left] = data++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {                 // Printing the Spiral Matrix
            for (int j = 0; j < n; j++) {
                System.out.printf("%02d ", db[i][j]);
            }
            System.out.println();
        }
    }
}
