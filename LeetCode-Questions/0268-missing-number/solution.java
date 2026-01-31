class Solution {
    public int missingNumber(int[] nums) {
        int expOut = 0;
        int givOut = 0;
        for(int i : nums){
            givOut += i;
        }
        for(int i = 1; i <= nums.length ; i++){
            expOut += i;
        }

        return expOut - givOut;
    }
}
