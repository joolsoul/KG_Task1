package ru.vsu.kudinov_i_m.view;

import ru.vsu.kudinov_i_m.scenery.*;
import ru.vsu.kudinov_i_m.scenery.Background;
import ru.vsu.kudinov_i_m.scenery.camp.Camp;
import ru.vsu.kudinov_i_m.util.RandomUtil;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel
{
    private final World world;

    public MainPanel()
    {
        this.world = new World(0, 0, 1, 1, Color.WHITE);

        world.getObjects().add(new Background(0, 0, 1, 1));

        world.getObjects().add(new Mountains(0.5, 0.7, 0.4,0.6, new Color(0xF7FBFC)));
        world.getObjects().add(new Mountains(-0.2, 0.7, 0.6,0.6, new Color(0xF7FBFC)));

        world.getObjects().add(new Forest(0, 0.7));

        world.getObjects().add(new Ice(0, 0.73,1, 0.27, Color.WHITE));

        world.getObjects().add(new Sun(RandomUtil.randDouble(0, 0.9), 0.05, 0.09, 0.09, new Color(0xFFEA91)));

        world.getObjects().add(new Camp(RandomUtil.randDouble(0, 0.18), 0.7, RandomUtil.randDouble(0.2, 0.3), RandomUtil.randDouble(0.25, 0.35)));
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D gr2d = (Graphics2D) g;
        super.paint(g);

        this.world.draw(gr2d, this.getWidth(), this.getHeight());
    }
}
