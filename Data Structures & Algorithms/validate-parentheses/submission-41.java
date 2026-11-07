class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        if (l % 2 != 0) {
            return false;
        }
        Stack<Character>stack = new Stack<>();
        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()){ 
                char peek = stack.peek();
                if(c == '}' && peek == '{'){
                    stack.pop();
                }
                else if(c == ']' && peek == '['){
                    stack.pop();
                }
                else if(c == ')' && peek == '('){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
