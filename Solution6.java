class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int i = 0;
        
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                result.add(nums[i]);
                i+=2;
            }else{
                i++;
            }
        }
        
        return result;
    }
}
