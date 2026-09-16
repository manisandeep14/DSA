class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length, i = 0, j = len-1, left = 0, right = len-1;
        int[] arr = new int[len];
        while(i < nums.length){
            if(nums[i] < pivot) arr[left++] = nums[i];
            if(nums[j] > pivot) arr[right--] = nums[j];
            i++;
            j--;
        }
        while(left <= right)arr[left++] = pivot;
        return arr;
    }
}
