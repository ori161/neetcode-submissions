class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        res_temps = [0] * n
        mono_stack = [(temperatures[0], 0)]
        
        for i in range(1, n):
            if temperatures[i] < mono_stack[-1][0]:
                mono_stack.append((temperatures[i], i))
            else:
                while mono_stack and temperatures[i] > mono_stack[-1][0]:
                    head = mono_stack.pop()
                    res_temps[head[1]] = i - head[1]    
                mono_stack.append((temperatures[i], i)) 

        return res_temps