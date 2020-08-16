import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse
{
    public static void cleanLine(String line, List<String> l) {
        String s = "", f = "";
        for(int i = 0; i < line.length();i++){
            char c = line.charAt(i);
            if(c == ' ' && s.length()==0)continue;
            if(!Character.isLetter(c)) {
                f = s+" "+f;
                s="";
            } else {
                s+=c;
            }
        }
        l.add(f);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.nextLine());
		List<String> l = new ArrayList<>();
		for(int i = 0; i < L; i++) {
		    String line = sc.nextLine();
		    cleanLine(line,l);
		}
		for(int i = l.size()-1; i>=0;i--){
		    System.out.println(l.get(i));
		}
	}
}
