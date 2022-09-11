package com.gergosgames.rocketeer.window;

import javax.swing.*;
import java.util.ArrayList;

public class CreateUI
{
    public static ArrayList<JButton> buttons = new ArrayList<JButton>();
    public static ArrayList<JSlider> sliders = new ArrayList<JSlider>();

    public static ArrayList<JLabel> labels = new ArrayList<JLabel>();

    public static JButton CreateButton(int posX, int posY, int width, int height, String text, JFrame f)
    {
        JButton b;
        b = new JButton(text);
        b.setBounds(Frame.SetBoundsProper(posX, -posY, width, height));
        buttons.add(b);
        f.add(b);
        return b;
    }

    public static JSlider CreateSlider(int posX, int posY, int width, int height, int min, int max, int value, JFrame f)
    {
        JSlider s;
        s = new JSlider(min, max, value);
        s.setBounds(Frame.SetBoundsProper(posX, -posY, width, height));
        s.setMinorTickSpacing(2);
        s.setMajorTickSpacing(2);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        sliders.add(s);
        f.add(s);
        return s;
    }

    public static JLabel CreateLabel(int posX, int posY, int width, int height, String text, JFrame f)
    {
        JLabel l;
        l = new JLabel(text);
        l.setBounds(Frame.SetBoundsProper(posX, -posY, width, height));
        labels.add(l);
        f.add(l);
        return l;
    }
}
