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
				while(l<r && need[s.charAt(l)]<0) {//needֵ����0����Ҫ�ģ�û����һ��r��Ӧ��Ҫ������ȥ������������ȥ��needֵ--
					need[s.charAt(l)]++;//eg��need����ֵa = 2������Ҫ����needֵ++��Ȼ��ָ������
					l++;
				}
				if(r-l+1<size) {//������Ч������Сֵ
					size = r-l+1;
					start = l;
				}
				//��߽�����,���ڼ�����һλ��Ҫ���ַ���suo'yi
				need[s.charAt(l)]++;
				l++;
				count++;
			}
			//�ұ߽�����
			r++;
		}
		return size ==Integer.MAX_VALUE?"":s.substring(start,start+size);
		
    }
}
