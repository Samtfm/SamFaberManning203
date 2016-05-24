/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SliderApp;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javax.swing.*;;

/**
 *
 * @author safabermanning
 */
public class SliderApp{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);
        final ArrayList<MoveableShape> shapes = new ArrayList();
        shapes.add(new CarShape(0, 0, CAR_WIDTH));
        shapes.add(new CarShape(0, 100, CAR_WIDTH));
        ShapeIcon icon = new ShapeIcon(shapes,
                ICON_WIDTH, ICON_HEIGHT);
        
        final JLabel label = new JLabel(icon);
        

        
        frame.add(new Slider(1, 10, 5));
        
        //draw stuff
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        

    }
    private static final int ICON_WIDTH = 800;
    private static final int ICON_HEIGHT = 400;
    private static final int CAR_WIDTH = 100;

}
