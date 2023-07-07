package timeflow.app.actions;

import timeflow.app.TimeflowApp;
import timeflow.app.ui.*;

import java.awt.event.*;

public class DateFieldAction extends TimeflowAction {

	/**
	 *
	 */
	private static final long serialVersionUID = -8965730015478068873L;

	public DateFieldAction(TimeflowApp app)
	{
		super(app, "Set Date Fields...", null, "Set date fields corresponding to start, end.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DateFieldPanel.popWindow(app.model);
	}
}
