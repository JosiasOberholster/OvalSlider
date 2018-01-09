package com.JosiasOberholster;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

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
