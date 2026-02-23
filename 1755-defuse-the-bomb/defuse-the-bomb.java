class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        // If k == 0, return array of zeros
        if (k == 0) {
            return result;
        }

        int start, end;
        int sum = 0;

        // If k > 0 → sum of next k elements
        if (k > 0) {
            start = 1;
            end = k;
        } 
        // If k < 0 → sum of previous |k| elements
        else {
            start = n + k;   // k is negative
            end = n - 1;
        }

        // Calculate initial window sum
        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        // Sliding window
        for (int i = 0; i < n; i++) {
            result[i] = sum;

            // Remove left element
            sum -= code[start % n];

            // Add next element
            sum += code[(end + 1) % n];

            // Move window
            start++;
            end++;
        }

        return result;
    }
}