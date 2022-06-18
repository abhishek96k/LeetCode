class WordFilter {
    
    private TrieNode root;
    
    public WordFilter(String[] words) {
        root = new TrieNode();
        
        for(int index = 0; index < words.length; index++) {
            for(int cut = 0; cut < words[index].length(); cut++) {
                insert(words[index].substring(cut) + '{' + words[index], index);
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        TrieNode p = root;
        int i;
        for(char c : (suffix + '{' + prefix).toCharArray()) {
            i = c - 'a';
            if(p.children[i] == null) return -1;
            p = p.children[i];
        }
        return p.lastSeenIdx;
    }
    
    private void insert(String str, int index) {
        TrieNode p = root;
        int i;
        for(char c : str.toCharArray()) {
            i = c - 'a';
            if(p.children[i] == null) p.children[i] = new TrieNode();
            p = p.children[i];
            p.lastSeenIdx = index;
        }
    }
    
    class TrieNode {
        TrieNode[] children;
        int lastSeenIdx;
        
        public TrieNode() {
            children = new TrieNode[27];
        }
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */