package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;
import java.util.ArrayList;

public abstract class CompositionOfDrawingObject extends DrawingObject
{
    private ArrayList<DrawingObject> objects = new ArrayList<>();

    public CompositionOfDrawingObject(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight, color);
    }

    public ArrayList<DrawingObject> getObjects()
    {
        return objects;
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        if (objects != null)
        {
            this.objects.forEach(drawingObject -> drawingObject.draw(gr, panelWidth, panelHeight));
        }
    }
}
