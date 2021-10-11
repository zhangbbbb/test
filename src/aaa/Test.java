package aaa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test {
	/**lc76
	 * Ѱ����̸����Ӵ�
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
				while(l<r && need[s.charAt(l)]<0) {//needֵ����0����Ҫ�ģ�û����һ��r��Ӧ��Ҫ������ȥ������������ȥ��needֵ--
					need[s.charAt(l)]++;//eg��need����ֵa = 2������Ҫ����needֵ++��Ȼ��ָ������
					l++;
				}
				if(r-l+1<size) {//������Ч������Сֵ
					size = r-l+1;
					start = l;
				}
				//��߽�����,���ڼ�����һλ��Ҫ���ַ������Լ�1 
				need[s.charAt(l)]++;
				l++;
				count++;
			}
			//�ұ߽�����
			r++;
		}
		return size ==Integer.MAX_VALUE?"":s.substring(start,start+size);
		
    }
	
	
	
	
	/**lc25
	 * k��һ�鷭ת����
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
		//����һ���ٽڵ㣬ʹ��ָ��head 
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		//��ʼ��pre��end��ָ��dummy��Ҳ���ǿ�ʼ�����ǰһ���ڵ�
		ListNode pre = dummy;
		ListNode end = dummy;
		
		
		while(end.next!=null) {
			//ѭ��k�Ρ���end����ÿ���ĩβλ��
			for (int i = 0; i < k && end!=null; i++) {//�������п�
				end = end.next;
			}
			if(end == null) {
				break;
			} 
			
			//�ȼ�¼��end��Ľڵ�
			ListNode next = end.next;
			//�Ͽ������ڵ�����ӣ���k���ڵ��ѽ�
			end.next = null;
			//��¼��Ҫ��ת������ĵ�һ��ֵ
			ListNode start = pre.next;
			//��ת
			pre.next = reverse(start);
			//��ת�� ��k��������һ��ָ���� ��һ���������
			start.next = next;
			//�ƶ�pre��������ͷ����ǰһ���ڵ�
			pre = start;
			end = start;
		}
		return dummy.next;
    }
	//��ת���� lc206
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
	   ��ת����
	 good https://leetcode-cn.com/problems/reverse-linked-list/solution/shi-pin-jiang-jie-die-dai-he-di-gui-hen-hswxy/
	 */
	//����һ��������
//	public ListNode reverseList(ListNode head) {
//		ListNode curr = head;
//		ListNode prev = null;
//		while(curr!=null) {
//			ListNode next = curr.next;//��next��¼һ��cur.next��λ��
//			curr.next = prev;//��cur����һ��ָ��ǰһ���������ϵ���next������
//			prev = curr;//�ƶ�����һ���ڵ�cur
//			curr = next;//�ƶ�����һ���ڵ�next
//		}
//		return prev;
//	}
	
	//���������ݹ鷨
//	public ListNode reverseList(ListNode head) {
//		//�ݹ���ֹ����
//		if(head == null|| head.next ==null) {
//			return head;
//		}
//		ListNode p = reverseList(head.next);
//		head.next.next = head;
//		head.next = null;
//		return p;
//	}
	
	
	
	
	
}
