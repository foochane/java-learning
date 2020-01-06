package cn.chane.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1 创建服务器对象
        ServerSocket ss = new ServerSocket(6666);

        //2 接收客户端对象
        Socket s = ss.accept();

        //3 获取网络输入流
        InputStream is  = s.getInputStream();

        //4 读取客户端数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        //发送数据给服务端
        OutputStream os = s.getOutputStream();
        os.write("服务端的数据".getBytes());


        //5 释放资源
        s.close();
        ss.close();
    }
}
