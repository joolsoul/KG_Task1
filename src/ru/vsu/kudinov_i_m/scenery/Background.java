package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithColor;
import static ru.vsu.kudinov_i_m.util.DrawUtil.drawWithGradient;

public class Background extends DrawingObject
{
    public Background(double coefficientX, double coefficientY, double coefficientWidth, double coefficientHeight)
    {
        super(coefficientX, coefficientY, coefficientWidth, coefficientHeight);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        GradientPaint backgroundGradientColor = new GradientPaint
                (
                (int) (0.5 * panelWidth), (int) (coefficientY * panelHeight), new Color(204, 233, 239, 255),
                (int) (coefficientWidth * panelWidth), (int) (coefficientHeight * panelHeight), new Color(234, 149, 124, 136));

        drawWithGradient(gr, backgroundGradientColor, () -> {
            gr.fillRect(
                    (int) (coefficientX * panelWidth),
                    (int) (coefficientY * panelHeight),
                    (int) (coefficientWidth * panelWidth),
                    (int) (coefficientHeight * panelHeight)
            );
        });

        GradientPaint iceGradientColor = new GradientPaint
                (
                        (int) (0.5 * panelWidth), (int) (coefficientY * panelHeight), new Color(95, 144, 149, 255),
                        (int) (coefficientWidth * panelWidth), (int) (coefficientHeight * panelHeight), new Color(100, 151, 155, 255));

        drawWithGradient(gr, iceGradientColor, () -> {
            gr.fillRect(
                    (int) (coefficientX * panelWidth),
                    (int) ((coefficientY + 0.7) * panelHeight),
                    (int) (coefficientWidth * panelWidth),
                    (int) (coefficientHeight * panelHeight)
            );
        });

        Color iceColor = new Color(0xDEF1F8);
        drawWithColor(gr, iceColor, () -> {
            gr.fillRect(
                    (int) (coefficientX * panelWidth),
                    (int) ((coefficientY + 0.7) * panelHeight),
                    (int) (coefficientWidth * panelWidth),
                    (int) ((coefficientHeight - 0.98) * panelHeight)
            );
        });
    }
}
