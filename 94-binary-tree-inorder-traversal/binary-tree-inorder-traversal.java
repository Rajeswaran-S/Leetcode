
class Solution {
   
    private List<Integer> result = new ArrayList<>();

    /**
     * Performs inorder traversal of a binary tree
     * @param root The root node of the binary tree
     * @return List containing values in inorder sequence (left -> root -> right)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        performInorderDFS(root);
        return result;
    }

    /**
     * Helper method to recursively traverse the tree in inorder
     * @param node Current node being processed
     */
    private void performInorderDFS(TreeNode node) {
        
        if (node == null) {
            return;
        }
      
        performInorderDFS(node.left);
      
        result.add(node.val);
      
       
        performInorderDFS(node.right);
    }
}