class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxWater=0;

        while(left < right){

            int high = Math.min(height[left],height[right]);
            maxWater = Math.max((right-left)*high,maxWater);
            if(height[left] < height[right])left++;
            else if(height[left] > height[right]) right--;
            else{left++; right--;}

        }
        return maxWater;
    }
}
