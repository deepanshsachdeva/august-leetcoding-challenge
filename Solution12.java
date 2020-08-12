class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        
        if(rowIndex == 0)
            return row1;
        
        triangle.add(row1);
        
        for(int i=1; i<=rowIndex; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> curr_row = new ArrayList<>();
            
            curr_row.add(1);
            
            for(int j=1; j<i; j++){
                curr_row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            
            curr_row.add(1);
            
            triangle.add(curr_row);
        }
        
        return triangle.get(rowIndex);
    }
}
