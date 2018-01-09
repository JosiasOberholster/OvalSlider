package com.JosiasOberholster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SLOvalSlider extends JFrame
{
	private JSlider slider;
	private DrawOval myPanel;
	
	public static void main(String[] args)
	{
		TheWindow w = new TheWindow();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
		w.setSize(230, 280);
	}
	
	public void TheWindow()
	{		
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

	public class DrawOval extends JPanel
	{
		private int d = 10;
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.fillOval(10, 10, d, d);
		}
		
		public void setD(int newD)
		{
			d = (newD >= 0? newD: 10);
			repaint();
		}
		
		public Dimension getPrefferedSize()
		{
			return new Dimension(200, 200);
		}
		
		public Dimension setMinimum()
		{
			return getPrefferedSize();
		}
	}
}