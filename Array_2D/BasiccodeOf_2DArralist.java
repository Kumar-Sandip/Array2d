package Array_2D;

import java.util.ArrayList;
import java.util.List;

public class BasiccodeOf_2DArralist {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(30);a.add(20);
        List<Integer> b = new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b);l.add(c);l.add(d);
        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));.......direct printing
            List<Integer> x = l.get(i);
            for (int j = 0; j <x.size() ; j++) {
                System.out.print(x.get(j)+" ");

            }
            System.out.println();
            }

        }
    }

