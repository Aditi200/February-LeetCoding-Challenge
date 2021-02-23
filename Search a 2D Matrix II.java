class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int num : matrix[i])
                if (num == target) return true;
        }
        return false;
    }
}