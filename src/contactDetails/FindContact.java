package contactDetails;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FindContact extends JPanel {
	
	private JLabel nameLabel;
	private JTextField nameField;

	public FindContact() {
		setLayout(new BorderLayout());
		nameLabel = new JLabel("Search by Name");
		nameField = new JTextField();
		
		add(nameLabel, BorderLayout.NORTH);
		add(nameField, BorderLayout.SOUTH);
	}
	
}
