package test;

import java.util.Scanner;

public class jianpan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int a = scan.nextInt();
		sum(a);
		System.out.println(5);
	}
	public static int sum(int s) {
		int result=0;
		int n = 0;
		for(;s!=0;s=s>>1) {
			if((s&1)==1) {
				n++;
			}else {
				result+=cal(n);
				n=0;
			}
		}
		return result+cal(n);
	}
	public static int cal(int n) {
		if(n<=1) {
			return n;
		}else {
			return 2;
		}
	}
	
//	//	【模块名】【版本号】【IP地址】【状态】【日期】
//	[logserver][v1.1.1][10.1.1.2,10.1.1.3][success][2020-07-20]
//	logserver v1.1.1, v1.1.3, v1.1.5
//	backend v2.3, v2.5

}
