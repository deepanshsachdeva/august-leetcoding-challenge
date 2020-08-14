class CombinationIterator {
    Queue<String> queue;
    
    public CombinationIterator(String characters, int combinationLength) {
        queue = new LinkedList();
        
        generateCombinations(characters, 0, "", combinationLength, queue);
    }
    
    private void generateCombinations(String characters, int start, String str, int k, Queue<String> queue){
        if (k == 0) {
            queue.add(str);
            return;
        }
        
        for(int i = start; i < characters.length(); i++) {
            generateCombinations(characters, i + 1, str + characters.charAt(i), k - 1, queue);
        }
    }
    
    public String next() {
       return queue.poll(); 
    }
    
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
