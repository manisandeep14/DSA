class Solution {

    public static int charToInt(char ch){
        int i = 0;
        if(ch == 'I'){
            return i = 1;
        }else if(ch == 'V'){
            return i  = 5;
        }else if(ch == 'X'){
            return i = 10;
        }else if(ch == 'L'){
            return i = 50;
        }else if(ch == 'C'){
            return i = 100;
        }else if(ch == 'D'){
            return i = 500;
        }
        return i = 1000;
    }

    public int romanToInt(String s) {

        int result = 0;
        int len = s.length();
        int i = 0;

        for(i = 0; i < len-1; i++){
            int j = charToInt(s.charAt(i));
            int k = charToInt(s.charAt(i+1)); 
            if( j < k){
                result+= (k-j);
                i++; 
            }else{
                result += j;
            }
            
        }

        if(i != len){
            result += charToInt(s.charAt(len-1));
        }

        
        return result;
        
    }
}
