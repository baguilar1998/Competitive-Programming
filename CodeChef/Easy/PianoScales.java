/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PianoScales
{
    
    public static int checkTone(char tone) {
        if(tone == 'T')
            return 2;
        return 1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while (T-- != 0) {
		    String pattern = sc.nextLine();
		    int keys = Integer.parseInt(sc.nextLine())*12,numOfPlays = 0,totalOctave = 0;
		    for(int i = 0; i < pattern.length();i++) 
		        totalOctave += checkTone(pattern.charAt(i));
            for(int i = totalOctave; i < keys; i+=totalOctave)
                numOfPlays += (keys-i);
		    System.out.println(numOfPlays);
		}
	}
}