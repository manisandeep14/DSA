class Solution {
    public void duplicateZeros(int[] arr) {
        int counter = 0, len = arr.length, read = len-1;
        for(int i:arr){
            if(i== 0)counter++;
        }
        int write = counter+len-1;
        while(read >= 0){
            if(write < len) arr[write] = arr[read];
            if(arr[read] == 0){
                write--;
                if(write < len) arr[write]=0;
            }
            read--;
            write--;
        }

        /* this code removes the last elements failed by 33 test case
        int[] nums = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length-count; i++){
            if(arr[i] == 0){
                count++;
            }
            nums[i] = arr[i];
        }
        int i = 0;
        int j = 0;
        while(i < arr.length-count){
            if(nums[i] == 0){
                arr[j] = 0;
                j++;
                arr[j] = 0;
            }
            arr[j] = nums[i];
            i++;
            j++;
        } */


    }
}
