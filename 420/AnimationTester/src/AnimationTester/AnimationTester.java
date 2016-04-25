package AnimationTester;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This program implements an animation that moves a car shape.
 */
public class AnimationTester {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);
        final ArrayList<MoveableShape> shapes = new ArrayList();
        shapes.add(new CarShape(0, 0, CAR_WIDTH));
        shapes.add(new CarShape(50, 50, CAR_WIDTH));
        shapes.add(new CarShape(200, 50, CAR_WIDTH));
        ShapeIcon icon = new ShapeIcon(shapes,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < shapes.size(); i++) {
                    shapes.get(i).translate(1, 0);
                }
                label.repaint();
            }
        });
        t.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;
}
