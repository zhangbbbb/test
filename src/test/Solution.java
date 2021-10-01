package test;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {

//	// 用两个栈实现队列
//	Stack<Integer> s1 = new Stack<Integer>();
//	Stack<Integer> s2 = new Stack<Integer>();
//
//	public void appendTail(int value) {
//		s1.push(value);
//	}
//
//	public int deleteHead() {
//		if(s2.isEmpty()) {
//			if(s1.isEmpty()) {
//				return -1;
//			}
//			while(s1!=null) {
//				s2.push(s1.pop());
//			}
//		}
//		return s2.pop();
//	}

//	
//	//包含min函数的栈
//	Stack<Integer> data = new Stack<>();
//	Stack<Integer> mins = new Stack<>();
//	public void push(int x) {
//		data.push(x);
//		if(mins!=null&&x<mins.peek()) {
//			mins.push(x);
//		}else {
//			mins.push(mins.peek());
//		}
//	}
//    public void pop() {
//    	mins.pop();
//    	data.pop();
//    }
//
//    public int top() {
//    	return data.peek();
//    }    
//    public int min() {
//    	return mins.peek();
//    }

//	// 倒序打印链表
//	public class ListNode {
//		int val;
//		ListNode next;
//		ListNode(int x) {
//			val = x;
//		}
//	}
//方法一：
//	public int[] reversePrint(ListNode head) {
//		ListNode tmp = head;
//		
//		//先数一遍有多少个数
//		int count =0;
//		while(tmp!=null) {
//			tmp = tmp.next;
//			count++;
//		}
//		//数组倒序输入进去
//		int[] arr = new int[count];
//		tmp = head;
//		for(int i = count;i>0;i--) {
//			arr[i] = tmp.val;
//			tmp = tmp.next;
//		}
//		return arr;
//	}
//方法二：
//	public int[] reversePrint(ListNode head) {
//		Stack<Integer> data = new Stack<Integer>();
//		ListNode tmp = head;
//		while(tmp!=null) {
//			data.push(tmp.val);
//			tmp = tmp.next;
//		}
//		int[] arr = new int[data.size()];
//		for(int i=0;i<data.size();i++) {
//			arr[i] = data.pop();
//		}
//		return arr;		
//	}

}
