package contactDetails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class MainMenu extends JMenuBar {

	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu helpMenu;
	
	
	public MainMenu() {
		
		createMenuBar();
	}
	
	public void createMenuBar(){
		
			//Adding File menu to menubar and its sub-menus.
		fileMenu = new JMenu("File");
		add(fileMenu);
		MenuItem menuItem = new MenuItem("Add Contact");
		fileMenu.add(menuItem);
		menuItem = new MenuItem("Find Contact");
		fileMenu.add(menuItem);
		menuItem = new MenuItem("Exit");
		fileMenu.add(menuItem);
			
			//Adding Edit menu to menubar and its sub-menus.
		editMenu = new JMenu("Edit");
		add(editMenu);
		menuItem = new MenuItem("Update Contact");
		editMenu.add(menuItem);
		menuItem = new MenuItem("Delete Contact");
		editMenu.add(menuItem);
		
			//adding Help menu to menubar and its sub-menus.
		helpMenu = new JMenu("Help");
		add(helpMenu);
		
	}

	private class MenuItem extends JMenuItem implements ActionListener{
		
		public MenuItem(String text){
			super(text);
			addActionListener(this);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if ("Add Contact".equals(e.getActionCommand())){
				for (int i = 0; i <= 5; i++){
					for (int j = 0; j < i; j++){
						System.out.print("Hello"+" ");
					}
					System.out.println();
				}
				System.out.println(e.getActionCommand());
			}
			else if ("Find Contact".equals(e.getActionCommand())){
				System.out.println(e.getActionCommand());
			}
			else if ("Exit".equals(e.getActionCommand())){
				System.out.println("Exiting Contact App...");
				System.exit(0);
			}
			else if ("Update Contact".equals(e.getActionCommand())){
				System.out.println(e.getActionCommand());
			}
			else if ("Delete Contact".equals(e.getActionCommand())){
				System.out.println(e.getActionCommand());
			}
			else if ("Help".equals(e.getActionCommand())){
				System.out.println(e.getActionCommand());
			}
			
		}
		
	}
	
	
}