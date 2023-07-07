package timeflow.app.ui.filter;

import timeflow.data.db.filter.ActFilter;

import javax.swing.*;

public abstract class FilterDefinitionPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 8976774421375724421L;

	public abstract ActFilter defineFilter();
	public abstract void clearFilter();
}
