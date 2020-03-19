package myjavaprogram;
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter the two strings to be mapped");
		    String s1=s.next();
		    String s2=s.next();
		    boolean ans = isMapping(s1, s2);
			System.out.println(ans);
	}


	public static boolean isMapping(String str1, String str2) {
		if(str1.length()==0 || str1==null)
			return false;
			
		if(str1.length()!=str2.length())
			return false;	
		HashMap<Character, Character> map = new HashMap();
		for(int i=0;i<str1.length();i++) {
			char c1=str1.charAt(i);
			char c2=str2.charAt(i);
			
			if(map.containsKey(c1)) {
				if(map.get(c1)!=c2) {
					return false;
				}
			} else {
				map.put(c1, c2);
			}
			
		}
		return true;
	}
		
}
	
	
	