import java.util.Scanner;
import java.util.Arrays;
public class fibonacci {
    static int[] dp;
    public static int fibonacc( int n){
        if(n<=1)    return n;
        if(dp[n] != -1) return dp[n];
        else    dp[n]=fibonacc(n-1)+fibonacc(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacc(n));
        sc.close();

        
    }
}






/*Dynamic Programming (DP) is an algorithmic technique used to solve complex problems by breaking them down into smaller, overlapping subproblems and storing their results to avoid redundant computations. It is particularly effective when a problem exhibits optimal substructure and overlapping subproblems.

By reusing previously computed solutions through memoization (top-down) or tabulation (bottom-up), DP significantly improves the efficiency of algorithms that would otherwise require exponential time.

Why it matters
Reduces time complexity by eliminating repeated calculations.
Enables efficient solutions for optimization and counting problems.
Forms the foundation for solving many advanced algorithmic challenges in technical interviews and competitive programming.*/
