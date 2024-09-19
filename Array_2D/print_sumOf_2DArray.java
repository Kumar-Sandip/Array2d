package Array_2D;

public class print_sumOf_2DArray {
    public static void main(String[] args) {
        int [][]arr= {{1,2,3} , {4,5,6}, {8,9,10}};
        int mx = Integer.MIN_VALUE;
        int m  = arr.length;
        int n =arr [0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);
               sum+= arr[i][j];
            }

        }
//        System.out.println("The largest element is: "+mx);
        System.out.println("2D Array total Sum is: "+sum);
    }
}
