class Solution {
    int n;
    int k;
    
    List<Integer> numbers = new ArrayList<>();
    
    public int[] numsSameConsecDiff(int N, int K) {
        n = N;
        k = K;
        
        if(n == 1) 
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        
        for(int i=1; i<10; i++) {
            dfs(i, n-1);
        }
        
        int[] res = new int[numbers.size()];
        
        for(int i=0; i<numbers.size(); i++) {
            res[i] = numbers.get(i);
        }
        
        return res;
    }
    
    public void dfs(int currentNumber, int digitsLeft) {
        if(digitsLeft == 0) {
            numbers.add(currentNumber);
            return;
        }
        
        int lastDigit = currentNumber%10;
        
        if((lastDigit + k) <= 9)
            dfs(currentNumber * 10 + lastDigit + k, digitsLeft-1);
        
        if(lastDigit - k >= 0  && k != 0)
            dfs(currentNumber * 10 + lastDigit - k, digitsLeft-1);
    }
}
