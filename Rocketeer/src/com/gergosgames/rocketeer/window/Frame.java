package com.gergosgames.rocketeer.window;

import com.gergosgames.rocketeer.engine.Vector2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.gergosgames.rocketeer.engine.Math;
import com.gergosgames.rocketeer.engine.Vector4;
import com.gergosgames.rocketeer.main.Rocketeer;

public class Frame
{
    public static Rectangle SetBoundsProper (int posX, int posY, int width, int height)
    {
        Vector2 pos = Vector2.GPRTSM(new Vector2(posX, posY));
        Rectangle r = new Rectangle(Math.RoundToInt(pos.x) - width/2, Math.RoundToInt(pos.y) - height, width, height);




        return r;
    }

    public static void ChangeWindow(JFrame from, JFrame to)
    {
        from.setVisible(false);
        to.setVisible(true);
    }



    public static void init() { Menu.init(); GameSelect.init();}
    public static final int frameWidth = 800;
    public static final int frameHeight = 600;

    public static class Menu
    {


        public static final JFrame f = new JFrame("Rocketeer");

        public static void init()
        {

            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setSize(800, 600);
            f.setResizable(false);
            f.setLayout(null);

            JButton startButton = CreateUI.CreateButton(0, 0, 150, 25, "Start game", f);
            startButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Frame.ChangeWindow(f, GameSelect.f);
                }
            });


            JButton githubButton =CreateUI.CreateButton(0, -25, 150, 25, "View code on Github", f);
            githubButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Rocketeer.openWebpage("gergosgames.com");
            }
        });

            f.setVisible(true);



        }


    }

    public static class GameSelect {


        public static final JFrame f = new JFrame("Rocketeer");

        public static void init() {

            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setSize(800, 600);
            f.setResizable(false);
            f.setLayout(null);

            //Start
            JButton startButton = CreateUI.CreateButton(0, 300-25, 150, 25, "Start game", f);

            //Difficulty
            JSlider difficultySlider = CreateUI.CreateSlider(75, 300-75, 150, 50, 0, 10, 0, f);
            JLabel difficultyLabel = CreateUI.CreateLabel(-75, 300-75, 150, 25, "Difficulty", f);
            difficultySlider.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    difficultyLabel.setText("Difficulty: " + difficultySlider.getValue());
                }
            });



            f.setVisible(false);


        }

    }

}
