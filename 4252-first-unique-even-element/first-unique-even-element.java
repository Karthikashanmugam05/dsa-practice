class Solution {
    public int firstUniqueEven(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Find first even with freq = 1
        for (int num : nums) {
            if (num % 2 == 0 && map.get(num) == 1) {
                return num;
            }
        }
        
        // Step 3: If none found
        return -1;
        
    }
}