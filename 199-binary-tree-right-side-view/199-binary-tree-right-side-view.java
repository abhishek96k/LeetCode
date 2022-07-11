
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList list = new ArrayList();
        rightSideView(root, 0, list);
        return list;
    }
    
    public void rightSideView(TreeNode root, int level, ArrayList list) {
        if (root == null) return;
        if(list.size() == level)
            list.add(root.val);
        rightSideView(root.right, level + 1, list);
        rightSideView(root.left, level + 1, list);
    }
}