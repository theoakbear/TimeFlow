package timeflow.model;

import javax.swing.*;

public abstract class ModelPanel extends JPanel implements TFListener {
	
	/**
	 *
	 */
	private static final long serialVersionUID = -2915414205892458812L;
	TFModel model;
	
	public ModelPanel(TFModel model)
	{
		this.model=model;
	}
	
	@Override
	public void addNotify()
	{
		super.addNotify();
		model.addListener(this);
	}
	
	
	@Override
	public void removeNotify()
	{
		super.removeNotify();
		model.removeListener(this);
	}
	
	public TFModel getModel()
	{
		return model;
	}

	@Override
	public abstract void note(TFEvent e);
}
