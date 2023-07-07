package timeflow.app.ui;

import timeflow.format.field.FieldFormatCatalog;

import javax.swing.*;
import java.awt.*;


public class AddFieldPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 6558344894867205L;
	public JTextField name = new JTextField(12);
	public JComboBox<String> typeChoices=new JComboBox<String>();
	public AddFieldPanel()
	{
		for (String choice: FieldFormatCatalog.classNames())
			typeChoices.addItem(choice);
		setLayout(new GridLayout(2,2));
		add(new JLabel("Field Name"));
		add(name);
		add(new JLabel("Field Type"));
		add(typeChoices);
	}
}
