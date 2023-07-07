package timeflow.app.actions;

import timeflow.app.TimeflowApp;
import timeflow.data.db.*;

import java.awt.event.*;

public class NewDataAction extends TimeflowAction {

	/**
	 *
	 */
	private static final long serialVersionUID = -2517602750171683936L;

	public NewDataAction(TimeflowApp app)
	{
		super(app, "New", null, "Create a new, blank database");
		accelerate('N');

	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (app.checkSaveStatus())
			getModel().setDB(new BasicDB("Unspecified"), "[new data]", true, this);
	}
}
