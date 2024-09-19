package Array_2D;

public class Find_theLargestElementOf_2DArray {
    public static void main(String[] args) {
        int [][]arr= {{1,2,3} , {4,5,6}, {8,9,10}};
        int mx = Integer.MIN_VALUE;
        int m  = arr.length;
        int n =arr [0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);

            }

        }
        System.out.println("The Largest element is: "+mx);



        // Print minimum element
//        int mx = Integer.MAX_VALUE;
//        int m  = arr.length;
//        int n =arr [0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                mx = Math.min(mx,arr[i][j]);
//
//            }
//
//        }
//        System.out.println("The Minimum element is: "+mx);

    }
}
