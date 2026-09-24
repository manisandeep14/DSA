class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2], len = nums.length;

        Arrays.sort(nums);

        for(int i=0; i < len-2; i++){
            if( i != 0 && nums[i] == nums[i-1]) continue;

            int l = i+1, r = len-1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(Math.abs(target-sum) < Math.abs(target-closest)) closest = sum;
                else if(sum <= target)l++;
                else if(sum > target)r--;
                else return sum;
            }
        }
        return closest;
    }
}
