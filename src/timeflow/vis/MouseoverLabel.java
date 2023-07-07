package timeflow.vis;

import java.awt.Graphics2D;
import java.util.ArrayList;

import timeflow.model.Display;

public class MouseoverLabel extends Mouseover {

	/**
	 *
	 */
	private static final long serialVersionUID = 5469067403925296487L;
	String label1, label2;
	
	public MouseoverLabel(String label1, String label2, int x, int y, int w, int h) {
		super(label1, x, y, w, h);
		this.label1=label1;
		this.label2=label2;
	}


	public void draw(Graphics2D g, int maxW, int maxH, Display display)
	{
		super.draw(g, maxW, maxH, display);
		ArrayList<String> labels=new ArrayList<String>();
		labels.add(label1);
		labels.add(label2);
		int numLines=1;
		draw(g, maxW, maxH, display, labels, numLines);
	}
}

