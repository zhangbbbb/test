package test;

import java.util.Scanner;

public class DivideSelf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String s = String.valueOf(num);
		int length = s.length();
		char[] c = s.toCharArray();
		int count = 0;
		for(int i = 0;i<length;i++) {
			if(c[i]!='0' && num%(c[i]-'0')==0) { //1.需要判断除数不为空 2.需要用%不得用/，比如125/5==25不能证明整除，而%5==0可以表明
				count++;
			}
		}
		System.out.println(count);
	}

}
