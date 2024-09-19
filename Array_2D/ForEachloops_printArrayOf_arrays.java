package Array_2D;

public class ForEachloops_printArrayOf_arrays {
    public static void main(String[] args) {
        int[] a = {0, 1, 2};
        for (int ele : a) {
            System.out.print(ele+" ");
        }
        System.out.println();
        //1 2 3
        //4 5 6
        int[][]b = {{3,4,5},{6,7,8}};
        for (int[] ele: b){
            for (int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();

        }
    }

    }
