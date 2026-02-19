class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = lb(nums, target);
        if (left == -1 || nums[left] != target) {
            return new int[]{-1, -1};
        }
        int right = ub(nums, target);
        return new int[]{left, right};
    }

    private int lb(int[] nums, int target) {
        int lo = 0, hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }

        return lo == nums.length ? -1 : lo;
    }

    private int ub(int[] nums, int target) {
        int lo = 0, hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo - 1;
    }
}