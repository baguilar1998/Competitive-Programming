import java.util.*;

class Repetitions {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String dna = sc.next();
        int firstPtr = 0, secondPtr = 0;
        int len = dna.length();
        int max = Integer.MIN_VALUE;
        while(firstPtr < len && secondPtr < len) {
            char c1 = dna.charAt(firstPtr);
            char c2 = dna.charAt(secondPtr);
            if (c1 == c2) {
                secondPtr++;
            } else {
                max = Math.max(secondPtr - firstPtr,max);
                firstPtr = secondPtr;
            }
        }

        System.out.println(Math.max(secondPtr - firstPtr,max));
    }

    public static void main(String [] args) {
        solve();
    }
}