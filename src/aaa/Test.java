package aaa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test {
	/**lc76
	 * 寻找最短覆盖子串
	 * @param s
	 * @param t
	 * @return
	 */
	public String minWindow(String s, String t) {
		if(s == null || s.length() == 0 || t==null||t.length()==0) {	
			return "";
		}
		int[] need = new int[128];
		Map<Character,Integer> sMap = new HashMap<>();
		char[] tChar = t.toCharArray();
		for (char c : tChar) {
			need[c]++;
		}
		int l=0,r=0,size=Integer.MAX_VALUE,count = t.length(),start=0;
		while(r<s.length()) {
			char c = s.charAt(r);
			if(need[c]>0) {
				count--;
			}
			need[c]--;
			if(count==0) {
				while(l<r && need[s.charAt(l)]<0) {//need值大于0是需要的，没遇到一个r对应的要包括进去的数，包括进去了need值--
					need[s.charAt(l)]++;//eg，need中有值a = 2，不需要了让need值++，然后指针右移
					l++;
				}
				if(r-l+1<size) {//更新有效区间最小值
					size = r-l+1;
					start = l;
				}
				//左边界右移,由于减少了一位需要的字符，所以加1 
				need[s.charAt(l)]++;
				l++;
				count++;
			}
			//右边界右移
			r++;
		}
		return size ==Integer.MAX_VALUE?"":s.substring(start,start+size);
		
    }
	
	
	
	
	/**lc25
	 * k个一组翻转链表
	 * @author LazyGarfieldCat
	 *
	 */
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head==null || head.next==null) {
			return head;
		}
		//定义一个假节点，使其指向head 
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		//初始化pre和end都指向dummy，也就是开始链表的前一个节点
		ListNode pre = dummy;
		ListNode end = dummy;
		
		
		while(end.next!=null) {
			//循环k次。让end到达每组的末尾位置
			for (int i = 0; i < k && end!=null; i++) {//忘记了判空
				end = end.next;
			}
			if(end == null) {
				break;
			} 
			
			//先记录下end后的节点
			ListNode next = end.next;
			//断开与后面节点的连接，让k个节点脱节
			end.next = null;
			//记录下要翻转的链表的第一个值
			ListNode start = pre.next;
			//翻转
			pre.next = reverse(start);
			//翻转后 让k链表的最后一个指针与 下一节链表接上
			start.next = next;
			//移动pre到新链表头结点的前一个节点
			pre = start;
			end = start;
		}
		return dummy.next;
    }
	//翻转链表 lc206
	public ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		ListNode curr = head;
		while(curr!=null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	/**
	 lc206
	   翻转链表
	 good https://leetcode-cn.com/problems/reverse-linked-list/solution/shi-pin-jiang-jie-die-dai-he-di-gui-hen-hswxy/
	 */
	//方法一：迭代法
//	public ListNode reverseList(ListNode head) {
//		ListNode curr = head;
//		ListNode prev = null;
//		while(curr!=null) {
//			ListNode next = curr.next;//用next记录一下cur.next的位置
//			curr.next = prev;//让cur的下一个指向前一个，这里会断掉跟next的连接
//			prev = curr;//移动到下一个节点cur
//			curr = next;//移动到下一个节点next
//		}
//		return prev;
//	}
	
	//方法二：递归法
//	public ListNode reverseList(ListNode head) {
//		//递归终止条件
//		if(head == null|| head.next ==null) {
//			return head;
//		}
//		ListNode p = reverseList(head.next);
//		head.next.next = head;
//		head.next = null;
//		return p;
//	}
	
	
	
	
	
}
