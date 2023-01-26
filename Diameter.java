Diameter Of a Binary Tree --->

class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;   
    }
    int height (TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter , leftHeight+rightHeight);
        return Math.max(leftHeight , rightHeight)+1;
    }
}