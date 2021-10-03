package ru.vsu.kudinov_i_m.scenery;

import ru.vsu.kudinov_i_m.util.RandomUtil;
import ru.vsu.kudinov_i_m.util.ArrayUtil;

import java.awt.*;

import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;

public class Ice extends DrawingObject
{
    private final double[] x;
    private final double[] y;
    private final double[] width;

    public Ice(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight, color);

        int numberOfIce = RandomUtil.randInt(15, 25);
        this.x = new double[numberOfIce];
        this.y = new double[numberOfIce];
        this.width = new double[numberOfIce];

        for (int i = 0; i < numberOfIce; i++)
        {
            this.x[i] = RandomUtil.randDouble(coefficientX, coefficientWidth);
            this.y[i] = RandomUtil.randDouble(coefficientY, coefficientY + coefficientHeight);
            this.width[i] = RandomUtil.randInt(100, 200);
        }
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        drawWithColor(gr, this.color, () ->
        {
            for (int i = 0; i < 10; i++)
            {
                gr.fillRoundRect(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(x, panelWidth))[i],
                        ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(y, panelHeight))[i], ArrayUtil.toIntArray(width)[i], 5, 20, 10);
            }
        });
    }
}
