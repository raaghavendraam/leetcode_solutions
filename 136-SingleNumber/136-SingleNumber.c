// Last updated: 04/04/2026, 15:47:13
int singleNumber(int* nums, int numsSize) {
    int ans = 0;

    for (int i = 0; i < numsSize; i++) {
        ans ^= nums[i];
    }

    return ans;
}
