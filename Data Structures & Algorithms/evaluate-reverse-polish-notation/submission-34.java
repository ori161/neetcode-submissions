class Solution {
    public int evalRPN(String[] tokens) { // Time: O(n), Space: O(n)
    Deque<Integer> stack = new ArrayDeque<>();

    for (String s : tokens) {
        if (Character.isDigit(s.charAt(s.length() - 1))) {
            stack.push(Integer.parseInt(s));
        } else {
            int num2 = stack.pop();
            int num1 = stack.pop();
            switch (s) {
                case "+" -> stack.push(num1 + num2);
                case "-" -> stack.push(num1 - num2);
                case "*" -> stack.push(num1 * num2);
                case "/" -> stack.push(num1 / num2);
            }
        }
    }

    return stack.pop();
}
}