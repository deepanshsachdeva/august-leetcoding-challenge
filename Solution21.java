class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        
        int l = 0;
        int r = A.length-1;
        
        for(int i=0; i<arr.length; i++){
            if(A[i]%2 == 0){
                arr[l++] = A[i];
            }else{
                arr[r--] = A[i];
            }
        }
        
        return arr;
    }
}
