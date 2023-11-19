package com.tianjun;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient{
    public TCPClient(String clientM) throws IOException {
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        int port=9999;
        Socket socket = new Socket(serverIP, port);

        //发送
        OutputStream os = socket.getOutputStream();
        os.write(clientM.getBytes());
        os.close();
        socket.close();
    }
}
