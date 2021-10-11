package aaa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test {
	public String minWindow(String s, String t) {
		if(s == null || s.length() == 0 || t==null||t.length()==0) {	
			return "";
		}
		int[] need = new int[128];
		Map<Character,Integer> sMap = new HashMap<>();
		char[] tChar = t.toCharArray();
		for (char c : tChar) {
			need[c]++;
		}
		int l=0,r=0,size=Integer.MAX_VALUE,count = t.length(),start=0;
		while(r<s.length()) {
			char c = s.charAt(r);
			if(need[c]>0) {
				count--;
			}
			need[c]--;
			if(count==0) {
				while(l<r && need[s.charAt(l)]<0) {//need值大于0是需要的，没遇到一个r对应的要包括进去的数，包括进去了need值--
					need[s.charAt(l)]++;//eg，need中有值a = 2，不需要了让need值++，然后指针右移
					l++;
				}
				if(r-l+1<size) {//更新有效区间最小值
					size = r-l+1;
					start = l;
				}
				//左边界右移,由于减少了一位需要的字符，suo'yi
				need[s.charAt(l)]++;
				l++;
				count++;
			}
			//右边界右移
			r++;
		}
		return size ==Integer.MAX_VALUE?"":s.substring(start,start+size);
		
    }
}
