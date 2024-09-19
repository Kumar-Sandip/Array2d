package Array_2D;

public class tranposOfthe_Matrix_andStoreAnewmatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;
        for (int j = 0; j < n; j++) {// column wise printing
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//            }
//            System.out.println();

            System.out.println();
            int[][] transpose = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {// column wise printing
                    transpose[i][j] = arr[j][i];
                    System.out.print(transpose[i][j] + " ");


                }
                System.out.println();
            }

// this transpose matrix and store a new matrix value..........
        }}