import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GoodAndBadPersons
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		while(T-- != 0) {
		    int N = Integer.parseInt(sc.next()), K = Integer.parseInt(sc.next());
		    int [] c = new int[2];
		    int [] kf = new int[2];
		    String w = sc.next();
		    for(int i = 0; i < N; i++) {
		        char ch = w.charAt(i);
		        if (Character.isUpperCase(ch)){
		            if(kf[1] != K){
		                kf[1]++;
		                c[1]++;
		            }
		            c[0]++;
		        } else if (Character.isLowerCase(ch)){
		            if(kf[0] != K){
		                kf[0]++;
		                c[0]++;
		            }
		            c[1]++;
		        }
		    }
		    
		    if(c[0] == N && c[1] == N) {
		        System.out.println("both");
		    } else if (c[1] == N) {
		        System.out.println("chef");
		    } else if (c[0]==N){
		        System.out.println("brother");
		    } else {
		        System.out.println("none");
		    }
		}
	}
}