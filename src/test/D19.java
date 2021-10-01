package test;

import javax.swing.tree.TreeNode;

public class D19 {
	/*
	 * 1+2....+n的累加和
	 */

////方法一：递归
//	public int sumNums(int n) {
//		return n == 0 ? 0 : n + sumNums(n - 1);
//	}
//
////方法二
//	public int sumNums(int n) {
//		for(int i=0;i<n;i++){
//	        temp= nums[i]*i-sum[i-1]+2*(sum[n-1]-sum[i]-(n-i-1)*nums[i]);
//	        res=Math.min(temp,res);
//	    }
//	}

	
//思路：遍历一个p点，对遍历路径上的点都设为true，再遍历q点时，第一个为true的点即为最近祖先  未实现
//方法一：递归
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//		if(root == null||root==p||root==q) {
//			return root;
//		}
//		TreeNode left = lowestCommonAncestor(root.left, p, q);
//		TreeNode right = lowestCommonAncestor(root.right, p, q);
//		if(left==null) return right;
//		if(right==null) return left;
//		return root;
//	}
	
	

}
