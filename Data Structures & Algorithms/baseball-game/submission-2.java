class Solution {
    public int calPoints(String[] operations) {
        int[] scoreBoard = new int[operations.length];
        int j = 0;
        for (int i=0;i<operations.length;i++){
            if (operations[i].equalsIgnoreCase("+")) {
                scoreBoard[j] = scoreBoard[j - 1] + scoreBoard[j - 2];
                j++;       
            } else if(operations[i].equalsIgnoreCase("D")) {
                scoreBoard[j] = 2*scoreBoard[j-1];
                j++;
            } else if(operations[i].equalsIgnoreCase("C")) {
                scoreBoard[j-1] = 0;
                j--;
            } else {
                scoreBoard[j] = Integer.parseInt(operations[i]);
                j++;
            }
        }

        int sum = 0;
        for (int k=0; k<scoreBoard.length;k++) {
            sum = sum + scoreBoard[k];
        }

        return sum;
    }
}