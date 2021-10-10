package aaa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JD {
/**
 * 输入一组数据，找出出现次数最多的那个数x，记录下来
 * 输出一个包含所有x的最短序列的下标
 * 
 * 例如：1 2 3 3 1 1 1 输出 1 7 因为最多的是1，包含所有1的最短序号是1--7
 * 例如：1 1 2 3 3 3 1 输出 4 6 因为最多的是1 和 3相同，只能判断谁的序列最短（AC关键）
 * @param args
 */
	//小树 good
	public static void main(String[] args) {
		class Data{
			int Left;
			int Right;
			int Count;
		}
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		int[] tmp = new int[str.length];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = Integer.valueOf(str[i]);
		}
		Map<Integer,Data> map = new HashMap<>();
		for (int i = 0; i < tmp.length; i++) {
			int v = tmp[i];
			Data data = map.get(v);
			if(data==null) {
				data = new Data();
				data.Left = i;
			}
			data.Right = i;
			data.Count++;
			map.put(v, data);
		}
		
		int max = 0;
		Data result = null;
		for(Map.Entry<Integer, Data> entry:map.entrySet()) {
			if (entry.getValue().Count>max) {
				max = entry.getValue().Count;
			}
		}
		int minLength = tmp.length+1;
		int left = 0;
		int right = 0;
		for(Map.Entry<Integer, Data> entry:map.entrySet()) {
			Data data = entry.getValue();
			if(data.Count!=max) {
				continue;
			}
			int length = data.Right-data.Left+1;
			if(length<minLength) {
				minLength = length;
				result = data;
			}	
		}
		System.out.println((result.Left+1)+" "+(result.Right+1));
		
	}

//82%  1 1 2 1 3 3 3 应该输出3的位置5 7才对
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String[] str = scan.nextLine().split(" ");
//		int[] tmp = new int[str.length];
//		for (int i = 0; i < tmp.length; i++) {
//			tmp[i] = Integer.valueOf(str[i]);
//		}
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i : tmp) {
//			map.put(i, map.getOrDefault(i, 0)+1);
//		}
//		int max = 0,index = 0;
//		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
//			if(entry.getValue()>max) {
//				max = entry.getValue();
//				index = entry.getKey();
//			}
//		}
//		int i=0,j=0;
//		for (int k = 0; k < tmp.length; k++) {
//			if(tmp[k]==index) {
//				i=k+1;
//				break;
//			}
//		}
//		
//		for (int k1 = tmp.length-1; k1 >= 0 ; k1--) {
//			if(tmp[k1] == index) {
//				j=k1+1;
//				break;
//			}
//		}
//		System.out.println(i+" "+j);
//	}
}
