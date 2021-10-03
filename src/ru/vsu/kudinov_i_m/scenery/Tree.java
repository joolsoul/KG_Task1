package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

import static ru.vsu.kudinov_i_m.util.ArrayUtil.toIntArray;
import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;

public class Tree extends DrawingObject
{
    private double[] x;
    private double[] y;
    private int treeMiddle;
    private int treeHeight;

    public Tree(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        double yCoordinate = coefficientY * panelHeight;
        double xCoordinate = coefficientX * panelWidth;
        double width = coefficientWidth * panelWidth;
        double height = coefficientHeight * panelHeight;

        treeMiddle = (int) (xCoordinate + width/2);
        treeHeight = (int) height;

        x = new double[]{xCoordinate, treeMiddle - width/3.7,treeMiddle - width/2.4,treeMiddle - width/5.3,treeMiddle - width/3.4, treeMiddle - width/8, treeMiddle - width/4.4, treeMiddle, treeMiddle + width/4.4, treeMiddle + width/8, treeMiddle + width/3.4, treeMiddle + width/5.3, treeMiddle + width/2.4, treeMiddle + width/3.7, xCoordinate + width};
        y = new double[]{yCoordinate, yCoordinate - treeHeight/4.5, yCoordinate - treeHeight/4.5, yCoordinate - treeHeight/2.25, yCoordinate - treeHeight/2.25, yCoordinate - treeHeight/1.5, yCoordinate - treeHeight/1.5, yCoordinate - treeHeight, yCoordinate - treeHeight/1.5, yCoordinate - treeHeight/1.5, yCoordinate - treeHeight/2.25, yCoordinate - treeHeight/2.25, yCoordinate - treeHeight/4, yCoordinate - treeHeight/4, yCoordinate};


        drawWithColor(gr, this.color, () ->
        {
            gr.fillPolygon(toIntArray(x),
                    toIntArray(y), 15);
        });

        gr.setPaint(new Color(0x60A39C));
        gr.setStroke(new BasicStroke(2));
        gr.drawLine(treeMiddle, (int) (yCoordinate - 2), treeMiddle, (int) (yCoordinate + 4 - treeHeight));
        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/5.2), (int) (treeMiddle - width/4), (int) (yCoordinate - 10));
        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/5.2), (int) (treeMiddle + width/4), (int) (yCoordinate - 10));

        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/2.3), (int) (treeMiddle - width/5.3), (int) (yCoordinate - treeHeight/4.5));
        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/2.3), (int) (treeMiddle + width/5.3), (int) (yCoordinate - treeHeight/4.5));

        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/1.6), (int) (treeMiddle - width/6.9), (int) (yCoordinate - treeHeight/2.1));
        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/1.6), (int) (treeMiddle + width/6.9), (int) (yCoordinate - treeHeight/2.1));

        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/1.2), (int) (treeMiddle - width/9.6), (int) (yCoordinate - treeHeight/1.5));
        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/1.2), (int) (treeMiddle + width/9.6), (int) (yCoordinate - treeHeight/1.5));

        gr.drawLine((int) (treeMiddle + width/12.5), (int) (yCoordinate - treeHeight/2.9), (int) (treeMiddle + width/8), (int) (yCoordinate - treeHeight/4.5));
        gr.drawLine((int) (treeMiddle - width/12.5), (int) (yCoordinate - treeHeight/2.9), (int) (treeMiddle - width/8), (int) (yCoordinate - treeHeight/4.5));

        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/2.3), (int) (treeMiddle + width/4.5), (int) (yCoordinate - treeHeight/3.3));
        gr.drawLine(treeMiddle, (int) (yCoordinate - treeHeight/2.3), (int) (treeMiddle - width/4.5), (int) (yCoordinate - treeHeight/3.3));

        gr.drawLine((int) (treeMiddle - width/10.3), (int) (yCoordinate - treeHeight/8), (int) (treeMiddle - width/8), (int) (yCoordinate - treeHeight/24));
        gr.drawLine((int) (treeMiddle + width/10.3), (int) (yCoordinate - treeHeight/8), (int) (treeMiddle + width/8), (int) (yCoordinate - treeHeight/24));

        gr.drawLine((int) (treeMiddle - width/8), (int) (yCoordinate - treeHeight/9), (int) (treeMiddle - width/4), (int) (yCoordinate - treeHeight/12));
        gr.drawLine((int) (treeMiddle + width/8), (int) (yCoordinate - treeHeight/9), (int) (treeMiddle + width/4), (int) (yCoordinate - treeHeight/12));

        gr.drawLine((int) (treeMiddle - width/12), (int) (yCoordinate - treeHeight/1.85), (int) (treeMiddle - width/12), (int) (yCoordinate - treeHeight/2.1));
        gr.drawLine((int) (treeMiddle + width/12), (int) (yCoordinate - treeHeight/1.85), (int) (treeMiddle + width/12), (int) (yCoordinate - treeHeight/2.1));

        gr.drawLine((int) (treeMiddle - width/24), (int) (yCoordinate - treeHeight/1.7), (int) (treeMiddle - width/6), (int) (yCoordinate - treeHeight/1.9));
        gr.drawLine((int) (treeMiddle + width/24), (int) (yCoordinate - treeHeight/1.7), (int) (treeMiddle + width/6), (int) (yCoordinate - treeHeight/1.9));

        gr.drawLine((int) (treeMiddle - width/16), (int) (yCoordinate - treeHeight/1.37), (int) (treeMiddle - width/16), (int) (yCoordinate - treeHeight/1.5));
        gr.drawLine((int) (treeMiddle + width/16), (int) (yCoordinate - treeHeight/1.37), (int) (treeMiddle + width/16), (int) (yCoordinate - treeHeight/1.5));

        gr.drawLine((int) (treeMiddle - width/24), (int) (yCoordinate - treeHeight/1.3), (int) (treeMiddle - width/6.9), (int) (yCoordinate - treeHeight/1.4));
        gr.drawLine((int) (treeMiddle + width/24), (int) (yCoordinate - treeHeight/1.3), (int) (treeMiddle + width/6.9), (int) (yCoordinate - treeHeight/1.4));
    }
}
