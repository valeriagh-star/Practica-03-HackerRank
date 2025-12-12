package java1DArrayParte2;
import java.util.Scanner;

public class Solution {
	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game){
        if (i >= game.length) return true;
        if (i < 0 || game[i] == 1) return false;
        game[i] = 1;
        
        return canWinFrom(i + leap, leap, game) ||
               canWinFrom(i + 1, leap, game)||
               canWinFrom(i - 1, leap, game);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
