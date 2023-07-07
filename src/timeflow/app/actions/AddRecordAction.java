package timeflow.app.actions;

import timeflow.app.TimeflowApp;
import timeflow.app.ui.*;

import java.awt.event.*;

public class AddRecordAction extends TimeflowAction {

	/**
	 *
	 */
	private static final long serialVersionUID = -7268697057238588540L;

	public AddRecordAction(TimeflowApp app)
	{
		super(app, "Add Record...", null, "Add a record to this database");
		accelerate('A');
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		EditRecordPanel.add(getModel());
	}
}
