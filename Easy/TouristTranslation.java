import java.util.*;
import java.lang.*;
import java.io.*;

class TouristTranslation
{
	public static void main (String[] args) throws java.lang.Exception
	{

        // Set up to read multiple inputs
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());

        // Map the byte language alphabet to the positions of the english alphabet
		char [] byteAlpha = sc.next().toCharArray();
		while (T-- != 0) {

            // Get the conversation that needs to be translated
		    String convo = sc.next();
		    StringBuilder translatedConvo = new StringBuilder();


		    for (int i = 0; i < convo.length(); i++) {
                // Read the current character
		        char c = convo.charAt(i);

		        if (Character.isLetter(c)) {
                    // Translates the current byte alphabet letter to 
                    // its proper englush translation
		            boolean isUpper = Character.isUpperCase(c);
		            c = Character.toLowerCase(c);
		            char newChar = byteAlpha[c-'a'];
		            if(isUpper)
		                translatedConvo.append(Character.toUpperCase(newChar));
		            else    
		                translatedConvo.append(newChar);
		        } else {
                    // Checks whether the character that we just read is
                    // either an underscore or any punctuation symbol
		            boolean isUnderscore = c == '_';
		            if (isUnderscore)
		                translatedConvo.append(" ");
		            else
		                translatedConvo.append(c);
		        }
		    }
            // Print out the translated conversation
		    System.out.println(translatedConvo.toString());
		}
	}
}
