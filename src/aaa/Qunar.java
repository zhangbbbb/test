package aaa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qunar {

	public static void main(String[] args) {
			class Solution{

				public int findLuckyNumber(int[] a) {
					Map<Integer,Integer> map = new HashMap<>();
					for (int num : a) {
						map.put(num, map.getOrDefault(num, 0)+1);
					}
					int flag = -1;
					for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
						if(entry.getKey()==entry.getValue()) {
							flag = Math.max(flag, entry.getKey());
						}
					}
					return flag;
				}
				
			}
		  final Scanner scan = new Scanner(System.in);
	      while (scan.hasNext()){
	          String s = scan.nextLine();
	          String[] str = s.split(",");
	          int[] a = new int[str.length];
	          for(int i = 0; i<str.length; i++){
	        	  a[i] = Integer.parseInt((str[i]));
	          }
	          Solution sl = new Solution();
	          System.out.println(sl.findLuckyNumber(a));

	      }
	}
	
	
}
