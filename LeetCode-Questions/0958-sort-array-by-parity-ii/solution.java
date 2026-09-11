class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int i =0, j = 1, n = nums.length;;
       while(i < n && j < n){
        /*boolean iCheck = (nums[i] % 2 ==0);
        boolean jCheck = (nums[j]%2 != 0);
        if(iCheck)i+=2;
        if(jCheck)j+=2; */
        while(i < n && nums[i]% 2 == 0) i+=2;
        while(j < n && nums[j]%2 != 0) j+=2;
        if(i < n && j < n){
           nums[i] = nums[j]+nums[i]-(nums[j]= nums[i]);
            i+=2;
            j+=2;
        }
       }



       /* This doesn't work when odd or even grouped together also it is two pointers not partitioning
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            boolean leftC = (nums[left]%2 ==  left%2 );
            boolean rightC = (nums[right]%2==  right%2 );
            if(leftC) left++;
            if(rightC) right--;
            if(!(leftC||rightC)){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right]= temp;
                left++;
                right--;
            }
        } */
        return nums;
    }
}
