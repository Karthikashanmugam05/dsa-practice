class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s = String.valueOf(num);
        for(int left=0;left<=s.length()-k;left++){
            int right=left+k;
            String sub = s.substring(left, right);
             int window = Integer.parseInt(sub);
             if(window!=0 && num%window==0){
                count++;
             }

        }
        return count;
        
    }
}