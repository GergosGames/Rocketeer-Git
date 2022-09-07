package com.gergosgames.rocketeer.window;

import com.gergosgames.rocketeer.engine.Vector2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import com.gergosgames.rocketeer.engine.Math;

public class Frame
{
    public static final int frameWidth = 800;
    public static final int frameHeight = 600;

    public static ArrayList<Component> components = new ArrayList<Component>();
    public static void init()
    {
        JButton startButton = new JButton("Start");
        startButton.setBounds(  Math.RoundToInt(Vector2.GPRTSM(new Vector2(0, 50)).x),  Vector2.GPRTSM(new Vector2(0, 50)).y, 150, 50);
        components.add(startButton);
    }

    public static class Window
    {
        public static final JFrame f = new JFrame("Rocketeer");

        public static void init()
        {
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setSize(800, 600);
            f.setResizable(false);

            for (Component c : components)
            {
                f.add(c);
            }

            f.setVisible(true);



        }


    }
}
