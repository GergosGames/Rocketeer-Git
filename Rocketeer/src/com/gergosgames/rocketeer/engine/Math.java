package com.gergosgames.rocketeer.engine;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Math
{
    public static int RoundToInt (Number n)
    {
        DecimalFormat df = new DecimalFormat("#");
        df.setRoundingMode(RoundingMode.UP);

        Double d = n.doubleValue();
        return Integer.parseInt(df.format(d));
    }
}
