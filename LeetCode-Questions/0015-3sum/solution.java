class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3)return list;
        Arrays.sort(nums);
        int i = 0,len = nums.length;
        while(i < len-2 && nums[i] <= 0){
            int p1 = i + 1;
            int p2 = len - 1;
            while(p1 < p2){
                int sum = nums[i]+nums[p1]+nums[p2];

                if(sum > 0)p2--;
                else if(sum < 0)p1++;
                else{
                    list.add(new ArrayList<>(List.of(nums[i], nums[p1], nums[p2])));
                    p1++;
                    p2--;
                    while (p1 < p2 && nums[p1] == nums[p1 - 1]) {
                        p1++;
                    }
                    while (p1 < p2 && nums[p2] == nums[p2 + 1]) {
                        p2--;
                    }
                }
            }
            while (i < len - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
            i++;
            
        }
        return list;
    }
}
