package com.gergosgames.rocketeer.engine;

import com.gergosgames.rocketeer.window.Frame;

public class Vector2
{
    public float x;
    public float y;

    public Vector2(float _x, float _y)
    {
        x = _x;
        y = _y;
    }

    public static Vector2 Halve(Vector2 point)
    {
        return new Vector2(point.x/2, point.y/2);
    }

    public static Vector2 Add(Vector2 point1, Vector2 point2)
    {
        return new Vector2( point1.x + point2.x, point1.y + point2.y);
    }

    public static Vector2 GPRTSM(Vector2 point)
    {
        Vector2 windowSize = new Vector2(Frame.frameWidth, Frame.frameHeight);
        Vector2 windowMiddle = Halve(windowSize);


        return Add(point, windowMiddle);
    }
}
