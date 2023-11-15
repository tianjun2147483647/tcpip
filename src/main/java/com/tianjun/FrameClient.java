package com.tianjun;

import javax.swing.*;
import java.awt.*;

public class FrameClient {
    public FrameClient() {
        //config
        JFrame frameClient=new JFrame("客户端");
        frameClient.setSize(500,400);
        frameClient.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameClient.setVisible(true);
        frameClient.setBackground(Color.white);
        frameClient.setResizable(false);

        //context
        JTextField labelOUT = new JTextField();
        labelOUT.setText("与服务器交互记录:");
        labelOUT.setEditable(false);
        JTextArea out = new JTextArea(100,1);
        out.setBounds(0,0,450,200);
        JScrollPane outSP = new JScrollPane(out);
        JTextField labelIN = new JTextField();
        labelIN.setText("请输入:");
        labelIN.setEditable(false);
        labelIN.setBounds(0,200,50,20);
        JTextArea in = new JTextArea();
        in.setBounds(0,220,450,100);
        JScrollPane inSP = new JScrollPane(in);


        Container CC=frameClient.getContentPane();
        CC.add(labelOUT);
        CC.add(out);
        CC.add(outSP);
        CC.add(labelIN);
        CC.add(in);
        CC.add(inSP);
    }
}
