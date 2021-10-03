package ru.vsu.kudinov_i_m.view;

import javax.swing.*;

public class FrameMain extends JFrame
{
    public FrameMain()
    {
        setTitle("Сamp in the forest");
        setSize(1100, 800);
        ImageIcon icon = new ImageIcon("src\\ru\\vsu\\kudinov_i_m\\resources\\icon.jpg");
        setIconImage(icon.getImage());
        add(new MainPanel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
