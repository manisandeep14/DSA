class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int left = 0,right = arr.length-1, trips = 0;
        
        Arrays.sort(arr);
        while(left <= right){
            if(arr[left]+arr[right] <= limit){
                left++;
            }
            right--;
            trips++;
        }
        return trips;
    }
}
