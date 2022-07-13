
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);
        
        while(!q1.isEmpty()) {
            int size = q1.size();
            List<Integer> currLevel = new LinkedList<>();
            while(size-- > 0) {
                TreeNode curr = q1.poll();
                currLevel.add(curr.val);
                if(curr.left != null) q1.offer(curr.left);
                if(curr.right != null) q1.offer(curr.right);
            }
            ans.add(currLevel);
        }
        return ans;
    }
}