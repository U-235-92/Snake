package de.snake.util;

import java.awt.Color;
import java.awt.Graphics;

public class BigFeed extends Feed {

	public BigFeed(int x, int y, Randomiser randomiser) {
		super(x, y, randomiser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		if(randomiser.isBigFeed()) {
			
			g.setColor(Color.YELLOW);
			g.fillOval(x, y, 20, 20);
		}
	}

}
