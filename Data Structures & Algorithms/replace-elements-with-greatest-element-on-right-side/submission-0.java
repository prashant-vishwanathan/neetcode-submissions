class Solution {
    public int[] replaceElements(int[] arr) {
       int[] newArray = new int[arr.length];
       

       for (int i = 0; i < arr.length - 1; i++) {
            int maxVal = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxVal) {
                    maxVal = arr[j];
                }
            }

            newArray[i] = maxVal;
        }
        
        newArray[newArray.length - 1] = -1;
        return newArray;
    }
}