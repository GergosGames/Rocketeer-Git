package com.gergosgames.rocketeer.engine;

import java.awt.*;

public class Vector4
{
    public float x,  y,  z,  w;

    public Vector4(float _x, float _y, float _z, float _w)
    {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }

    public Rectangle V4ToRect(Vector4 v)
    {
        return new Rectangle(Math.RoundToInt(v.x), Math.RoundToInt(v.y), Math.RoundToInt(v.z), Math.RoundToInt(v.w));
    }
}
