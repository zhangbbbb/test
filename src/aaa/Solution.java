package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

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
 https://leetcode-cn.com/problems/merge-sorted-array/
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
/**���������ֳ��ֵĴ���
 * ֻ��һ�����ֳ���һ�Σ��������ֶ�����������
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
 */
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
	
/**
 * ��һ���ַ���������ظ����ִ�
 * @param s
 * @return
 */
//����һ��myself����ѭ�� ���ӶȲ�̫��
//	public int lengthOfLongestSubstring(String s) {
//		Map<Character,Integer> map = new HashMap<>();
//		char[] tmp = s.toCharArray();
//		if(tmp.length==0) {
//			return 0;
//		}
//		int max = 1;
//		for (int i = 0; i < tmp.length; i++) {
//			map.put(s.charAt(i),1);
//			for (int j = i+1; j < tmp.length; j++) {
//				if(!map.containsKey(s.charAt(j))) {
//					map.put(s.charAt(j), 1);
//					max = Math.max(max, j-i+1);
//				}else {
//					break;
//				}
//			}
//			map.clear();
//		}
//		return max;
//	}
//������������ָ�룬˫ָ��ǰ���ƶ�
//	public static int lengthOfLongestSubstring(String s) {
//		Map<Character, Integer> map = new HashMap<>();
//		int i = 0,j = -1;
//		int max = j-i+1;
//		for (int k = 0; k < s.length(); k++) {
//			if(!map.containsKey(s.charAt(k))) {
//				map.put(s.charAt(k), k);
//				j++;
//				max = Math.max(max, j-i+1);
//			}else {
//				i--;
//				//����û�����i��Ԫ��
//			}
//		}
//		return max;
//	}
/**
 *������ظ��ַ������ַ���
https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 * @param s
 * @return
 */
	
	public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = -1;
        for(int right = 0;right < s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right)));
            }
            map.put(s.charAt(right),right);
            maxLen = Math.max(maxLen,right - left);
        }
        return maxLen;
    }
	public static void main(String[] args) {
		lengthOfLongestSubstring("abcaaabcabc");
	}
	
	
	
/**
 * ��Ʊ���������
 * @param prices
 * @return
 */
//����һ������˫ѭ��
//	public int maxProfit(int[] prices) {
//		int sum = 0,max = 0;
//		for (int i = 0; i < prices.length; i++) {
//			for (int j = i; j < prices.length; j++) {
//				sum= prices[j]-prices[i];
//				max = Math.max(max, sum);
//			}
//			sum = 0;
//		}
//		return max;
//	}

//��������good
//	public int maxProfit(int[] prices) {
//		int maxfit = 0,min=Integer.MAX_VALUE;//min������������0�����ܶ��Ǹ������ͽ�������һ��ѭ������
//		for (int i = 0; i < prices.length; i++) {
//			//��¼��ʷ��͵�һ��
//			if(prices[i]<min) {//û�н������û�б�minС��
//				min = prices[i];
//			}
//			//�����ڵļ�ȥ��͵�һ�죬��֮ǰ��¼���������Ƚ�
//			if(prices[i]-min>maxfit) {//���ؼ�һ�����ͻ��õ�ǰֵ������-min ������õĲ�ֵ�ǲ������ģ�����Ǽ�¼����
//				maxfit = prices[i]-min;
//			}
//		}
//		return maxfit;
//	}
	
/**
 * 0--n-1ȱ�ٵ�����
 *   ��n-1�ĵ�������������
 * @param nums
 * @return
 */
//����һ��myself nums[i]+1��nums[i+1]�Ƚϣ�ע��forѭ���ı߽�-1
//	public int missingNumber(int[] nums) {
//		//�ж��ǲ��ǵ�һ��������
//        if(nums[0]!=0) {
//			return 0;
//		}
//        //�ж��ǲ����м��������
//		for (int i = 0; i < nums.length-1; i++) {
//			if(nums[i]+1!=nums[i+1]) {
//				return nums[i]+1;
//			}else{
//               continue;
//            }
//		}
//        //ֻ�������һ������
//        return nums.length;//[0,1,2] ����3
//    }
//�����������ַ�
//	public int missingNumber(int[] nums) {
//		int i=0,mid,j=nums.length-1;
//		while(i<=j) {
//			mid = (i+j)/2;
//			if(mid==nums[mid]) {
//				i = mid + 1;
//			}else {
//				j = mid - 1;
//			}
//		}
//		return i;
//	}
/**
 * ����һ��target�����������������������ļ���
 * Ҫ������������������������ɵ�
 * ���Ի�����߽����>=target/2
 * @param target
 * @return
 */
//��������������
//	public int[][] findContinuousSequence(int target) {
//		List<int[]> list = new ArrayList<>();
//		int l =1,r =1,sum=0;//��������  ���ұ߽�
//		while(l<=target/2) {
//			if(sum>target) {
//				sum-=l;//������ 
//				l++;
//			}else if(sum < target){
//				sum+=r;
//				r++;
//			}else {
//				int[] tmp = new int[r-l];//���������l++���������ﲻ��r-l+1��
//				for (int i = l; i < r; i++) {
//					tmp[i-l] = i;
//				}
//				list.add(tmp);//�����Ǵ��ȥ
//				sum-=l;//�����Ǽ���l���ٴ�l+1��ʼ
//				l++;
//			}
//		}
//		return list.toArray(new int[list.size()][]);//������listת�ɾ������
//    }
//	
	
/**
 * ����һ���������һ��k���ҳ���Ϊk������������
 * �������п���Ϊ1������
 * 
�ѵ㣺
*����:nums = [1,1,1], k = 2
*���: 2
����: ���� [1,1] �� [1,1] Ϊ���ֲ�ͬ�����
 * @param nums
 * @param k
 * @return
 */
//�������⣺new int[] {1,2,1,2,1}, 3) ��Ŀ˵�������������飬�Ͳ�������
	//�и���������£������û������ڣ���֪��������������
//	public static int subarraySum(int[] nums, int k) {
//		if(k<=0) {
//			return 0;
//		}
//		int i = 0,j=0,sum = 0,res = 0;
//		while(i<=nums.length-1 && j<=nums.length) {
//			if(sum>k) {
//				sum-=nums[i];
//				i++;
//			}else if(sum<k&&j<=nums.length-1) {
//				sum+=nums[j];
//				j++;
//			}else if(sum==k&&i<=nums.length-1){
//				res++;
//				sum-=nums[i];
//				i++;
//			}else {
//				break;
//			}
//		}
//		return res;
//    }
//������ǰ׺��+��ϣ�� 
	public int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int res = 0,sum = 0;
		for (int num : nums) {
			sum+=num;
			if(map.containsKey(sum-k)) {
				res+=map.get(sum-k);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return res;
	}
	
/**
 * ������	
 * @param x
 * @return
 */
//����һ��ǰ��ָ�����м��ƶ�
//	public boolean isPalindrome(int x) {
//		char[] tmp = String.valueOf(x).toCharArray();//�ؼ�һ������int����ת��String����String��toCharArray()����
//		int i=0,j=tmp.length-1;
//		while(i<=j) {
//			if(tmp[i]!=tmp[j]) {
//				return false;
//			}else {
//				i++;
//				j--;
//			}
//		}
//		return true;
//    }
//����������תһ������
//	public boolean isPalindrome(int x) {
//		if(x<0 || (x%10 == 0 && x!=0)) {
//			return false;
//		}
//		int reversenumber = 0;
//		while(x>reversenumber) {
//			reversenumber = x%10+reversenumber*10;//1 12 123
//			x/=10;//1232 123 12����(x<reversenumber��ż��ʱ�����Ҳ������) x��������ʱ���ж�ʱ��Ҫ��reversenumber/10ȥ���м�λ�Ƚ�
//		}
//		return reversenumber==x || reversenumber/10 ==x ;
//	}

	
/**leecode543
 * ��������ֱ�� 
 * ���������ڵ㳤�ȵ����ֵ
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * @param root
 * @return
 */
	
	/*public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }	*/
	
//	int res = 0;
//	public int diameterOfBinaryTree(TreeNode root) {
//		deepSearch(root);
//		return res;
//    }
//	public int deepSearch(TreeNode root) {
//		if(root==null) {
//			return 0;
//		}	
//		int leftDepth = deepSearch(root.left);
//		int rightDepth = deepSearch(root.right);
//		res = Math.max(res,leftDepth+rightDepth) ;
//		return Math.max(leftDepth,rightDepth)+1;
//	}
//	
	
	
/**lc101
 * k��һ�鷭ת����
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/submissions/
 * @param head
 * @param k
 * @return
 */
	//˼·������һ���ٽڵ㣬������ǰ�档
	//ÿ�ο�ʼǰpre��end������һ���ĩβ����һ���ʱ����Ҫ����һ���ٽڵ������һ��ĩβ
	//Ȼ����end�ƶ�����ǰ���ĩβ��start�ڿ�ͷ�����з�ת
	//��ת��ɺ󣬽���ƴ��,����һ��ĩβ��preƴ���Ϸ�ת��ĵ�һλ
	//ѭ������ƴ�ӣ���start����һ�鿪ͷƴ�ϣ�start��λ�ڵ�ǰ���ĩβ�ˡ���pre��endҲ����ǰ�飨��һ�鿪ʼ�����൱����һ��ĩβ����ĩβ����ʼ��һ��
//	public ListNode reverseKGroup(ListNode head, int k) {
//		if(head == null || head.next ==null) {//head.next==null Ϊһ���ڵ�head��Ҳ���÷�ת
//			return head;
//		}
//		//����ٽڵ�
//		ListNode dummy = new ListNode(0);
//		dummy.next = head;
//		ListNode pre = dummy;
//		ListNode end = dummy;
//		while(end.next!=null) {
//			for (int i = 0; i < k && end!=null; i++) {
//				end = end.next;
//			}
//			//�����ж�end�ǲ���Ϊnull
//			if(end==null) {
//				break;
//			}
//			
//			//��next��¼��һ��Ŀ�ͷ
//			ListNode next = end.next;
//			//�Ͽ�����
//			end.next = null;
//			//��¼��ʼ�Ľڵ�
//			ListNode start = pre.next;
//			//��ʼ��ת
//			pre.next = reverse(start);//����˭ƴǰ
//			//ƴ����һ��
//			start.next = next;//����ƴ��
//			//����pre end
//			pre = start;
//			end = start;
//		}
//		return dummy.next;
//	}
//	public ListNode reverse(ListNode head) {
//		ListNode prev = null;
//		ListNode curr = head;
//		while(curr!=null) {
//			ListNode next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
//		return prev;
//	}
//	public class ListNode {
//		int val;
//		ListNode next;
//		ListNode(){
//			
//		}
//		ListNode(int val){
//			this.val = val;
//		}
//		ListNode(int val,ListNode next){
//			this.val = val;
//			this.next = next;
//		}
//	}
	
/**lc76
 * ��С�����Ӵ�
 * https://leetcode-cn.com/problems/minimum-window-substring/
 * @param s
 * @param t
 * @return
 */
	//�����������
//	 public String minWindow(String s, String t) {
//		int[] hole = new int[128];
//		for (char c : t.toCharArray()) {
//			hole[c]--;
//		}
//		int count = 0;
//		String res = "";
//		int length = s.length() + 1;
//		for (int i = 0, j = 0; j < s.length(); j++) {//���Ĵ�д��i<s.length()
//			char ch = s.charAt(j);
//			if (hole[ch] < 0) {
//				count++;
//			}
//
//			// ���󴰿�
//			hole[ch]++;
//			// ��С����
//			while (i < j && hole[s.charAt(i)] > 0) {
//				hole[s.charAt(i++)]--;
//			}
//			// �����Ӵ�
//			if (count == t.length() && length > j - i + 1) {
//				length = j - i + 1;
//				res = s.substring(i, j + 1);
//			}
//		}
//		return res;
//
//	 }
	
	
	
	
	
	
}
