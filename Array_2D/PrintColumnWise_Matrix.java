package Array_2D;

public class PrintColumnWise_Matrix {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        for (int j = 0; j < n; j++) {// column wise printing
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        //row \wise printing

//        }
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int m = arr.length;
//        int n = arr[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {// column wise printing
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();

        }
    }
}