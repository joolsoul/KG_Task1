package ru.vsu.kudinov_i_m.scenery;

import ru.vsu.kudinov_i_m.util.ArrayUtil;

import java.awt.*;

import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;

public class Mountains extends DrawingObject
{
    private final double[] x;
    private final double[] y;

    public Mountains(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight, color);

        this.x = new double[]{coefficientX, coefficientX + coefficientWidth/2.0, coefficientX + coefficientWidth};
        this.y = new double[]{coefficientY, coefficientY - coefficientHeight, coefficientY,};
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        drawWithColor(gr, this.color, () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(x, panelWidth)),
                    ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(y, panelHeight)), 3);

        });
    }
}
