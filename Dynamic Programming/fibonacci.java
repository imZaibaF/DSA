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