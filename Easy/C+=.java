import java.util.*;
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- != 0) {
			int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
			int numOfOperations = 0;
			while(a<=n && b<=n) {
				if (a < b) {
					 a+=b;
				} else {
					b+=a;
				}
				numOfOperations++;
			}
			System.out.println(numOfOperations);
		}
	}
}
