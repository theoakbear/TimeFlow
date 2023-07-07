package timeflow.util;

import java.awt.*;
import javax.swing.*;

public class Pad extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = -2719907987451385649L;
	Dimension pref;
	
	public Pad(int w, int h)
	{
		pref=new Dimension(w,h);
		setBackground(Color.white);
	}
	
	public Dimension getPreferredSize()
	{
		return pref;
	}
}
