package com.tianjun;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class FrameServer {
    public FrameServer() {
        //config
        JFrame frameServer=new JFrame("服务端");
        frameServer.setSize(500,400);
        frameServer.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameServer.setVisible(true);
        frameServer.setBackground(Color.white);
        frameServer.setResizable(false);

        //context
        JTextField labelOUT = new JTextField();
        labelOUT.setText("与客户端交互记录:");
        labelOUT.setEditable(false);
        labelOUT.setBounds(0,0,105,20);
        JTextArea out= new JTextArea(100,1);
        out.setBounds(0,20,480,340);
        out.setEditable(false);
        JScrollPane outSP = new JScrollPane(out);



        Container CS=frameServer.getContentPane();
        CS.add(labelOUT);
        CS.add(out);
        CS.add(outSP);

        //tcp
        try {
            new TCPSever(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
