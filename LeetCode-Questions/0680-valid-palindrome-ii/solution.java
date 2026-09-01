class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if(c1 != c2){
               return checkPallindrome(s,left+1, right) ||
                      checkPallindrome(s,left, right-1);
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean checkPallindrome(String s,int i,  int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
