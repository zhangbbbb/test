package aaa;



public class St {
//	public static void main(String[] args) {
//		System.out.println(minWindow("A", "A"));
//	}
//	public static String minWindow(String s, String t) {
//		if(s == null || s.length() == 0 || t==null||t.length()==0) {	
//			return "";
//		}
//		int[] need = new int[128];
//		for (int i = 0; i < t.length(); i++) {
//			need[t.charAt(i)]++;
//		}
//		int count=0;
//		for(char i='a';i<='z';i++) {
//			if(need[i]>0) {
//				count++;
//			}
//		}
//		for(char i='A';i<='Z';i++) {
//			if(need[i]>0) {
//				count++;
//			}
//		}
//		int[] window = new int[128];
//		int j = 0, i = 0;
//		
//		for (; j < s.length(); j++) {
//			char c = s.charAt(j);
//			window[c]++;
//			if (window[c] == need[c]) {
//				count--;
//				if (count == 0) {
//					break;
//				}
//			}
//		}
//		if (count != 0) {
//			return "";
//		}
//		int length = 0, miniLength = s.length();
//		while (j<s.length()) {
//			for (; i < s.length(); i++) {
//				char cs = s.charAt(i);
//				window[cs]--;
//				if (window[cs] < need[cs]) {
//					count++;
//					break;
//				}
//			}
//			length = j - i + 1;
//			if (length < miniLength) {
//				miniLength = length;
//				if (miniLength == t.length()) {
//					break;
//				}
//			}
//			i++;
//			j++;
//			for (; j < s.length(); j++) {
//				char c = s.charAt(j);
//				window[c]++;
//				if (window[c] == need[c]) {
//					count--;
//					if (count == 0) {
//						break;
//					}
//				}
//			}
//
//		}
//		return s.substring(i-1, j);
//
//	}
	
	public String minWindow(String s, String t) {
		int[] need = new int[128];
		for (char c : t.toCharArray()) {
			need[c]--;
		}
		String res ="";
		int count = 0;
		int length = s.length()+1;
		for (int i = 0,j=0; j < s.length(); j++) {
			char ch = s.charAt(j);
			if(need[ch]<0) {
				count++;
			}
			need[ch]++;
			while(i<j && need[s.charAt(i)]>0) {
				need[s.charAt(i++)]--;
			}
			if(count == t.length() && length>j-i+1) {
				length = j-i+1;
				res = s.substring(i,j+1);
			}
		}
		return res;
	}
}
