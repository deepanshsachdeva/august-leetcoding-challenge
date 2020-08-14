class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        
        Set<Character> set = new HashSet<>();
        
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                length++;
            }else{
                set.add(c);
            }
        }
        
        return (set.isEmpty()) ? length*2 : length*2+1;
    }
}
