package cn.chane.api;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
            int[] ints = {3,2,4,5,1};
            System.out.println(Arrays.toString(ints));
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));

            String[] strs = {"AB","BBB","BAB","C","ABC"};
            System.out.println(Arrays.toString(strs));
            Arrays.sort(strs);
            System.out.println(Arrays.toString(strs));
    }
}
