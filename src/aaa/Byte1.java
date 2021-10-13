package aaa;

public class Byte1 {

/**lc101 https://leetcode-cn.com/problems/symmetric-tree/
 * �ж϶������Ƿ�Գ�
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
		//ѭ���ж�����ڵ��  ����������ڵ��Ƿ�������������ҽڵ�  && ���������ҽڵ�������������ڵ�
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
