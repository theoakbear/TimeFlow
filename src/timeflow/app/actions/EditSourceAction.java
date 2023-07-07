package timeflow.app.actions;

import timeflow.model.*;
import timeflow.app.TimeflowApp;

import java.awt.event.*;
import javax.swing.*;


public class EditSourceAction extends TimeflowAction {

	/**
	 *
	 */
	private static final long serialVersionUID = 7790356224730809967L;

	public EditSourceAction(TimeflowApp app)
	{
		super(app, "Edit Source/Credit Line...", null, "Edit credit line for this database");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TFModel model=getModel();
		String source = (String)JOptionPane.showInputDialog(
                app,
                null,
                "Edit Source/Credit Line",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                model.getDB().getSource());

		if (source!=null) {
		model.getDB().setSource(source);
		model.noteNewSource(this);
		return;
		}
	}

}
