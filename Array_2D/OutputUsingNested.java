package Array_2D;

import java.util.Scanner;

public class OutputUsingNested {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int [][]arr = new int[3][3];
        int m = arr.length;//no. of Row ...
        int n =  arr[0].length;// no. of column..
        System.out.println(m);
        System.out.println(n);
        for (int i = 0 ;i<m;i++){
            for (int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //2dArray of output
        for (int i = 0 ;i<m;i++){
            for (int j = 0; j<n;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }


}
