/* Leetcode problem 54. Spiral Matrix

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

*/

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList();
        if (matrix.length ==0) {
            return result;
        }
        int minRow = 0;
        int maxRow = matrix.length-1;
        int minCol = 0;
        int maxCol = matrix[0].length-1;
        
        while (minRow<=maxRow && minCol<=maxCol) {
            if (minCol<=maxCol) {
                for (int i=minCol; i<=maxCol; i++) {
                    result.add(matrix[minRow][i]);
                }
                minRow++;
            }
            else {
                break;
            }
        
            if (minRow<=maxRow) {
                for (int i=minRow; i<=maxRow; i++) {
                    result.add(matrix[i][maxCol]);
                }
                maxCol--;
            }
            else {
                break;
            }
        
            if (maxCol>=minCol) {
                for (int i=maxCol; i>=minCol; i--) {
                    result.add(matrix[maxRow][i]);
                }
                maxRow--;
            }
            else {
                break;
            }
        
            if (maxRow>=minRow) {
                for (int i=maxRow; i>=minRow; i--) {
                    result.add(matrix[i][minCol]);
                }
                minCol++;  
            }
            else {
                break;
            }
            
        }

        return result;
    }
}
