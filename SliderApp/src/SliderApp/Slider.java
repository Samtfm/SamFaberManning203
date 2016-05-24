/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SliderApp;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author safabermanning
 */
public class Slider extends JPanel {
    public Slider(int min,int max,int init){
        MIN_SCALE = min;
        MAX_SCALE = max;
        INIT_SCALE = init;
        slider = new JSlider(JSlider.VERTICAL,
                MIN_SCALE, MAX_SCALE, INIT_SCALE);
        slider.addChangeListener(new SliderListener());
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider);
       
    }
        //Slider
    public int getValue(){
         return(slider.getValue());
    }
    
        

        
        private JSlider slider;
        private final int MIN_SCALE;
        private final int MAX_SCALE;
        private final int INIT_SCALE;
    
}
