package cn.chane.basic;

public class ArrayMax
{
    public static void main(String[] args) {
        int[] arr = {1,35,2,45,2,0,232,2,4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
