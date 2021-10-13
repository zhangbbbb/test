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
 * 合并两个有序数组
 https://leetcode-cn.com/problems/merge-sorted-array/
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
/**数组中数字出现的次数
 * 只有一个数字出现一次，其他数字都出现了三次
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
	
/**
 * 求一个字符串中最长无重复的字串
 * @param s
 * @return
 */
//方法一：myself暴力循环 复杂度不太好
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
//方法二：设置指针，双指针前后移动
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
//				//这里没有清空i的元素
//			}
//		}
//		return max;
//	}
/**
 *最长不含重复字符的子字符串
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
 * 股票的最大收益
 * @param prices
 * @return
 */
//方法一：暴力双循环
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

//方法二：good
//	public int maxProfit(int[] prices) {
//		int maxfit = 0,min=Integer.MAX_VALUE;//min不可以设置是0，可能都是负数，就进不到第一个循环里了
//		for (int i = 0; i < prices.length; i++) {
//			//记录历史最低的一天
//			if(prices[i]<min) {//没有进入就是没有比min小的
//				min = prices[i];
//			}
//			//用现在的减去最低的一天，跟之前记录的最大利润比较
//			if(prices[i]-min>maxfit) {//（关键一步）就会拿当前值来这里-min 看看获得的差值是不是最大的，如果是记录下来
//				maxfit = prices[i]-min;
//			}
//		}
//		return maxfit;
//	}
	
/**
 * 0--n-1缺少的数字
 *   在n-1的递增排序数组中
 * @param nums
 * @return
 */
//方法一：myself nums[i]+1与nums[i+1]比较，注意for循环的边界-1
//	public int missingNumber(int[] nums) {
//		//判断是不是第一个数丢了
//        if(nums[0]!=0) {
//			return 0;
//		}
//        //判断是不是中间的数丢了
//		for (int i = 0; i < nums.length-1; i++) {
//			if(nums[i]+1!=nums[i+1]) {
//				return nums[i]+1;
//			}else{
//               continue;
//            }
//		}
//        //只能是最后一个丢了
//        return nums.length;//[0,1,2] 返回3
//    }
//方法二：二分法
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
 * 给出一个target。返回能组成它的连续数组的集合
 * 要求连续数组是至少两个数组成的
 * 所以滑动左边界最大到>=target/2
 * @param target
 * @return
 */
//方法：滑动窗口
//	public int[][] findContinuousSequence(int target) {
//		List<int[]> list = new ArrayList<>();
//		int l =1,r =1,sum=0;//滑动窗口  左右边界
//		while(l<=target/2) {
//			if(sum>target) {
//				sum-=l;//别忘记 
//				l++;
//			}else if(sum < target){
//				sum+=r;
//				r++;
//			}else {
//				int[] tmp = new int[r-l];//上面进行了l++，所以这里不用r-l+1了
//				for (int i = l; i < r; i++) {
//					tmp[i-l] = i;
//				}
//				list.add(tmp);//别忘记存进去
//				sum-=l;//别忘记减掉l，再从l+1开始
//				l++;
//			}
//		}
//		return list.toArray(new int[list.size()][]);//别忘记list转成矩阵输出
//    }
//	
	
/**
 * 给出一个整数组和一个k。找出和为k的连续子序列
 * （子序列可以为1个数）
 * 
难点：
*输入:nums = [1,1,1], k = 2
*输出: 2
解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
 * @param nums
 * @param k
 * @return
 */
//理解错题意：new int[] {1,2,1,2,1}, 3) 题目说的是连续子数组，就不能排序
	//有负数的情况下，不适用滑动窗口，不知道是往左还是往右
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
//方法：前缀和+哈希表 
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
 * 回文数	
 * @param x
 * @return
 */
//方法一：前后指针向中间移动
//	public boolean isPalindrome(int x) {
//		char[] tmp = String.valueOf(x).toCharArray();//关键一步。把int整数转成String，用String的toCharArray()方法
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
//方法二：反转一半数字
//	public boolean isPalindrome(int x) {
//		if(x<0 || (x%10 == 0 && x!=0)) {
//			return false;
//		}
//		int reversenumber = 0;
//		while(x>reversenumber) {
//			reversenumber = x%10+reversenumber*10;//1 12 123
//			x/=10;//1232 123 12跳出(x<reversenumber，偶数时会等于也会跳出) x是奇数的时候，判断时需要把reversenumber/10去掉中间位比较
//		}
//		return reversenumber==x || reversenumber/10 ==x ;
//	}

	
/**leecode543
 * 二叉树的直径 
 * 任意两个节点长度的最大值
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
 * k个一组翻转链表
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/submissions/
 * @param head
 * @param k
 * @return
 */
	//思路：设置一个假节点，放在最前面。
	//每次开始前pre和end都在上一组的末尾。第一组的时候需要设置一个假节点代替上一组末尾
	//然后让end移动到当前组的末尾。start在开头，进行反转
	//翻转完成后，进行拼接,让上一组末尾的pre拼接上反转后的第一位
	//循环进行拼接，让start和下一组开头拼上，start就位于当前组的末尾了。让pre和end也到当前组（下一组开始，就相当于上一组末尾）的末尾，开始下一组
//	public ListNode reverseKGroup(ListNode head, int k) {
//		if(head == null || head.next ==null) {//head.next==null 为一个节点head，也不用翻转
//			return head;
//		}
//		//定义假节点
//		ListNode dummy = new ListNode(0);
//		dummy.next = head;
//		ListNode pre = dummy;
//		ListNode end = dummy;
//		while(end.next!=null) {
//			for (int i = 0; i < k && end!=null; i++) {
//				end = end.next;
//			}
//			//忘记判断end是不是为null
//			if(end==null) {
//				break;
//			}
//			
//			//用next记录下一组的开头
//			ListNode next = end.next;
//			//断开连接
//			end.next = null;
//			//记录开始的节点
//			ListNode start = pre.next;
//			//开始翻转
//			pre.next = reverse(start);//忘记谁拼前
//			//拼接下一组
//			start.next = next;//忘记拼后
//			//更新pre end
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
 * 最小覆盖子串
 * https://leetcode-cn.com/problems/minimum-window-substring/
 * @param s
 * @param t
 * @return
 */
	//滑动窗口填坑
//	 public String minWindow(String s, String t) {
//		int[] hole = new int[128];
//		for (char c : t.toCharArray()) {
//			hole[c]--;
//		}
//		int count = 0;
//		String res = "";
//		int length = s.length() + 1;
//		for (int i = 0, j = 0; j < s.length(); j++) {//粗心错写成i<s.length()
//			char ch = s.charAt(j);
//			if (hole[ch] < 0) {
//				count++;
//			}
//
//			// 扩大窗口
//			hole[ch]++;
//			// 缩小窗口
//			while (i < j && hole[s.charAt(i)] > 0) {
//				hole[s.charAt(i++)]--;
//			}
//			// 计算子串
//			if (count == t.length() && length > j - i + 1) {
//				length = j - i + 1;
//				res = s.substring(i, j + 1);
//			}
//		}
//		return res;
//
//	 }
	
	
	
	
	
	
}
