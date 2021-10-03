package ru.vsu.kudinov_i_m.scenery.camp;

import ru.vsu.kudinov_i_m.scenery.DrawingObject;
import ru.vsu.kudinov_i_m.util.ArrayUtil;

import java.awt.*;
import java.util.Arrays;

import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;

public class Campfire extends DrawingObject
{
    private final double[] xCoordinate;
    private final double[] yCoordinate;
    private final double[] xCoordinateBackfire;
    private final double[] yCoordinateBackfire;

    public Campfire(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight);

        double campFireMiddle = coefficientX + coefficientWidth / 2;
        this.xCoordinate = new double[]{campFireMiddle - coefficientWidth/2.8, coefficientX, campFireMiddle - coefficientWidth/2.333333, campFireMiddle - coefficientWidth/1.842105, campFireMiddle - coefficientWidth/2.121212, campFireMiddle - coefficientWidth/1.75, campFireMiddle - coefficientWidth/2.8, campFireMiddle - coefficientWidth/2.258064, campFireMiddle - coefficientWidth/5.833333, campFireMiddle, campFireMiddle + coefficientWidth/5.833333, campFireMiddle + coefficientWidth/2.258064, campFireMiddle + coefficientWidth/2.8, campFireMiddle + coefficientWidth/1.75, campFireMiddle + coefficientWidth/2.121212, campFireMiddle + coefficientWidth/1.842105, campFireMiddle + coefficientWidth/2.333333, coefficientX + coefficientWidth, campFireMiddle + coefficientWidth/2.8};
        this.yCoordinate = new double[]{coefficientY - coefficientHeight/5.333333, coefficientY - coefficientHeight/3.2, coefficientY - coefficientHeight/3.2, coefficientY - coefficientHeight/2.424242, coefficientY - coefficientHeight/2.424242, coefficientY - coefficientHeight/1.538461, coefficientY - coefficientHeight/1.951219, coefficientY - coefficientHeight/1.194029, coefficientY - coefficientHeight/1.509433, coefficientY - coefficientHeight, coefficientY - coefficientHeight/1.509433, coefficientY - coefficientHeight/1.194029, coefficientY - coefficientHeight/1.951219, coefficientY - coefficientHeight/1.538461, coefficientY - coefficientHeight/2.424242, coefficientY - coefficientHeight/2.424242, coefficientY - coefficientHeight/3.2, coefficientY - coefficientHeight/3.2, coefficientY - coefficientHeight/5.333333};

        this.xCoordinateBackfire = Arrays.copyOf(xCoordinate, xCoordinate.length);
        this.yCoordinateBackfire = Arrays.copyOf(yCoordinate, yCoordinate.length);

        for(int i = 0; i < 9; i++)
        {
            xCoordinateBackfire[i] +=coefficientWidth/7;
        }
        for(int i = 10; i < xCoordinate.length - 1; i++)
        {
            xCoordinateBackfire[i] -=coefficientWidth/7;
        }
        for (int i = 1; i < yCoordinate.length - 2; i++)
        {
            yCoordinateBackfire[i] +=coefficientHeight/8;
        }
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        drawWithColor(gr, new Color(0x4E483C), () ->
        {
            gr.fillRoundRect((int) (coefficientX * panelWidth), (int) ((coefficientY - coefficientHeight /5.333333) * panelHeight), (int) (coefficientWidth * panelWidth), (int) (coefficientHeight /5.333333 * panelHeight), 10, 10);
        });

        drawWithColor(gr, new Color(0x898375), () ->
        {
            gr.fillOval((int) (coefficientX * panelWidth), (int) ((coefficientY - coefficientHeight /5.333333) * panelHeight), 10, 15);
        });

        drawWithColor(gr, new Color(0xF2AD24), () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinate, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinate, panelHeight)), 19);
        });

        drawWithColor(gr, new Color(0xB6472C), () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinateBackfire, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinateBackfire, panelHeight)), 19);

        });

        drawWithColor(gr, new Color(0xC0BCBC), () ->
        {
            gr.drawArc((int) ((coefficientX - coefficientWidth /4) * panelWidth), (int) ((coefficientY - coefficientHeight * 2.1) * panelHeight), (int) (coefficientWidth * 1.428571 * panelWidth), (int) (coefficientHeight * 1.25 * panelHeight), 90, 150);
            gr.drawArc((int) ((coefficientX - coefficientWidth /2) * panelWidth), (int) ((coefficientY - coefficientHeight * 2.2) * panelHeight), (int) (coefficientWidth * 1.428571 * panelWidth), (int) (coefficientHeight * 1.25 * panelHeight), 300, 90);
            gr.drawArc((int) ((coefficientX - coefficientWidth /5) * panelWidth), (int) ((coefficientY - coefficientHeight * 2.3) * panelHeight), (int) (coefficientWidth * 1.428571 * panelWidth), (int) (coefficientHeight * 1.5 * panelHeight), 300, 90);
        });
    }
}
