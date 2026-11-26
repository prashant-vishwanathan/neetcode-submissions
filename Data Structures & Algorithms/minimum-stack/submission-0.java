class MinStack {

    Deque<Integer> integerList;
    Deque<Integer> minStack;
    public MinStack() {
        integerList = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        integerList.push(val);
        int minValue = 
        minStack.isEmpty() ? val :
        Math.min(minStack.peek(), val);
        minStack.push(minValue);
    }
    
    public void pop() {
        integerList.pop();
        minStack.pop();
    }
    
    public int top() {
        return integerList.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
