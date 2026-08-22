// Last updated: 22/08/2026, 22:24:19
class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int i = 0;
        int j = 0;

        // First operation
        arr1[i++] = nums[0];

        // Second operation
        arr2[j++] = nums[1];

        // Remaining elements
        for (int k = 2; k < n; k++) {
            if (arr1[i - 1] > arr2[j - 1]) {
                arr1[i++] = nums[k];
            } else {
                arr2[j++] = nums[k];
            }
        }

        // Combine arr1 + arr2
        int[] result = new int[n];
        int index = 0;

        for (int x = 0; x < i; x++) {
            result[index++] = arr1[x];
        }

        for (int x = 0; x < j; x++) {
            result[index++] = arr2[x];
        }

        return result;
    }
}