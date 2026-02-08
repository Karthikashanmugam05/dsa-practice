class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] row: grid){
            int start=0;
            int end=row.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(row[mid]<0){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            count+=row.length-start ;
        }
        return count;
        
    }
}