package aaa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[] a = new int[30000];
//		int[] b = new int[30000];
//		String str = scan.nextLine();
//		String[] str1 = str.split(",");
//		int m1 = 0;
//		int m2 = 0;
//		for(int i=1;i<str1.length;i++) {
//			a[i] = Integer.valueOf(str1[i]);
//		}
//	}

	/**
	 * �ϲ�������������
	 */

	// ����һ������˫ָ��
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int p=0,q=0;
//		int curr;
//		int[] tmp = new int[m+n];
//		while(p<m||q<n) {
//			if(p==m) {
//				curr = nums2[q++];
//			}else if(q==n){
//				curr = nums1[p++];
//			}else if(nums1[p]<nums2[q]) {
//				curr = nums1[p++];
//			}else {
//				curr = nums2[q++];
//			}
//			tmp[p+q-1] = curr;
//		}
//		for (int i = 0; i < tmp.length; i++) {
//			nums1[i] = tmp[i];
//		}
//	}

	// ������������˫ָ��
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int p = m-1,q=n-1;
//		int tail = m+n-1;
//		int curr = 0;
//		while(p>=0||q>=0) {
//			if(p==-1 ){
//				curr = nums2[q--];
//			}else if(q ==-1) {
//				curr = nums1[p--];
//			}else if(nums1[p]<nums2[q]){
//				curr = nums2[q--];	
//			}else {
//				curr = nums1[p--];
//			}
//			nums1[tail--] = curr;
//		}
//	}
//	

	// ���������Ӻ���ǰ�Ƚϣ��о���ָ�������⣩
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int k = m+n-1;
//       
//        while(m>0&&n>0) {
//        	if(nums1[m-1]>nums2[n-1]) {
//        		nums1[k] = nums1[m-1];
//        		m--;
//        	}else {
//        		nums1[k] = nums2[n-1];
//        		n--;
//        	}
//        	k--;
//        }
//        for (int i = 0; i < n; i++) {//���nums1ʣ�࣬��nums2������n=0�����ѭ������ȥ�����nums2ʣ�࣬�϶��Ǳ�nums[0]ҪС��ֱ�Ӵ��nums1ǰ�����λ��
//			nums1[i] = nums2[i];
//		}
//    }

	public int[] singleNumbers(int[] nums) {
		int x = 0, y = 0, m = 1, n = 0;
		for (int num : nums) {
			n = n ^ num;
		}
		while ((m & n) == 0) {
			m <<= 1;
		}
		for (int num : nums) {
			if ((num & m) != 0) {
				x ^= num;
			} else {
				y ^= num;
			}
		}
		return new int[] { x, y };
	}
//
//	public int singleNumber(int[] nums) {
//		int[] counts = new int[32];
//
//		for (int num : counts) {
//			for (int j = 31; j >= 0; j--) {
//				counts[j] += num & 1;
//				num >>>= 1;
//			}
//		}
//		int res = 0;
//		for (int i = 0; i < 32; i++) {
//			res <<= 1;
//			res |= counts[i] % 3;
//		}
//		return res;
//	}
//
//	public int singleNumber(int[] nums) {
//		// ���յĽ��ֵ
//		int res = 0;
//		// int������32λ��ͳ��ÿһλ1�ĸ���
//		for (int i = 0; i < 32; i++) {
//			// ͳ�Ƶ�iλ��1�ĸ���
//			int oneCount = 0;
//			for (int j = 0; j < nums.length; j++) {
//				oneCount += (nums[j] >>> i) & 1;
//			}
//			// ���1�ĸ�������3�ı�����˵���Ǹ�ֻ����һ�ε�����
//			// �Ķ�����λ������һλ��1
//			if (oneCount % 3 == 1)
//				res |= 1 << i;
//		}
//		return res;
//	}

//	public static int majorityElement(int[] nums) {
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			if (map.containsKey(nums[i])) {
//				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//			} else {
//				map.put(nums[i], 1);
//			}
//		}
//
//		for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
//			if (entry.getValue() > nums.length / 2) {
//				return entry.getKey();
//			}
//		}
//		return -1;
//
//	}

	
//	public int singleNumber(int[] nums) {
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int num : nums) {
//			map.put(num,map.getOrDefault(num, 0)+1);
//		}
//		for(Integer key:map.keySet()) {
//			if(map.get(key)==1) {
//				return key;
//			}
//		}
//		return -1;
//	}
//	public int singleNumber(int[] nums) {
//		int res = 0;//���ս��ֵ
//		for (int i = 0; i < nums.length; i++) {
//			//ͳ�Ƶ�iλ�е�1�ĸ���
//			int oneCount = 0;
//			for (int j = 0; j < nums.length; j++) {
//				oneCount += (nums[j]>>>i)&1;
//			}
//			//���1�ĸ�������3�ı�����˵���Ǹ�ֻ����һ�ε����ֵĶ�����λ����һλ��1
//			if(oneCount%3==1) {
//				res= res|1<<i;
//			}
//		}
//		return res;
//	}

/**
 * �������
 */
//	˼·��������ָ�룬һ���ͷ��ʼ�ƶ���������ֵ������ӣ���������˽�λ���ѽ�λ��¼����������λ���һ����㡣
//		������һλ���Ҳ�����˽�λ����ô�ͼ�һ��Ϊ1�Ľ�㡣
	
//	������ǱȽϼ򵥵������Ŀ��ֻ��Ҫѭ��ͬʱ��������������Ӽ��ɡ�
//1.�����һ���������Ѿ�û��Ԫ������ֱ�Ӳ�0����λ����һ�����������У������������н�λ������newһ���ڵ㡣
//2.��Ҫһ��Ҫ����Ƕ�����Ĵ���������ѭ���лᷴ���������滻������һ��ʼҪnewһ������ָ���������ˡ�
//���ӣ�https://leetcode-cn.com/problems/add-two-numbers/solution/java-liang-shu-zhi-he-de-qing-xi-xie-fa-4chz2/
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		int tmp = 0;//�洢��λ
//		ListNode head = new ListNode();
//		ListNode res = head;
//		while(l1!=null||l2!=null) {
//			int val1 = l1==null?0:l1.val;
//			int val2 = l2==null?0:l2.val;
//			int sum = val1+val2+tmp;
//			
//			if (sum>=10) {
//				sum = sum-10;
//				tmp = 1;
//			}else {
//				tmp = 0;
//			}
//			res.next = new ListNode(sum);
//			res = res.next;
//			if(l1!=null) {
//				l1 = l1.next;
//			}
//			if(l2!=null) {
//				l2 = l2.next;
//			}
//		}
//		if(tmp==1) {
//			res.next = new ListNode(tmp);
//		}
//		return head.next;
//    }

/**
 * ��������ĵ�����k�����
 * @param head
 * @param k
 * @return
 */
//����һ������˫ѭ��	
//	public ListNode getKthFromEnd(ListNode head, int k) {
//		ListNode res = head;
//		int n = 0;
//		while(res.next!=null) {
//			res = res.next;
//			n++;
//		}
//		res = head;
//		for (int i = 1; i <= n-k+1; i++) {
//			res = res.next;
//		}
//		return res;
//    }
	
//��������˫ָ��
//	˼�룺����ָ���˼�롣
//	���ǽ���һ��ָ��fast ָ������ĵ�k+1 ���ڵ㣬�ڶ���ָ�� slow ָ������ĵ�һ���ڵ㣬
//	��ʱָ�� fast �� slow ����֮��պü�� k���ڵ㡣
//	��ʱ����ָ��ͬ������ߣ�����һ��ָ�� fast �ߵ������β���սڵ�ʱ�����ʱslow ָ��պ�ָ������ĵ�����k���ڵ㡣
//	public ListNode getKthFromEnd(ListNode head, int k) {
//		ListNode fast = head;
//		ListNode slow = head;
//		for (int i = 0; i < k; i++) {
//			fast = fast.next;
//		}
//		while(fast.next!=null) {
//			fast = fast.next;
//			slow = slow.next;
//		}
//		return slow;
//	}
	
/**
 * �ϲ��������������
 * @param l1
 * @param l2
 * @return
 */
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		ListNode res = new ListNode(0);
//		ListNode cur = res;
//		while(l1!=null&&l2!=null) {
//			if (l1.val<l2.val) {
//				cur.next = l1;
//				l1 = l1.next;
//			}else {
//				cur.next = l2;
//				l2 = l2.next;
//			}
//			cur = cur.next;
//		}
//		cur.next = l1==null?l2:l1;//l1��l2�����һ����Ϊ��
//		return res.next;
//	}

/**
 * �ϲ���������
 * @param intervals
 * @return
 */
//	public int[][] merge(int[][] intervals) {
//		
//    }
	
	
	
/**
 * �ϲ�������������
 * @param nums1
 * @param m
 * @param nums2
 * @param n
 */
//����һ����ָ��
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int k = m+n-1;
//		while(m>0&&n>0) {
//			if(nums1[m-1]>nums2[n-1]) {
//				nums1[k] = nums1[m-1];
//				m--;
//			}else {
//				nums1[k] = nums2[n-1];
//				n--;
//			}
//			k--;
//		}
//		for (int i = 0; i < n; i++) {//��ʱ��n�Ѿ�����֮ǰn--��һ���ˣ���ʣ��nums2�е�����
//			nums1[i] = nums2[i];
//		}
//	}
//	
//��������˫ָ������ (˼·��ϲ���������һ����)
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int p = m-1,q = n-1;
//		int tail = m+n-1;
//		int cur = 0;
//		while(p>=0||q>=0) {
//			if(p==-1) {
//				cur = nums2[q--];
//			}else if(q==-1) {
//				cur = nums1[p--];
//			}else if(nums1[p]>nums2[q]){
//				cur = nums1[p--];
//			}else {
//				cur = nums2[q--];
//			}
//			nums1[tail--] = cur;
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
}
