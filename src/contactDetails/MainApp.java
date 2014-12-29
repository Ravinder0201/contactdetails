package contactDetails;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainApp {



	public static void main(String[] args) {
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new  JFrame("Contact App");
				AddContact ac = new AddContact();
//				FindContact fc = new FindContact();
				MainMenu mainMenu = new MainMenu();
				frame.setSize(400, 280);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);

				frame.setJMenuBar(mainMenu);
				frame.add(ac);
//				frame.add(fc);				
			}
		}; 
		SwingUtilities.invokeLater(run);

	}

}
