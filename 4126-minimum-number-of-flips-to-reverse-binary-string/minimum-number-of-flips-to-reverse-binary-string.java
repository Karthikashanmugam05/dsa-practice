class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);

        int left = 0;
        int right = s.length() - 1;
        int flips = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                flips += 2;
            }
            left++;
            right--;
        }

        return flips;
    }
}