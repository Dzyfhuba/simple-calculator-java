/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    JFrame f;
    JLabel l_a;
    JTextField bilangan_a;
    JLabel l_b;
    JTextField bilangan_b;
    JButton tambah;
    JButton kurang;
    JButton kali;
    JButton bagi;
    JLabel l_hasil;
    static JTextField tf_hasil;
    static double hasil;

    public Main() {

        f = new JFrame("Kalkulator Sederhana");
        f.setBounds(10, 10, 700, 500);

        l_a = new JLabel("Bilangan A :");
        l_a.setBounds(10, 10, 100, 30);

        bilangan_a = new JTextField();
        bilangan_a.setBounds(105, 5, 100, 40);

        l_b = new JLabel("Bilangan B :");
        l_b.setBounds(10, 55, 100, 30);

        bilangan_b = new JTextField();
        bilangan_b.setBounds(105, 50, 100, 40);

        tambah = new JButton("+");
        tambah.setBounds(10, 100, 50, 50);

        kurang = new JButton("-");
        kurang.setBounds(60, 100, 50, 50);

        kali = new JButton("*");
        kali.setBounds(110, 100, 50, 50);

        bagi = new JButton("/");
        bagi.setBounds(160, 100, 50, 50);

        l_hasil = new JLabel("Hasil:");
        l_hasil.setBounds(250, 15, 50, 30);

        tf_hasil = new JTextField();
        tf_hasil.setBounds(300, 10, 100, 40);

        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double bil_a = Double.valueOf(bilangan_a.getText());
                double bil_b = Double.valueOf(bilangan_b.getText());
                System.out.println(bil_a);
                Main.hasil = bil_a + bil_b;
                Main.tf_hasil.setText("" + Main.hasil);
            }
        });
        kurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double bil_a = Double.valueOf(bilangan_a.getText());
                double bil_b = Double.valueOf(bilangan_b.getText());
                System.out.println(bil_a);
                Main.hasil = bil_a - bil_b;
                Main.tf_hasil.setText("" + Main.hasil);
            }
        });
        kali.addActionListener((ActionEvent e) -> {
            double bil_a = Double.valueOf(bilangan_a.getText());
            double bil_b = Double.valueOf(bilangan_b.getText());
            System.out.println(bil_a);
            Main.hasil = bil_a * bil_b;
            Main.tf_hasil.setText("" + Main.hasil);
        });
        bagi.addActionListener((ActionEvent e) -> {
            double bil_a = Double.valueOf(bilangan_a.getText());
            double bil_b = Double.valueOf(bilangan_b.getText());
            System.out.println(bil_a);
            Main.hasil = bil_a / bil_b;
            Main.tf_hasil.setText("" + Main.hasil);
        });

        f.add(l_a);
        f.add(l_b);
        f.add(bilangan_a);
        f.add(bilangan_b);
        f.add(tambah);
        f.add(kurang);
        f.add(kali);
        f.add(bagi);
        f.add(l_hasil);
        f.add(tf_hasil);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Main m = new Main();
        
    }

}
