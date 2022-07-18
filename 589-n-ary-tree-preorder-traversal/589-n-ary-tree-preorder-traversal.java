
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return list;
        preOrderHelper(root);
        return list;
    }
    
    public void preOrderHelper(Node node) {
        if(node.children == null) return;
        list.add(node.val);
        for(Node child : node.children){
            preOrderHelper(child);
        }
    }
}