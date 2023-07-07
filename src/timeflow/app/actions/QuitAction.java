package timeflow.app.actions;

import timeflow.model.*;
import timeflow.app.TimeflowApp;

import java.awt.event.*;

public class QuitAction extends TimeflowAction {

	/**
	 *
	 */
	private static final long serialVersionUID = 8255953180052170268L;

	public QuitAction(TimeflowApp app, TFModel model)
	{
		super(app, "Quit", null, "Quit the program");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		quit();
	}
	
	public void quit()
	{
		if (app.checkSaveStatus())
		{
			System.exit(0);
		}
	}
}
