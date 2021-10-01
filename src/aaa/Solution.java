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
	 * 合并两个逆序数组
	 */

	// 方法一：正向双指针
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

	// 方法二：逆向双指针
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

	// 方法三：从后向前比较（感觉有指针更好理解）
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
//        for (int i = 0; i < n; i++) {//如果nums1剩余，那nums2的数量n=0，这个循环进不去。如果nums2剩余，肯定是比nums[0]要小，直接存进nums1前面空余位置
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
//		// 最终的结果值
//		int res = 0;
//		// int类型有32位，统计每一位1的个数
//		for (int i = 0; i < 32; i++) {
//			// 统计第i位中1的个数
//			int oneCount = 0;
//			for (int j = 0; j < nums.length; j++) {
//				oneCount += (nums[j] >>> i) & 1;
//			}
//			// 如果1的个数不是3的倍数，说明那个只出现一次的数字
//			// 的二进制位中在这一位是1
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
//		int res = 0;//最终结果值
//		for (int i = 0; i < nums.length; i++) {
//			//统计第i位中的1的个数
//			int oneCount = 0;
//			for (int j = 0; j < nums.length; j++) {
//				oneCount += (nums[j]>>>i)&1;
//			}
//			//如果1的个数不是3的倍数，说明那个只出现一次的数字的二进制位中这一位是1
//			if(oneCount%3==1) {
//				res= res|1<<i;
//			}
//		}
//		return res;
//	}

/**
 * 两数相加
 */
//	思路：找两个指针，一起从头开始移动，并把数值进行相加，如果产生了进位，把进位记录下来，跟下位结果一起计算。
//		如果最后一位相加也产生了进位，那么就加一个为1的结点。
	
//	这道题是比较简单的相加题目，只需要循环同时遍历两个链表相加即可。
//1.如果有一个链表中已经没有元素了则直接补0，进位放在一个公共变量中，最后如果还是有进位别忘了new一个节点。
//2.还要一个要点就是对链表的处理，由于在循环中会反复把链表替换，所以一开始要new一个链表指向链表的最顶端。
//链接：https://leetcode-cn.com/problems/add-two-numbers/solution/java-liang-shu-zhi-he-de-qing-xi-xie-fa-4chz2/
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		int tmp = 0;//存储进位
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
 * 输入链表的倒数第k个结点
 * @param head
 * @param k
 * @return
 */
//方法一：暴力双循环	
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
	
//方法二：双指针
//	思想：快慢指针的思想。
//	我们将第一个指针fast 指向链表的第k+1 个节点，第二个指针 slow 指向链表的第一个节点，
//	此时指针 fast 与 slow 二者之间刚好间隔 k个节点。
//	此时两个指针同步向后走，当第一个指针 fast 走到链表的尾部空节点时，则此时slow 指针刚好指向链表的倒数第k个节点。
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
 * 合并两个排序的链表
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
//		cur.next = l1==null?l2:l1;//l1和l2最多有一个会为空
//		return res.next;
//	}

/**
 * 合并有序区间
 * @param intervals
 * @return
 */
//	public int[][] merge(int[][] intervals) {
//		
//    }
	
	
	
/**
 * 合并两个有序数组
 * @param nums1
 * @param m
 * @param nums2
 * @param n
 */
//方法一：无指针
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
//		for (int i = 0; i < n; i++) {//此时的n已经经过之前n--不一样了，是剩余nums2中的数量
//			nums1[i] = nums2[i];
//		}
//	}
//	
//方法二：双指针逆序 (思路与合并两个链表一样的)
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
