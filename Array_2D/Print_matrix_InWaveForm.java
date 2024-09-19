package Array_2D;

public class Print_matrix_InWaveForm {
    public static void print(int [][] arr) {
        int m = arr.length; int n =arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length; int n = arr[0].length;
        print(arr);
        // print in wave form...........
        // it is row wise printing...
        for (int i = 0; i < m; i++) {
            if (1%2==0){
                for (int j = 0; j <n ; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }

else {
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j]+" ");
                    
                }

            }
        }

    }
}