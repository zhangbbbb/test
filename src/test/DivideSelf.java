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
			if(c[i]!='0' && num%(c[i]-'0')==0) { //1.��Ҫ�жϳ�����Ϊ�� 2.��Ҫ��%������/������125/5==25����֤����������%5==0���Ա���
				count++;
			}
		}
		System.out.println(count);
	}

}
