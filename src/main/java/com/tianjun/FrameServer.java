package com.tianjun;

import javax.swing.*;
import java.awt.*;

public class FrameServer {
    public FrameServer() {
        //config
        JFrame frameServer=new JFrame("服务器端");
        frameServer.setBounds(200,0,400,300);
        frameServer.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameServer.setVisible(true);

        //context
        JTextArea out= new JTextArea(100,1);
        out.setText("与客户端交互记录:");
        out.setEditable(false);
        JTextArea in = new JTextArea();
        in.setText("");
        JScrollPane outSP = new JScrollPane(out);

        Container CS=frameServer.getContentPane();
        CS.add(outSP);
        CS.add(out);

    }
}
