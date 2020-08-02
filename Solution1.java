class Solution {
    public boolean detectCapitalUse(String word) {        
        return word.matches("[a-zA-z]{1}[a-z]*|[a-z]*|[A-Z]*");
    }
}
