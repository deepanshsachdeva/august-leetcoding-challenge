class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[30];
        int d = 0;
        int lastday = days[days.length-1];
        
        for (int i = days[0]; i <= lastday; i++) {
            if (i != days[d]) 
                dp[i % 30] = dp[(i - 1) % 30];
            else {
                dp[i % 30] = Math.min(dp[(i - 1) % 30] + costs[0], Math.min(dp[Math.max(i - 7, 0) % 30] + costs[1], dp[Math.max(i - 30, 0) % 30] + costs[2]));
                d++;
            }
        }
        
        return dp[lastday % 30];
    }
}
