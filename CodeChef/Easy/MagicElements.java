import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MagicElements
{
    /**
    * Computes the sum of an integer array
    * @param arr an integer array
    * @return the sum of the given integer array    
    */
    public static int sum(int [] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum+=arr[i];
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- != 0) {
		    int N = sc.nextInt(), K = sc.nextInt();
		    int [] arr = new int[N];
		    for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
		    int arrSum = sum(arr), counter = 0;
		    for (int i = 0; i < N; i++) {
		        int magicElem = arr[i] + K, newArrSum = arrSum - arr[i];
		        boolean isMagicElem = magicElem > newArrSum;
		        if(isMagicElem) counter++;
		    }
		    System.out.println(counter);
		}
	}
}
