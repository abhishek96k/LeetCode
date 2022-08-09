
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null){
            list.add(root.val);
            if(root.right != null)
                stack.push(root.right);
            if(root.left == null && !stack.isEmpty()){
                root = stack.pop();
            } else {
                root = root.left;
            }
        }
        return list;
    }
}

// TC: O(N) SC: O(2N)