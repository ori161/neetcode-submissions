class MinStack {
    private List<Integer>stack;
    private Map<Integer, List<Integer>> minTracker;
    public MinStack() {
        this.stack = new ArrayList<>();
        this.minTracker =new HashMap<>();
    }
    
    public void push(int val) {
        int checkMin = val;
        if(!(stack.isEmpty())){
            checkMin = this.minTracker.get(this.top()).getLast();
        }
        this.minTracker.computeIfAbsent(val , v -> new ArrayList<>()).add(checkMin < val ? checkMin : val);
        this.stack.add(val);
    }
    
    public void pop() {
        int popItem = this.stack.removeLast(); 
        if(this.minTracker.get(popItem) == null){
            this.minTracker.remove(popItem);
        }
        else{
            this.minTracker.get(popItem).removeLast();
        }
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        return this.minTracker.get(stack.getLast()).getLast();
    }
}
