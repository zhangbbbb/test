package aaa;

public class Byte1 {

/**lc101 https://leetcode-cn.com/problems/symmetric-tree/
 * 判断二叉树是否对称
 * @param root
 * @return
 */
	public boolean isSymmetric(TreeNode root) {
		if(root==null) {
			return true;
		}
		return dfs(root.left, root.right);
    }
	public boolean dfs(TreeNode left,TreeNode right){
		if(left==null&&right==null) {
			return true;
		}
		if(left==null || right==null) {
			return false;
		}
		if(left.val!=right.val) {
			return false;
		}
		//循环判断这个节点的  左子树的左节点是否等于右子树的右节点  && 左子树的右节点与右子树的左节点
		return dfs(left.left ,right.right) && dfs(left.right, right.left);
	}
	
	//
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {
			// TODO Auto-generated constructor stub
		}
		TreeNode(int val){
			this.val = val;
		}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
