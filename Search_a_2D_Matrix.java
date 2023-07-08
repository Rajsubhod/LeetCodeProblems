/*
    You are given an m x n integer matrix matrix with the following two properties:

    Each row is sorted in non-decreasing order.
    The first integer of each row is greater than the last integer of the previous row.
    Given an integer target, return true if target is in matrix or false otherwise.

    You must write a solution in O(log(m * n)) time complexity.
 */
public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        System.out.println(searchMatrix(arr,2));
    }
    //Time Complexity --- O(log(n*m))
    public static boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;
            int st = 0;
            int end =n*m-1;
            while(st<=end){
                int mid = st+(end-st)/2;
                int i = mid/m;
                int j = mid%m;
                if(matrix[i][j]==target){
                    return true;
                }
                else if(matrix[i][j]<target){
                    st = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return false;
        }
}
