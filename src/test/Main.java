package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int ns[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            ns[i] = scan.nextInt();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (i == j) {
//                    continue;
//                } else {
//                    if (ns[i] * ns[j] == i + j + 2) {
//                        count++;
//                    }
//                }
//            }
//        }
//
//        System.out.println(count);
//    }

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			char[] cs = input.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				if (map.containsKey(cs[i])) {
					map.replace(cs[i], map.get(cs[i]) + 1);
				} else {
					map.put(cs[i], 1);
				}
			}
	
			int[] count = new int[map.size()];
			final int[] i = { 0 };
			map.forEach((k, v) -> {
				map.forEach((nk, nv) -> {
					if (nv > v) {
						count[i[0]] += nv - v;
					} else {
						count[i[0]] += v - nv;
					}
				});
				i[0]++;
			});
	
			Arrays.sort(count);
			System.out.println(count[0]);
		}

}