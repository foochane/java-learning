package cn.chane.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1 创建客户端对象
        Socket s = new Socket("127.0.0.1",6666);

        //2 使用socket对象获取网络输出流
        OutputStream os = s.getOutputStream();

        //3 使用输出流给服务端发送数据
        os.write("服务端你好".getBytes());

        //接收服务端数据
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        //4 释放资源
        os.close();
        s.close();
    }
}
