package ru.vsu.kudinov_i_m.scenery.camp;

import ru.vsu.kudinov_i_m.scenery.DrawingObject;
import ru.vsu.kudinov_i_m.util.ArrayUtil;

import java.awt.*;

import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;

public class Tent extends DrawingObject
{
    private final double[] xCoordinatesLeftSide;
    private final double[] yCoordinatesLeftSide;
    private final double[] xCoordinatesRightSide;
    private final double[] yCoordinatesRightSide;
    private final double[] xCoordinatesDoor;
    private final double[] yCoordinatesDoor;
    private final double[] xCoordinatesLeftDoor;
    private final double[] yCoordinatesLeftDoor;
    private final double[] xCoordinatesRightDoor;
    private final double[] yCoordinatesRightDoor;


    public Tent(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight);
        this.xCoordinatesLeftSide = new double[]{coefficientX, coefficientX + coefficientWidth/2.0, coefficientX + coefficientWidth/2.0};
        this.yCoordinatesLeftSide = new double[]{coefficientY, coefficientY - coefficientHeight, coefficientY};

        this.xCoordinatesRightSide = new double[]{coefficientX + coefficientWidth/2.0, coefficientX + coefficientWidth/2.0, coefficientX + coefficientWidth};
        this.yCoordinatesRightSide = new double[]{coefficientY, coefficientY - coefficientHeight, coefficientY};

        this.xCoordinatesDoor = new double[]{coefficientX + coefficientWidth/3.0, coefficientX + coefficientWidth/2.0, coefficientX + coefficientWidth/1.5};
        this.yCoordinatesDoor = new double[]{coefficientY, coefficientY - coefficientHeight/3.3, coefficientY};

        this.xCoordinatesLeftDoor = new double[]{coefficientX + coefficientWidth/3.061224, coefficientX + coefficientWidth/2.027027, coefficientX + coefficientWidth/3.614457};
        this.yCoordinatesLeftDoor = new double[]{coefficientY, coefficientY - coefficientHeight/3.3, coefficientY - coefficientHeight/10.0};

        this.xCoordinatesRightDoor = new double[]{coefficientX + coefficientWidth/1.973684, coefficientX + coefficientWidth/1.485148, coefficientX + coefficientWidth/1.382488};
        this.yCoordinatesRightDoor = new double[]{coefficientY - coefficientHeight/3.3, coefficientY, coefficientY - coefficientHeight/10.0};
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {

        drawWithColor(gr, new Color(0xD4732F), () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinatesLeftSide, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinatesLeftSide, panelHeight)), 3);
            gr.setStroke(new BasicStroke(3));
            gr.drawLine((int)((coefficientX + coefficientWidth /2) * panelWidth), (int)((coefficientY - coefficientHeight) * panelHeight), (int)((coefficientX + coefficientWidth /2) * panelWidth), (int) ((coefficientY - coefficientHeight * 1.2) * panelHeight));
        });

        drawWithColor(gr, new Color(0x9A4D23), () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinatesRightSide, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinatesRightSide, panelHeight)), 3);
            gr.setStroke(new BasicStroke(3));
            gr.drawLine((int)((coefficientX + coefficientWidth /2) * panelWidth), (int)((coefficientY - coefficientHeight) * panelHeight), (int) ((coefficientX + coefficientWidth /2.30769) * panelWidth), (int) ((coefficientY - coefficientHeight * 1.15) * panelHeight));
            gr.drawLine((int)((coefficientX + coefficientWidth /2) * panelWidth), (int)((coefficientY - coefficientHeight) * panelHeight), (int) ((coefficientX + coefficientWidth /1.77514) * panelWidth), (int) ((coefficientY - coefficientHeight * 1.15) * panelHeight));
        });

        drawWithColor(gr, new Color(0x562A11), () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinatesDoor, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinatesDoor, panelHeight)), 3);
        });

        drawWithColor(gr, new Color(0xCFCBA6), () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinatesLeftDoor, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinatesLeftDoor, panelHeight)), 3);
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(xCoordinatesRightDoor, panelWidth)), ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(yCoordinatesRightDoor, panelHeight)), 3);
        });
    }
}
