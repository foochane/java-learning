package cn.chane.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FISRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\code\\java-learning\\image\\02-Lambda.png");
        FileOutputStream fos = new FileOutputStream("test_copy1.png");


        byte[] b = new byte[1024];
        int len;

        StringBuilder sb = new StringBuilder();

        while ((len = fis.read(b))!=-1){
            sb.append(Arrays.toString(b));
//            fos.write(b, 0 , len);
        }

    }
}
