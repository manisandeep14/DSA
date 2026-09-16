class Solution {
    public long minimumSteps(String s) {
        long count = 0, ones = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1')ones++;
            else count+=ones; 
        }
        return count;
    }
}
