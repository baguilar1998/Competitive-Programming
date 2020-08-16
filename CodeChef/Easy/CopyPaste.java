import java.util.*;
import java.lang.*;
import java.io.*;

class CopyPaste
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- != 0) {
		    int N = sc.nextInt(), counter = 1;
		    Set<Integer> nums = new HashSet<>();
		    for (int i = 0; i < N; i++)
		        nums.add(sc.nextInt());
		    System.out.println(nums.size());
		}
	}
}