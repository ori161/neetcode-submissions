class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer>temperaturesStack = new ArrayDeque<>();
        Deque<Integer>indexStack = new ArrayDeque<>();
        int length = temperatures.length;
        int[]res = new int[length];
        for(int i = 0; i < length; i++){
            res[i] = 0;
        }
        int i = 0; 
        while(i < length){
            while(!temperaturesStack.isEmpty() && temperaturesStack.peek() < temperatures[i] && i < length){
                temperaturesStack.pop();
                int resIndex = indexStack.pop();
                res[resIndex] = i - resIndex;
            }
            temperaturesStack.push(temperatures[i]);
            indexStack.push(i);
            i++;
        }
        return res;
    }
}
