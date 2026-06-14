class Solution {

    public static void swapArr(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void revArr(int [] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot = nums.length-1;
        
        for(int i = nums.length-1; i > 0 ; i--){
           if(nums[i-1] < nums[i]){
               pivot = i-1;
               break;
           }
        }

        if(pivot == nums.length-1){
            revArr(nums,0, nums.length-1);
            return;
        }
        
        int ele = nums.length-1;
        
        for(int i = nums.length-1; i > pivot; i--){
            if(nums[i] > nums[pivot] && nums[i] < nums[ele] ){
                ele = i;
            }else if(nums[ele] <= nums[pivot]){
                ele--;
            }
        }

         swapArr(nums,pivot, ele);

        revArr(nums,pivot+1,nums.length-1);
        
    }
}
