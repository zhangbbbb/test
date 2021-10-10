package aaa;

import java.util.Arrays;
import java.util.Scanner;


public class JD2 {
/**
 * 小A爱狗
 * 
 * 找到喂养成本、领养成本都不高于预算的，且喜爱度较大的那只狗
 * 喂养预算=喂养预算系数d/个数n  * 排名
 * 
 * 输入：第一行有3个正数，n表示狗的数量，k表示领养狗的预算，d表示喂养预算系数
 * 	   第二行有n个正整数，a1、a2…表示小A对每只狗的喜爱度
 * 	   第三行有n个正整数，b1、b2……表示每只狗的领养成本
 *           第四行有n个正整数，c1，c2……表示每只狗的每月喂养成本
 *输出：在小A能力范围内能领养到的最喜爱的狗 所对应的的喜爱值。如果没有，输出-1.
 
 例如：
  5 100 100
  1 2 3 4 5
  30 60 90 120 150
  11 22 44 88 176
  
  3
  
      原因：喂养预算依次是20 40 60 80 1 0 0，只能选择1 2 3的狗
  	而领养也是 1 2 3 的狗，喜爱度最大为3
  	
 */
	
//不知能过多少
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Dog[] dogs = new Dog[n];
		for (int i = 0; i < n; i++) {
			dogs[i] = new Dog();
		}

		int k = scan.nextInt();
		int d = scan.nextInt();
		scan = new Scanner(System.in);
		String[] a = scan.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			dogs[i].a = Integer.valueOf(a[i]);
			dogs[i].ys = (d/n )* dogs[i].a; 
		}
//如果是在同一行读取
//		for (int i = 0; i < n; i++) {
//			dogs[i].a = scan.nextInt();
//			dogs[i].ys = (d/n )* dogs[i].a; 
//		}
		
//如果不在同一行，重新初始Scanner
		scan = new Scanner(System.in);
		String[] b = scan.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			dogs[i].b = Integer.valueOf(b[i]);
		}
		scan = new Scanner(System.in);
		String[] c = scan.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			dogs[i].c = Integer.valueOf(c[i]);
		}
		Arrays.sort(dogs);
		int j = n-1;
		for (;j>=0; ) {
			if(dogs[j].getB()>k) {
				j--;
			}else {
				break;
			}
		}
		for (; j >= 0; ) {
			if(dogs[j].getYs()<dogs[j].c) {
				j--;
			}else {
				break;
			}
		}
		if(j==0) {
			System.out.println(-1);
		}
		System.out.println("j="+(j+1));//j+1输出的是连字符j和1的组合，需要加括号（j+1）
		
	}
	
}
class Dog implements Comparable<Dog>{
	int a;//喜爱度
	int b;//领养成本
	int c;//喂养成本
	int ys;//喂养预算

	//对象内属性值比较，需要实现Comparable类重写compareTo方法
	@Override
	public int compareTo(Dog o) {
		return this.a-o.a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getYs() {
		return ys;
	}

	public void setYs(int ys) {
		this.ys = ys;
	}
	
	
	
}
