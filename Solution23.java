class StreamChecker {
    TrieNode root;
    StringBuilder sb = new StringBuilder();

    public StreamChecker(String[] words) {
        sb = new StringBuilder();
        root = new TrieNode();
        
        for(String word : words){
            TrieNode r = root;
            
            for (int i=word.length()-1; i>=0; i--) {
                if (r.children[word.charAt(i) - 'a'] == null) {
                    r.children[word.charAt(i) - 'a'] = new TrieNode();
                }
                r = r.children[word.charAt(i) - 'a'];
            }
            
            r.isLeaf = true;
        }
    }
    
    public boolean query(char letter) {
        sb.append(letter);
        
        TrieNode n = root;
        
        for(int i=sb.length()-1; i>=0 && n != null; i--){
            n = n.children[sb.charAt(i) - 'a'];
            
            if(n != null && n.isLeaf == true)
                return true;
        }
        
        return false;
    }
}

class TrieNode {
    TrieNode children[];
    boolean isLeaf;

    public TrieNode() {
        this.children = new TrieNode[26];
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
