class Solution {

    public static int partition(int[] nums,int start,int end){
        int pivot = nums[end];
        int i = start -1;

        for(int j = start; j < end; j++){
            if(nums[j] < pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;

        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;

        return i;


    }

    public static void sortNums(int[] nums,int start,int end){
        if(end <= start) return;

        int pivot = partition(nums, start, end);
        sortNums(nums, start, pivot-1);
        sortNums(nums, pivot+1, end);
    }



    public void sortColors(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        sortNums(nums, start, end);

        // int p1 = 0, p2 = 0;
        // while(p1 < nums.length){
        //     if(nums[p1] != 0){
        //         int temp = nums[p1];
        //         nums[p1] = nums[p2];
        //         nums[p2] = temp;
        //         p2++;
        //     }
        //     p1++;
        // } 
        // int i = 0, j = nums.length-1;
        // while(i < j){
        //     int temp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = temp;
        //     i++;
        //     j--;
        // }

        
    }
}
