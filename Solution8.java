/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;
    
    public int pathSum(TreeNode root, int sum) {
        HashMap map = new HashMap<Integer,Integer>();
      
        ans = 0;
        map.put(0,1);
        
        pathSumUtil(map,root,0,sum);
        
        return ans;
    }
    
    void pathSumUtil(HashMap<Integer,Integer> map, TreeNode root,int cSum,int sum){
        if(root == null)
            return;
        
        int temp = cSum+root.val;
        
        if(map.containsKey(temp-sum))
            ans += map.get(temp-sum);
        
        map.put(temp,map.getOrDefault(temp,0)+1);
        
        if(root.left != null) 
            pathSumUtil(map,root.left,cSum+root.val,sum);
        
        if(root.right != null) 
            pathSumUtil(map,root.right,cSum+root.val,sum);
        
        map.put(temp,map.get(temp)-1);
    }
}
