class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        int res = 0;
        for(String s : tokens){ 
            if(Character.isDigit(s.charAt(s.length() - 1))){
                stack.push(Integer.parseInt(s));
            }
            else{
                if(stack.size() < 2){
                    return -1;
                }
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(s.equals("+")){
                    res = num1 + num2;
                }
                else if(s.equals("-")){
                    res = num1 - num2;
                }
                else if(s.equals("*")){
                    res = num1 * num2;
                }
                else{
                    if(num2 != 0){
                        res = num1/num2;
                    }
                }
                stack.push(res);
            }
        }
        if(stack.size() == 1){
            return stack.peek();
        }
        return -1;
    }
}