class Solution {
    public int titleToNumber(String s) {
        int col_num = 0;
        
        for(int i=0; i<s.length(); i++){
            col_num = col_num*26 + (s.charAt(i)-'A'+1);
        }
        
        return col_num;
    }
}
