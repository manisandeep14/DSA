class Solution {
    public String reverseVowels(String s) {
        int left = 0, l = 0;
        int right = s.length()-1, r = 0;
        char[] arr = s.toCharArray();
        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if( (c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U' ||
                 c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')&& l == 0){
                    l = 1;
            }
            if( (c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U' ||
                       c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u')&& r == 0){
                    r = 1;
            }

            if(r == 1 && l == 1){
                //swap arr indexes
                arr[left] = c2;
                arr[right] = c1;
                l = 0; 
                r = 0;
                left++;
                right--;
            }else if(l != 1){
                left++;
            }else if(r != 1){
                right--;
            }

        }

        return String.copyValueOf(arr);

    }
}
