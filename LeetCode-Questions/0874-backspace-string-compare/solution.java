class Solution {
    public boolean backspaceCompare(String s, String t) {
        return checkStr(s).equals(checkStr(t));
    }
    public Stack<Character> checkStr(String s){
        Stack<Character> list = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(!list.empty()){
                    list.pop();
                }
            }else{
                list.push(ch);
            }
        }
        
        return list;
    }
}
