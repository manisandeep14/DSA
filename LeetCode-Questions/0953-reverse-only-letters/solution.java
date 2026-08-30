class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0; 
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if( Character.isLetter(c1) && Character.isLetter(c2) ){
                arr[left] = c2;
                arr[right] = c1;
                left++;
                right--;
            }else if(!Character.isLetter(c1)){
                left++;
            }else if(!Character.isLetter(c2)){
                right--;
            }
        }
        return String.copyValueOf(arr);
    }
}
