package com.gergosgames.rocketeer.main;

import com.gergosgames.rocketeer.window.Frame;

import javax.swing.*;
import java.awt.*;
import java.math.RoundingMode;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Rocketeer
{

    public static void main(String[] args)
    {
        Frame.init();




    }

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
