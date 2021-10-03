package ru.vsu.kudinov_i_m.scenery.camp;

import ru.vsu.kudinov_i_m.scenery.DrawingObject;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Camp extends DrawingObject
{
    private final List<DrawingObject> camp = new LinkedList<>();

    public Camp(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight);

        this.camp.add(new Tent(coefficientX, coefficientY,  coefficientWidth, coefficientHeight));
        this.camp.add(new Tent(coefficientX + coefficientWidth/1.2, coefficientY, coefficientWidth, coefficientHeight));
        this.camp.add(new Tent(coefficientX + coefficientWidth * 2, coefficientY, coefficientWidth, coefficientHeight));
        this.camp.add(new Campfire(coefficientX + coefficientWidth/1.2 + coefficientWidth, coefficientY, coefficientWidth/3.571428, coefficientHeight/2));
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        for(DrawingObject drawingObject : camp)
        {
            drawingObject.draw(gr, panelWidth, panelHeight);
        }
    }
}
