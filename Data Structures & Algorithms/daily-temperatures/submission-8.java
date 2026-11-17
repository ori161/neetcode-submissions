class Solution {
    public int[] dailyTemperatures(int[] temperatures) { // time: o(n) space: o(n)
        Deque<Integer>indexStack = new ArrayDeque<>();
        int length = temperatures.length;
        int[]res = new int[length];
        int i = 0; 
        while(i < length){
            while(!indexStack.isEmpty() && temperatures[indexStack.peek()] < temperatures[i] && i < length){
                int resIndex = indexStack.pop();
                res[resIndex] = i - resIndex;
            }
            indexStack.push(i);
            i++;
        }
        return res;
    }
}
