class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Brute Force
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] >= 0){
        //         list1.add(nums[i]);
        //     }else{
        //         list2.add(nums[i]);
        //     }
        // }

        // for(int i = 0; i < nums.length/2; i++){
        //     nums[2*i] = list1.get(i);
        //     nums[2*i+1] = list2.get(i);
        // }

        // return nums; 


        //Optimized Code with two pointers

        int pos = 0;
        int neg = 1;

        int[] rearr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                rearr[pos] = nums[i];
                pos += 2;
            }else{
                rearr[neg] = nums[i];
                neg += 2;
            }
        }

        return rearr;

    }
}
