package com.tianjun;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSever {
    ServerSocket serverSocket;
    Socket socket;
    InputStream is;
    ByteArrayOutputStream baos;
    public TCPSever(JTextArea area) throws IOException {

        //等待连接
        while (true) {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            //读取
            is = socket.getInputStream();

            //管道流
            baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                baos.write(bytes, 0, len);
//			new String(bytes,0,len);
            }

            area.append(baos.toString()+"\n");

            if (baos != null) {
                baos.close();
            }
            if (is != null) {
                is.close();
            }
            if (socket != null) {
                socket.close();
            }
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }

}
