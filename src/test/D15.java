package test;


public class D15 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
	
	
	int res = 0;
	int k = 0;
	
	public int kthLargest(TreeNode root, int k) {
		this.k = k;
		inorder(root);
		return res;
    }
	
	//ÄæÐòµÄÖÐÐò±éÀú
	public void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(root.right);
		k--;
		if(k==0) {
			res = root.val;
			return;
		}
		inorder(root.left);
	}
}

