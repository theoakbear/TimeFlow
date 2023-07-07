package timeflow.views;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import timeflow.app.ui.HtmlDisplay;

public class HtmlControls extends JPanel {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 2573848149122235471L;

	public HtmlControls(String text)
	{
		JEditorPane html=HtmlDisplay.create();
		html.setText(text);
		setBackground(Color.white);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		setLayout(new GridLayout(1,1));
		add(html);
	}
}
