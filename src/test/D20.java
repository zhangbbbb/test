package test;


public class D20 {
/**
* ��������������������
* �������
*/
//˼·��������ĵ�һ���ڵ�ȥ�������ҵ���Ӧ��λ��i��i֮ǰ��Ϊ��������i֮���Ϊ������
//	public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode node = createTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
//		return node;
//	}
//	public TreeNode createTree(int[] preorder, int[] inorder,int preStart,int preEnd,int inStart,int inEnd) {
//		if(preStart>preEnd||inStart>inEnd) {
//			return null;
//		}
//		TreeNode curr = new TreeNode(preorder[preStart]) ;
//		if(preStart == preEnd) {//�����������
//			return curr;
//		}
//		
//		int inCurrIndex = 0;
//		for (int i = inStart; i <= inEnd; i++) {//����Ҫ<=
//			if(inorder[i]==preorder[preStart]) {
//				inCurrIndex = i;
//                break;//�ҵ�������
//			}
//		}
//		int leftLength = inCurrIndex - inStart;//�������ĳ���
//		curr.left = createTree(preorder, inorder, preStart+1, preStart+leftLength, inStart, inCurrIndex-1);
//		curr.right = createTree(preorder, inorder, preStart+leftLength+1, preEnd, inCurrIndex+1, inEnd);
//		return curr;
//	}
//	
	
	
	
	
/**��չ��
 * ���ݺ���������������
 * �������
 * ��⣺https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/solution/jian-zhi-offer-07-zhong-jian-er-cha-shu-v7nl8/
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
 * �ж�һ�������Ƿ���������ĺ���������
 * 
 * ˼·���������������ص�����������ֵ<���ڵ�<��������ֵ��������������˳���ǣ�
                                                            ���ӽڵ�����ӽڵ�����ڵ�
   link��https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/di-gui-he-zhan-liang-chong-fang-shi-jie-jue-zui-ha/
 */
	
//	public boolean verifyPostorder(int[] postorder) {
//		return helper(postorder, 0, postorder.length-1);
//    }
//	public boolean helper(int[] postorder,int left,int right) {
//		if(left>=right) {//left>right˵��û�нڵ㡣left=rightֻ��һ���ڵ�Ҳ����Ҫ�Ƚ��ˣ�Ҳ���ǵݹ����С��λ��һ���ڵ�ʱ����true
//			return true;
//		}
//		//��Ϊ������ postorder[right]�Ǹ��ڵ㣬������������ҳ���һ���Ƚڵ���ֵ��������Ľڵ㶼�Ǹ��ڵ�����ӽڵ㣬��ǰ��Ķ��Ǹ��ڵ�����ӽڵ�
//		int mid = left;
//		int root = postorder[right];
//		while(postorder[mid]<root) {
//			mid++;
//		}
//		//midǰ��Ķ�Ҫ��rootС���������ж�
//		//����Ҫȷ��mid���ֵ��Ҫ�ȸ��ڵ�root������б���С��ֱ�ӷ���false
//		int tmp = mid;
//		while(tmp<right) {
//			if(postorder[tmp++]<root) {
//				return false;
//			}
//		}
//		//�������ӱߵĽڵ��ټ����ݹ����
//		return helper(postorder, left, mid-1)&&helper(postorder, mid, right-1);
//	}
	
	
	
/**
 * ���ÿ⺯����pow(n,i)����
 * @param args
 */
//����һ��myself ��������
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

	
//��������С�� �ݹ�OK ��log2n��ʱ�临�Ӷ�
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
	
	
	

//������λ����
	public static void main(String[] args) {
		int x=11;
		System.out.println(x>>1);//5
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
