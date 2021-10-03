package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Forest extends DrawingObject
{
    private List<Tree> forest = new LinkedList<>();

    public Forest(double coefficientX, double coefficientY)
    {
        super(coefficientX, coefficientY);

    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        forest.add(new Tree(coefficientX - 0.04, coefficientY, 0.195, 0.43, new Color(0x568481)));
        forest.add(new Tree(coefficientX + 0.05, coefficientY, 0.175, 0.42, new Color(0x77AAA5)));
        forest.add(new Tree(coefficientX + 0.12, coefficientY, 0.13, 0.35, new Color(0x2E5655)));
        forest.add(new Tree(coefficientX + 0.18, coefficientY, 0.2, 0.51, new Color(0x588986)));
        forest.add(new Tree(coefficientX + 0.34, coefficientY, 0.17, 0.45, new Color(0x5A8784)));
        forest.add(new Tree(coefficientX + 0.28, coefficientY, 0.175, 0.42, new Color(0x244C4C)));
        forest.add(new Tree(coefficientX + 0.38, coefficientY, 0.19, 0.47, new Color(0x77AAA5)));
        forest.add(new Tree(coefficientX + 0.51, coefficientY, 0.175, 0.42, new Color(0x568481)));
        forest.add(new Tree(coefficientX + 0.485, coefficientY, 0.12, 0.33, new Color(0x2E5655)));
        forest.add(new Tree(coefficientX + 0.65, coefficientY, 0.2, 0.42, new Color(0x77AAA5)));
        forest.add(new Tree(coefficientX + 0.58, coefficientY, 0.2, 0.51, new Color(0x386664)));
        forest.add(new Tree(coefficientX + 0.72, coefficientY, 0.2, 0.5, new Color(0x568481)));
        forest.add(new Tree(coefficientX + 0.795, coefficientY, 0.21, 0.47, new Color(0x77AAA5)));
        forest.add(new Tree(coefficientX + 0.8, coefficientY, 0.19, 0.4, new Color(0x244E4D)));
        forest.add(new Tree(coefficientX + 0.87, coefficientY, 0.25, 0.5, new Color(0x568481)));

        for(Tree tree : forest)
        {
            tree.draw(gr, panelWidth, panelHeight);
        }
    }
}
