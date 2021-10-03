package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public abstract class DrawingObject
{
    protected final double coefficientX;
    protected final double coefficientY;
    protected final double coefficientWidth;
    protected final double coefficientHeight;
    protected final Color color;

    public DrawingObject(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        this.coefficientX = coefficientX;
        this.coefficientY = coefficientY;
        this.coefficientWidth = coefficientWidth;
        this.coefficientHeight = coefficientHeight;
        this.color = color;
    }

    public DrawingObject(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight)
    {
        this.coefficientX = coefficientX;
        this.coefficientY = coefficientY;
        this.coefficientWidth = coefficientWidth;
        this.coefficientHeight = coefficientHeight;
        color = null;
    }

    public DrawingObject(double coefficientX, double coefficientY, double coefficientHeight)
    {
        this.coefficientX = coefficientX;
        this.coefficientY = coefficientY;
        this.coefficientHeight = coefficientHeight;
        color = null;
        coefficientWidth = 0;
    }

    public DrawingObject(double coefficientX, double coefficientY)
    {
        this.coefficientX = coefficientX;
        this.coefficientY = coefficientY;
        coefficientHeight = 0;
        coefficientWidth = 0;
        color = null;
    }

    public DrawingObject(double coefficientY, double coefficientWidth, double coefficientHeight, Color color)
    {
        this.coefficientX = 0;
        this.coefficientY = coefficientY;
        this.coefficientWidth = coefficientWidth;
        this.coefficientHeight = coefficientHeight;
        this.color = color;
    }

    public abstract void draw(Graphics2D gr, int panelWidth, int panelHeight);
}