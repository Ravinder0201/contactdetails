package contactDetails;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import database.Database;

@SuppressWarnings("serial")
public class AddContact extends JPanel {

	public JLabel nameLabel;
	private JLabel mobileLabel;
	private JLabel addressLabel;
	private JLabel emailLabel;
	
	private JTextField nameTextField;
	private JTextField mobileTextField;
	private JTextArea addressTextArea;
	private JTextField emailTextField;

	private JButton submitButton;
	private JButton cancelButton;
	
	private String nameString;
	private String mobileString;
	private String addressString;
	private String emailString;

	private char[] mob;
	
	public AddContact() {
		nameLabel = new JLabel("Name:");
		mobileLabel = new JLabel("Mobile No:");
		addressLabel = new JLabel("Address:");
		emailLabel = new JLabel("Email:");
	
		nameTextField = new JTextField(20);
		mobileTextField = new JTextField(20);
		addressTextArea = new JTextArea(4,2);
		emailTextField = new JTextField(20);
		
		submitButton = new JButton("Submit");
		cancelButton = new JButton("Cancel");
		
		
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Exiting Contact App...");
				System.exit(0);
			}
		});
		
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					onSubmitBtn();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});

		setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.insets = new Insets(0, 5, 5, 0);
		gc.fill = GridBagConstraints.BOTH;
		
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.insets = new Insets(0, 5, 5, 0);
		add(nameTextField, gc);
		
		gc.gridy=1;
		gc.gridx = 0;
		add(mobileLabel, gc);
		
		gc.gridx = 1;
		gc.insets = new Insets(5, 5, 5, 0);
		add(mobileTextField, gc);
		
		gc.gridy = 2;
		gc.gridx = 0;
		add(addressLabel, gc);
		
		gc.gridx = 1;
		add(addressTextArea, gc);
		
		gc.gridy = 3;
		gc.gridx = 0;
		gc.insets = new Insets(5, 5, 5, 0);
		add(emailLabel, gc);
		
		gc.gridx = 1;
		add(emailTextField, gc);
		
		gc.gridy = 4;
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(5, 5, 0, 5);
		add(cancelButton, gc);
		//cancelButton.setPreferredSize(new Dimension(50, 20));
		
		gc.gridx = 1;
		gc.insets = new Insets(5, 5, 0, 0);
		add(submitButton, gc);
		//submitButton.setPreferredSize(new Dimension(50, 20));
		
	} 
	

	public String getNameString() {
		nameString = nameTextField.getText();
		setNameString(nameString);
		//System.out.println(nameStr);
		return nameString;
	}


	public void setNameString(String nameString) {
		//System.out.println(nameStr);
		this.nameString = nameString;
	}

	
	public String getEmailString() {
		emailString = emailTextField.getText();
		setEmailString(emailString);
		return emailString;
	}


	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public char[] getMobileString() {
		mobileString = mobileTextField.getText();
		mob = mobileString.toCharArray();
		setMobileString(mob);
		return mob;
	}


	public void setMobileString(char[] mob) {
		if (((mob.length)<10)||((mob.length)>10)){
			System.out.println("Enter valid number");
		}
		else{
			System.out.println(mob);
		}
		this.mob = mob;
	}


	public String getAddressString() {
		addressString = addressTextArea.getText();
		setAddressString(addressString);
		return addressString;
	}


	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}


	public void onSubmitBtn() throws Exception
	{
		Database db = new Database();
		try {
		db.connect();
		}catch (Exception e){
			System.out.println("Cannot close");
		}
		db.insertData();
		db.disConnect();
		System.out.println();
		getMobileString();
	}
	

}