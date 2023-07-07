package timeflow.app.actions;

import timeflow.model.*;
import timeflow.app.*;

import javax.swing.*;

import java.awt.Toolkit;

public abstract class TimeflowAction extends AbstractAction {
	/**
	 *
	 */
	private static final long serialVersionUID = -1618259466434852664L;
	TimeflowApp app;

    public TimeflowAction(TimeflowApp app, String text, ImageIcon icon, String desc) 
    {
		super(text, icon);
		this.app=app;
		putValue(SHORT_DESCRIPTION, desc);
	}
    
	
	protected void accelerate(char c)
	{
		putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(c,
			    Toolkit.getDefaultToolkit(  ).getMenuShortcutKeyMaskEx(  ), false));
	}


    protected TFModel getModel()
    {
    	return app.model;
    }
    

}
