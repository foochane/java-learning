package cn.chane.api;

public class StringDemo {
    public static void main(String[] args) {
        byte[] byteArray = {23,34,66,33};
        String byteArrayStr = new String(byteArray);
        System.out.println(byteArrayStr);

        char[] chars = {'d','a','d','e'};
        String charStr = new String(chars);
        System.out.println(charStr);

        //创建字符串对象
        String s = "abcde";

        // char[] toCharArray():把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for(int x = 0; x < chs.length; x++) {
            System.out.println(chs[x]);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

        // byte[] getBytes ():把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for(int x = 0; x < bytes.length; x++) {
            System.out.println(bytes[x]);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

        //world替换为WORLD
        String str = "hello world";
        String replace = str.replace("world", "WORLD");
        System.out.println(replace); // hello WORLD
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

        //创建字符串对象
        String ss = "aa#bb#cc";
        String[] strArray = ss.split("#"); // ["aa","bb","cc"]
        for(int x = 0; x < strArray.length; x++) {
            System.out.println(strArray[x]); // aa bb cc
        }
    }
}
