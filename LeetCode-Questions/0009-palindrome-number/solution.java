class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int y = 0;
        while(temp > 0){
            int digit = temp%10;
            y = y*10+digit;
            temp/=10;
        }
        
        // if(x==y) return true;
        // return false;
        return x == y;
    }
}
