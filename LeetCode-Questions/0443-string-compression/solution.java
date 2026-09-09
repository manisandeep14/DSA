class Solution {
    public int compress(char[] chars) {
        if(chars.length <= 1) return 1;
        // String result = "";
        int j = 0;
        int count = 1;
        int i = 0;
        for(i = 0; i < chars.length;i++){
            if(i == chars.length-1){
                chars[j] = chars[i];
                j++;

                if(count != 1){
                    char[] arr = String.valueOf(count).toCharArray();
                    for(char ch : arr){
                        chars[j] = ch;
                        j++;
                    } 
                }
            }
            else if(chars[i] == chars[i+1]){
                count++;
            }else{
                chars[j] = chars[i];
                j++;
                if(count != 1){
                    char[] arr = String.valueOf(count).toCharArray();
                    for(char ch : arr){
                        chars[j] = ch;
                        j++;
                    } 
                }
                // result = (result+chars[i]);
                // if(count != 1) result+=count;
                count = 1;
            }
        }
        
        // result = (result+chars[i]);
        // if(count != 1) result+=count;
        // for(int j = 0; j < result.length(); j++){
        //     chars[j] = result.charAt(j);
        // }
        // return result.length();
        return j;
    }
}
