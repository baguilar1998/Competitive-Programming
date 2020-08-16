import java.util.*;

class WeirdAlgorithm {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        System.out.print(n + " ");
        while (n != 1) {
            if (n%2==0) {
                n /= 2;
            } else {
                n = (3*n)+1;
            }
            System.out.print(n + " ");
        }
    }

    public static void main(String [] args) {
        solve();
    }
}