class Solution {
    public int evalRPN(String[] tokens) { // time = o(n) space: o(n)
        Stack<Integer>stack = new Stack<>();
        int res = 0;
        for(String s : tokens){ 
            if(Character.isDigit(s.charAt(s.length() - 1))){
                stack.push(Integer.parseInt(s));
            }
            else{
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
                    res = num1/num2;
                }
                stack.push(res);
            }
        }
        return stack.peek();
    }
}