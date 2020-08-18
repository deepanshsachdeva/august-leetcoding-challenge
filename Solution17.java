class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] dist = new int[num_people];
        
        int i = 0;
        int loop = 0;
        
        while(candies > 0){
            if(i >= num_people){
                i = 0;
                loop++;
            }
            
            int req_candies = (loop*num_people) + (i+1);
            
            if(req_candies > candies){
                dist[i] += candies;
            }else{
                dist[i] += req_candies;
            }
            
            i++;
            
            candies -= req_candies;
        }
        
        return dist;
    }
}
