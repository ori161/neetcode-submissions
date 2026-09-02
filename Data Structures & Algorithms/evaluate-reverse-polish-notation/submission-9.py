class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operands_stack = []
        for t in tokens:
            if t == '+':
                op1, op2 = operands_stack.pop(), operands_stack.pop()
                operands_stack.append(op1 + op2)
            elif t == '-':
                op1, op2 = operands_stack.pop(), operands_stack.pop()
                operands_stack.append(op2 - op1)
            elif t == '*':
                op1, op2 = operands_stack.pop(), operands_stack.pop()
                operands_stack.append(op1 * op2)
            elif t == '/':
                op1, op2 = operands_stack.pop(), operands_stack.pop()
                operands_stack.append(int(float(op2) / op1))
            else:
                operands_stack.append(int(t))
                
        return operands_stack[0]
                

                

