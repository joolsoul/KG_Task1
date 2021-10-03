package ru.vsu.kudinov_i_m.util;

import java.util.Random;

public class RandomUtil
{
    private static final Random rnd = new Random();

    public static int randInt(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static double randDouble(double i1, double i2)
    {
        return i1 + (i2 - i1) * rnd.nextDouble();
    }
}