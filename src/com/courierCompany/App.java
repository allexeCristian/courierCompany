package com.courierCompany;

import javax.swing.*;

public class App {
    private JRadioButton radioButton1;
    private JPanel panelPrincipal;

    public static void main(String[] args){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
