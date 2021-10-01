package test;


public class D20 {
/**
* 根据先序遍历和中序遍历
* 求这棵树
*/
//思路：用线序的第一个节点去中序中找到对应的位置i，i之前的为左子树，i之后的为右子树
//	public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode node = createTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
//		return node;
//	}
//	public TreeNode createTree(int[] preorder, int[] inorder,int preStart,int preEnd,int inStart,int inEnd) {
//		if(preStart>preEnd||inStart>inEnd) {
//			return null;
//		}
//		TreeNode curr = new TreeNode(preorder[preStart]) ;
//		if(preStart == preEnd) {//！！必须加上
//			return curr;
//		}
//		
//		int inCurrIndex = 0;
//		for (int i = inStart; i <= inEnd; i++) {//！！要<=
//			if(inorder[i]==preorder[preStart]) {
//				inCurrIndex = i;
//                break;//找到就跳出
//			}
//		}
//		int leftLength = inCurrIndex - inStart;//左子树的长度
//		curr.left = createTree(preorder, inorder, preStart+1, preStart+leftLength, inStart, inCurrIndex-1);
//		curr.right = createTree(preorder, inorder, preStart+leftLength+1, preEnd, inCurrIndex+1, inEnd);
//		return curr;
//	}
//	
	
	
	
	
/**扩展：
 * 根据后序遍历和中序遍历
 * 求这棵树
 * 题解：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/solution/jian-zhi-offer-07-zhong-jian-er-cha-shu-v7nl8/
 */
//myself
//	public TreeNode buildTree(int[] postorder, int[] inorder) {
//		return createTree(postorder, inorder, 0, postorder.length-1, 0, inorder.length-1);
//	}
//	public TreeNode createTree(int[] postorder,int[] inorder,int postStart,int postEnd,int inStart,int inEnd) {
//		if(postStart>postEnd||inStart>inEnd) {
//			return null;
//		}
//		TreeNode curr = new TreeNode(postorder[postEnd]);
//		if(postStart == postEnd) {
//			return curr;
//		}
//		int inCurrIndex = 0;
//		for (int i = inStart; i <= inEnd; i++) {
//			if(inorder[i]==postorder[postEnd]) {
//				inCurrIndex = i;
//				break;
//			}
//		}
//		int leftLength = inCurrIndex-inStart;
//		curr.left = createTree(postorder, inorder, postStart, postStart+leftLength-1, inStart, inCurrIndex-1);
//		curr.right = createTree(postorder, inorder, postStart+leftLength, inEnd-1, inCurrIndex+1, inEnd);
//		return curr;
//	}
	
/**
 * 判断一个序列是否是这棵树的后序遍历结果
 * 
 * 思路：二叉搜索树的特点是左子树的值<根节点<右子树的值。而后续遍历的顺序是：
                                                            左子节点→右子节点→根节点
   link：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/di-gui-he-zhan-liang-chong-fang-shi-jie-jue-zui-ha/
 */
	
//	public boolean verifyPostorder(int[] postorder) {
//		return helper(postorder, 0, postorder.length-1);
//    }
//	public boolean helper(int[] postorder,int left,int right) {
//		if(left>=right) {//left>right说明没有节点。left=right只有一个节点也不需要比较了，也就是递归的最小单位到一个节点时返回true
//			return true;
//		}
//		//因为数组中 postorder[right]是根节点，这里从左往右找出第一个比节点大的值，它后面的节点都是根节点的右子节点，它前面的都是根节点的左子节点
//		int mid = left;
//		int root = postorder[right];
//		while(postorder[mid]<root) {
//			mid++;
//		}
//		//mid前面的都要比root小，上面已判断
//		//还需要确定mid后的值都要比根节点root大，如果有比他小的直接返回false
//		int tmp = mid;
//		while(tmp<right) {
//			if(postorder[tmp++]<root) {
//				return false;
//			}
//		}
//		//对左右子边的节点再继续递归调用
//		return helper(postorder, left, mid-1)&&helper(postorder, mid, right-1);
//	}
	
	
	
/**
 * 不用库函数求pow(n,i)运算
 * @param args
 */
//方法一：myself 超出限制
//	public double myPow(double x, int n) {
//		if(n>=0) {
//			if(n==0) {
//				return 1;
//			}
//			return myPow(x, n-1)*x;
//		}else {
//			double sum = myPow(x, -n);
//			return 1.0/sum;
//		}
//		
//    }

	
//方法二：小树 递归OK ，log2n的时间复杂度
//	public double myPow(double x, int n) {
//		long m = n;
//		if(m<0) {
//			return myPow2(1/x, -m);
//		}else {
//			return myPow2(x, m);
//		}
//	}
//	public double myPow2(double x, long n) {
//		if(n==0) {
//			return 1;
//		}
//		double pow = 1;
//		if((n&1) ==1) {
//			pow = x;
//		}
//		double half = myPow2(x, n>>1);
//		return half*half*pow;
//		
//	}
	
	
	

//测试移位运算
	public static void main(String[] args) {
		int x=11;
		System.out.println(x>>1);//5
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
