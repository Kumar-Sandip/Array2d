package Array_2D;
public class tranposOfthe_Matrix_usingFunction_02 {
    public static void print (int [][] arr) { }
    public static void main(String[]args){
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m  = arr.length;
//        print(arr);
        //transposi ng.....
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;


            }

        }
        print(arr);
        }
      

    }

