class Solution {
    public int maxSubArray(int[] nums) {
        // int gMax = nums[0];
        // int cMax = nums[0];

        // for(int i = 1; i < nums.length;i++){
        //     cMax = Math.max(nums[i], nums[i]+ cMax);
        //     gMax = Math.max(gMax, cMax);
        // }

        // return gMax;

        int cMax = 0;
        int gMax = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            cMax+= nums[i];

            gMax = gMax < cMax ? cMax : gMax;
            cMax = cMax < 0 ? 0 : cMax;

        }

        return gMax;

    }
}
