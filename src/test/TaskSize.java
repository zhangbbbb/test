package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskSize {
/**
 * 任务调度
 * 有A--Z种任务。相同任务之间冷却时间是n
 * 任务本身就是1时间完成
 * 给出一个序列，求完成所有任务的最小时间
 * @param tasks
 * @param n
 * @return
 */
//方法一：哈希表
//	思路：找出执行次数最多的任务，然后返回这个执行最多次数的时间加冷却+最后一个（如果其次执行次数最多的是并列，则依次加1）
//	题解：https://leetcode-cn.com/problems/task-scheduler/solution/jian-ming-yi-dong-de-javajie-da-by-lan-s-jfl9/
//	public int leastInterval(char[] tasks, int n) {
//		//maxEx执行最多的任务的次数
//		int maxEx = 0;
//		Map<Character,Integer> map = new HashMap<>();
//		for (char c : tasks) {
//			map.put(c, map.getOrDefault(c, 0)+1);
//			maxEx = Math.max(maxEx, map.get(c));
//		}
//		//最后一行的数量maxCount
//		int maxCount = 0;
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			if(maxEx == entry.getValue()) {
//				maxCount++;
//			}
//		}
//		//返回需注意：箱子没空位了就返回length
//		return Math.max((maxEx-1)*(n+1)+maxCount,tasks.length);
//    }
//方法二：用数组存储
//	同种思路
//	public int leastInterval(char[] tasks, int n) {
//		int[] maxEx = new int[26];
//		for (int i = 0; i < tasks.length; i++) {
//			maxEx[tasks[i]-'A'] ++;
//		}
//		Arrays.sort(maxEx);//排好序了，i=25是最大的，和下一个较小的24比，如果不一样就break for循环，一样的话灾判断23；
//		int maxCount = 1;
//		for (int i = 25; i > 0; i--) {
//			if(maxEx[i] == maxEx[i-1]) {
//				maxCount++;
//			}else {
//				break;//必须break，要不然会接着比较 24和23，23和22，可能23位置的数量=24位置的数量，maxCount++，导致maxCount数量不对
//			}
//		}
//		return Math.max((maxEx[25]-1)*(n+1)+maxCount, tasks.length);
//	}
	
	
}
