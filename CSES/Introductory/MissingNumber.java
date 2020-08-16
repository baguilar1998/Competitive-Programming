import java.util.*;

class MissingNumber {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n-1; i++)
            sum += sc.nextLong();
        long sumWithMissingNumber = ((n+1)*n)/2;
        System.out.print(sumWithMissingNumber - sum);
    }

    public static void main(String [] args) {
        solve();
    }

}