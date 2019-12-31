package cn.chane.basic;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{1,2,3};
        int[] arr3 = {1,2,3};
        int[] arr4 = arr3;

        System.out.println(arr3);
        System.out.println(arr4);

        System.out.println(arr3[1]);
        System.out.println(arr4[1]);

        arr4[1] = 100;

        System.out.println(arr3[1]);
        System.out.println(arr4[1]);

    }
}
