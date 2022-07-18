
class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
    
        if(root == null) return ans;
        preOrderHelper(root);
        return ans;
    }
    
    public void preOrderHelper(Node node){
        if(node.children == null) return;
        ans.add(node.val);
        for(Node child : node.children){
            preOrderHelper(child);
        }
    }
}