package com.JosiasOberholster;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TheWindow extends JFrame
{
	private JSlider slider;
	private DrawOval myPanel;
	
	public TheWindow()
	{
		super("Oval Slider");
		
		myPanel = new DrawOval();
		myPanel.setBackground(Color.lightGray);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener
		(
				new ChangeListener()
				{
					public void stateChanged(ChangeEvent e)
					{
						myPanel.setD(slider.getValue());
					}
				}
		);
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}
