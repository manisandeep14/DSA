class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 1, j = 0;
        for( i = 0; i < nums.length; i++){
            if(nums[i]%2==0){
                nums[i] = nums[j]+nums[i]-(nums[j] = nums[i]);
                j++;
            }
        }
        /* This is Two pointers Approach Not Partitioning 
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left]%2 !=0 && nums[right]%2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }else if(nums[left]%2==0) left++;
            else if (nums[left]%2!=0) right--;
        } */
        return nums;
    }
}
