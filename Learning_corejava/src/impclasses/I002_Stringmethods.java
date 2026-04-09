package impclasses;

import java.util.Iterator;

public class I002_Stringmethods {
	public static void main(String[] args) {
		
		
		String st = "Sun rises in East";
		
		System.out.println(st.length());
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.charAt(5));
		System.out.println(st.indexOf('u'));
		System.out.println(st.lastIndexOf('s'));
		System.out.println(st.trim());
		System.out.println(st.substring(2,5));
		System.out.println(st.replace('s', 'T'));
		System.out.println(st.contains("in"));
		System.out.println(st.endsWith("st"));
		System.out.println(st.startsWith("K"));
		System.out.println(st.concat("abc"));
		System.out.println(st.equals("anc"));
		
		
		String str[] =  st.split("s");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		char ch[] =  st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		byte b[] =  st.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
