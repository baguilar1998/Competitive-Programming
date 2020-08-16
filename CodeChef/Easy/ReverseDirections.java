import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReverseDirections
{

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while (T-- != 0) {
		    int N = Integer.parseInt(sc.nextLine());
		    String [] directions = new String[N];
		    String [] newDirections = new String[N];
		    int top = 0;
		    for(int i = 0; i < N; i++) {
		        directions[i] = sc.nextLine();
		        boolean isStarting = directions[i].indexOf("Begin") != -1;
		        if (isStarting)
		            continue;
		        boolean isLeft = directions[i].indexOf("Left") != -1;
		        if (isLeft)
		            newDirections[top++] = "Right ";
		        else 
		            newDirections[top++] = "Left ";
		    }
		    newDirections[top++] = "Begin ";
		    for(int i = N-1; i >= 0; i--) {
		        directions[i] = newDirections[--top] + directions[i].substring(directions[i].indexOf("on"));
		        System.out.println(directions[i]);
		    }
		}
	}
}