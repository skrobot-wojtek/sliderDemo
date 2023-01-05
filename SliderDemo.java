package com.slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame; // global object ?????
    JPanel panel;
    JLabel label;
    JSlider slider;


    SliderDemo() {

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(350, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.BOLD, 20));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("°C "+slider.getValue());
        label.setFont(new Font("MV Boli",Font.BOLD, 25));

        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C "+slider.getValue());
    }
}
