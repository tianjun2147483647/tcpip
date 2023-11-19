package com.tianjun;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.io.IOException;

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
        labelOUT.setBounds(0,0,105,20);
        JTextArea out = new JTextArea(100,1);
        out.setBounds(0,20,480,200);
        out.setEditable(false);
        JScrollPane outSP = new JScrollPane(out);
        JTextField labelIN = new JTextField();
        labelIN.setText("请输入:");
        labelIN.setEditable(false);
        labelIN.setBounds(0,220,50,20);
        JTextArea in = new JTextArea();
        in.setBounds(0,240,480,90);
        JScrollPane inSP = new JScrollPane(in);

        //button
        JButton send = new JButton("发送");
        send.setUI(new BasicButtonUI());
        send.setBounds(130,330,60,30);
        send.addActionListener(e -> {
            try {
                new TCPClient(in.getText());
                out.append(in.getText()+"\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton clear = new JButton("清空");
        clear.setUI(new BasicButtonUI());
        clear.setBounds(250,330,60,30);
        clear.addActionListener(e -> in.setText(""));

        //init
        Container CC=frameClient.getContentPane();
        CC.add(send);
        CC.add(clear);
        CC.add(labelOUT);
        CC.add(out);
        CC.add(outSP);
        CC.add(labelIN);
        CC.add(in);
        CC.add(inSP);

    }
}
