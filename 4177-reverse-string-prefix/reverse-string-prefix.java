class Solution {
    public String reversePrefix(String s, int k) {
        int n=s.length();
        k=Math.min(k,n);
        String firstPart=s.substring(0,k);
         String reversedPart = new StringBuilder(firstPart).reverse().toString();
         String remainingPart = s.substring(k);
         return reversedPart + remainingPart;


        
    }
}