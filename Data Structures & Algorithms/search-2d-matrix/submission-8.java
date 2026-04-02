class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bottom = ROWS - 1;
        int targetRow = -1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (target > matrix[mid][COLS - 1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                targetRow = mid;
                break;
            }
        }

        if (targetRow == -1) {
            return false;
        }

        int start = 0, end = COLS - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            } else if (target < matrix[targetRow][mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
