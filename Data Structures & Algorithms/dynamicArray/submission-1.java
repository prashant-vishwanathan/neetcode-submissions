class DynamicArray {

    private int[] dynamicArray;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        dynamicArray = new int[capacity];
    }

    public int get(int i) {
        return dynamicArray[i];
    }

    public void set(int i, int n) {
        dynamicArray[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }

        dynamicArray[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return dynamicArray[length];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newDynamicArray = new int[capacity];

        for (int i = 0; i < length; i++) {
            newDynamicArray[i] = dynamicArray[i];
        }

        dynamicArray = newDynamicArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
