package ru.vsu.kudinov_i_m.scenery;

import ru.vsu.kudinov_i_m.util.RandomUtil;

import java.awt.*;

import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;

public class Sun extends DrawingObject
{

    public Sun(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        drawWithColor(gr, this.color, () ->
        {
            gr.fillOval((int) (coefficientX * panelWidth), (int) (coefficientY * panelHeight), (int) (coefficientWidth * panelWidth), (int) (coefficientHeight * panelWidth));
        });
    }
}
