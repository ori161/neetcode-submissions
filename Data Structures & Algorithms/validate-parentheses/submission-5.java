class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1){
            return false;
        }
        Stack<Character> checkPar = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(checkPar.isEmpty()){
                    return false;
                }
                char p = checkPar.pop(); 
                switch(s.charAt(i)){
                    case ')':
                        if(p != '(') return false;
                        break;
                    case '}':
                        if(p != '{') return false;
                        break;
                    case ']':
                        if(p != '[') return false;
                        break;
                }
            }
            else{
                checkPar.add(s.charAt(i));
            }
        }
        return checkPar.isEmpty();
    }
}
