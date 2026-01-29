class Solution {
    public int removeDuplicates(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int index = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1 );
        //         nums[index] = nums[i];
        //         index++;
        //     }
        // }

        // return index; Good - Works… but  didn’t optimize space.

        //Two Pointers

        int ind = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[ind]){
                ind++;
                nums[ind] = nums[i];
            }
        }
        return ind+1;

    }
}
