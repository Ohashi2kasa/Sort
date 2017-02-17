package com.ohashi.test.ui;

import javax.swing.*;

/**
 * Created by ohashi on 2017/02/03.
 */
public class SwingSample1_2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("大橋");
        frame.setBounds(100,100,200,160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane1 = new JPanel();
        JButton button = new JButton("ok");
        pane1.add(button);
        frame.add(pane1);
        frame.setVisible(true);
    }
}
