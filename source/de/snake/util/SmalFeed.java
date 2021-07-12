package de.snake.util;

import java.awt.Color;
import java.awt.Graphics;

public class SmalFeed extends Feed {
	
	public SmalFeed(int x, int y, Randomiser randomiser) {
		super(x, y, randomiser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, 10, 10);
	}
}
