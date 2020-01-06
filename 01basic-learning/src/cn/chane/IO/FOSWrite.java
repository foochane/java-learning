package cn.chane.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FOSWrite {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("E:\\test\\a.txt");
//
//        fos.write(97); // 写出第1个字节
//        fos.write(98); // 写出第2个字节
//        fos.write(99); // 写出第3个字节
//
//        fos.close();

        //1 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("test.txt");

        //2 写入
        //2.1 数组全部写入
        // 字符串转换为字节数组
        //byte[] b = {65,66,67,68,69};//ABCDE
        //byte[] b = {-65,-66,-67,68,69};//烤紻E
        byte[] b = "你好世界".getBytes(); //你好世界
        System.out.println(Arrays.toString(b));//[[-28, -67, -96, -27, -91, -67, -28, -72, -106, -25, -107, -116]]
        // 写出字节数组数据
        fos.write(b);

        //2.2 数组部分写入
        byte[] b1 = {65,66,67,68,69};//ABCDE
        fos.write(b1,2,3); //写入CDE

        //3 关闭资源
        fos.close();
    }
}
