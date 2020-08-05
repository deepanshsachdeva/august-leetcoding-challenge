class WordDictionary {
    TrieNode root;
    
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode temp = root;
        
        for(char c : word.toCharArray()){
            if(temp.children[c-'a'] == null)
                temp.children[c-'a'] = new TrieNode();
                
            temp = temp.children[c-'a'];
        }
        
        temp.isLeaf = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return helper(root, word, 0);
    }
    
    public boolean helper(TrieNode node ,String word, int pos){        
        for(int i=pos; i<word.length(); i++){
            if(word.charAt(i) == '.'){
                for(int c=0; c<26; c++){
                    if(node.children[c] != null){
                        if(helper(node.children[c], word, i+1))
                            return true;
                    }
                }
                
                return false;
            }else{
                if(node.children[word.charAt(i)-'a'] != null){
                    node = node.children[word.charAt(i)-'a'];
                }else{
                    return false;
                }    
            }
        }
            
        return node.isLeaf;
    }
}

class TrieNode{
    TrieNode[] children;
    boolean isLeaf;
    
    public TrieNode() {
        children = new TrieNode[26];
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
