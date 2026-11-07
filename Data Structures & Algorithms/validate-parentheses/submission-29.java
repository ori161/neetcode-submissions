class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        if(l == 1 || l == 0){
            return false;
        }
        Map<Character, Character>bracket = Map.of('}', '{', ']', '[', ')', '(');
        Stack<Character>stack = new Stack<>();
        for(int i = 0; i < l; i++){
            if(bracket.get(s.charAt(i)) == null){
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() && bracket.get(s.charAt(i)).equals(stack.peek())) {
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
