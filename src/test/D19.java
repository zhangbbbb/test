package test;

import javax.swing.tree.TreeNode;

public class D19 {
	/*
	 * 1+2....+n���ۼӺ�
	 */

////����һ���ݹ�
//	public int sumNums(int n) {
//		return n == 0 ? 0 : n + sumNums(n - 1);
//	}
//
////������
//	public int sumNums(int n) {
//		for(int i=0;i<n;i++){
//	        temp= nums[i]*i-sum[i-1]+2*(sum[n-1]-sum[i]-(n-i-1)*nums[i]);
//	        res=Math.min(temp,res);
//	    }
//	}

	
//˼·������һ��p�㣬�Ա���·���ϵĵ㶼��Ϊtrue���ٱ���q��ʱ����һ��Ϊtrue�ĵ㼴Ϊ�������  δʵ��
//����һ���ݹ�
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
