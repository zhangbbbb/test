package aaa;

import java.util.Arrays;
import java.util.Scanner;


public class JD2 {
/**
 * СA����
 * 
 * �ҵ�ι���ɱ��������ɱ���������Ԥ��ģ���ϲ���Ƚϴ����ֻ��
 * ι��Ԥ��=ι��Ԥ��ϵ��d/����n  * ����
 * 
 * ���룺��һ����3��������n��ʾ����������k��ʾ��������Ԥ�㣬d��ʾι��Ԥ��ϵ��
 * 	   �ڶ�����n����������a1��a2����ʾСA��ÿֻ����ϲ����
 * 	   ��������n����������b1��b2������ʾÿֻ���������ɱ�
 *           ��������n����������c1��c2������ʾÿֻ����ÿ��ι���ɱ�
 *�������СA������Χ��������������ϲ���Ĺ� ����Ӧ�ĵ�ϲ��ֵ�����û�У����-1.
 
 ���磺
  5 100 100
  1 2 3 4 5
  30 60 90 120 150
  11 22 44 88 176
  
  3
  
      ԭ��ι��Ԥ��������20 40 60 80 1 0 0��ֻ��ѡ��1 2 3�Ĺ�
  	������Ҳ�� 1 2 3 �Ĺ���ϲ�������Ϊ3
  	
 */
	
//��֪�ܹ�����
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
//�������ͬһ�ж�ȡ
//		for (int i = 0; i < n; i++) {
//			dogs[i].a = scan.nextInt();
//			dogs[i].ys = (d/n )* dogs[i].a; 
//		}
		
//�������ͬһ�У����³�ʼScanner
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
		System.out.println("j="+(j+1));//j+1����������ַ�j��1����ϣ���Ҫ�����ţ�j+1��
		
	}
	
}
class Dog implements Comparable<Dog>{
	int a;//ϲ����
	int b;//�����ɱ�
	int c;//ι���ɱ�
	int ys;//ι��Ԥ��

	//����������ֵ�Ƚϣ���Ҫʵ��Comparable����дcompareTo����
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
