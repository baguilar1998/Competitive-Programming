import java.util.*;
import java.lang.*;
import java.io.*;

class EatTwice
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T -- != 0) {
		    int N = sc.nextInt(), M = sc.nextInt();
		    int [] days = new int[M+1];
		    for (int i = 0; i < N; i++) {
		        int D = sc.nextInt(), V = sc.nextInt();
		        days[D] = Math.max(days[D],V);
		    }
		    Arrays.sort(days);
		    System.out.println(days[M]+days[M-1]);
		}
	}
}
