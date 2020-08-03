class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        
        int left = 0;
        int right = n-1;
        
        String ss = s.toLowerCase();
        
        while(left<=right){            
            if(!((ss.charAt(left) >= '0' && ss.charAt(left) <= '9') || (ss.charAt(left) >= 'a' && ss.charAt(left) <= 'z'))){
                left++;
                continue;
            }
            
            if(!((ss.charAt(right) >= '0' && ss.charAt(right) <= '9') || (ss.charAt(right) >= 'a' && ss.charAt(right) <= 'z'))){
                right--;
                continue;
            }
            
            if(ss.charAt(left) != ss.charAt(right))
                return false;
            
            left++;
            right--;
                
        }
        
        return true;
    }
}
