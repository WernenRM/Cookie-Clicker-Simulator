package com.company;

import javax.swing.*;
import java.awt.*;

public class CookieMain {

    public static void main(String[] args) {

        new CookieMain();
    }

    public CookieMain(){


    }

    public void creatUI(){

        JFrame window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        JPanel cookiePanel = new JPanel();
        cookiePanel.setBounds(100, 220, 200, 200);
        cookiePanel.setBackground(Color.BLUE);
        window.add(cookiePanel);

//        ImageIcon cokie = new ImageIcon(getClass().getCl)

    }
}
