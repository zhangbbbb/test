package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskSize {
/**
 * �������
 * ��A--Z��������ͬ����֮����ȴʱ����n
 * ���������1ʱ�����
 * ����һ�����У�����������������Сʱ��
 * @param tasks
 * @param n
 * @return
 */
//����һ����ϣ��
//	˼·���ҳ�ִ�д�����������Ȼ�󷵻����ִ����������ʱ�����ȴ+���һ����������ִ�д��������ǲ��У������μ�1��
//	��⣺https://leetcode-cn.com/problems/task-scheduler/solution/jian-ming-yi-dong-de-javajie-da-by-lan-s-jfl9/
//	public int leastInterval(char[] tasks, int n) {
//		//maxExִ����������Ĵ���
//		int maxEx = 0;
//		Map<Character,Integer> map = new HashMap<>();
//		for (char c : tasks) {
//			map.put(c, map.getOrDefault(c, 0)+1);
//			maxEx = Math.max(maxEx, map.get(c));
//		}
//		//���һ�е�����maxCount
//		int maxCount = 0;
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			if(maxEx == entry.getValue()) {
//				maxCount++;
//			}
//		}
//		//������ע�⣺����û��λ�˾ͷ���length
//		return Math.max((maxEx-1)*(n+1)+maxCount,tasks.length);
//    }
//��������������洢
//	ͬ��˼·
//	public int leastInterval(char[] tasks, int n) {
//		int[] maxEx = new int[26];
//		for (int i = 0; i < tasks.length; i++) {
//			maxEx[tasks[i]-'A'] ++;
//		}
//		Arrays.sort(maxEx);//�ź����ˣ�i=25�����ģ�����һ����С��24�ȣ������һ����break forѭ����һ���Ļ����ж�23��
//		int maxCount = 1;
//		for (int i = 25; i > 0; i--) {
//			if(maxEx[i] == maxEx[i-1]) {
//				maxCount++;
//			}else {
//				break;//����break��Ҫ��Ȼ����űȽ� 24��23��23��22������23λ�õ�����=24λ�õ�������maxCount++������maxCount��������
//			}
//		}
//		return Math.max((maxEx[25]-1)*(n+1)+maxCount, tasks.length);
//	}
	
	
}
