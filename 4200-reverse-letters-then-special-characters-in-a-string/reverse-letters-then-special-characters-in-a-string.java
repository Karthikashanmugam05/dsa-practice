class Solution {
    public String reverseByType(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> special = new ArrayList<>();
        
        // Step 1: Separate
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                letters.add(c);
            } else {
                special.add(c);
            }
        }
        
        // Step 2: Reverse
        Collections.reverse(letters);
        Collections.reverse(special);
         StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(letters.get(i++));
            } else {
                result.append(special.get(j++));
            }
        }
        
        return result.toString();
        
    }
}