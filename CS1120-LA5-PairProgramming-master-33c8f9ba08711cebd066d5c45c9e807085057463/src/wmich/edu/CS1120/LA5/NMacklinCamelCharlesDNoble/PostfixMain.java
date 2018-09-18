package wmich.edu.CS1120.LA5.NMacklinCamelCharlesDNoble;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PostfixMain extends JFrame{
	//Private fields containing: messageLabel (JLabel), panel (JPanel), button1 
	//(JButton), button2 (JButton), button3 (JButton), WINDOW_HEIGHT (final int), 
	//WINDOW_WIDTH (final int)
	private JLabel messageLabel;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private final int WINDOW_HEIGHT = 200;
	private final int WINDOW_WIDTH = 350;
	
	/**
	 * sets the title 
	 * set the size of the window 
	 * allows the window to be closed when the 'X' is clicked
	 * calls the build panel method
	 * add the panel to the window
	 * set the GUI to appear in the middle of the screen
	 * sets visible to true 
	 */
	//Constructor PostfixMain:
	public PostfixMain() {
		//sets the title 
		setTitle("PostFix Expressions");
		//set the window size
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		//sets the default close operation as an exit on close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//builds the panel
		buildPanel();
		//adds the panel to the window
		add(panel);
		//sets the GUI to appear in the middle of the screen
		setLocationRelativeTo(null);
		//sets visible to true
		setVisible(true);
	}//end of PostfixMain constructor
	
	/**
	 *builds the panel, to later add to the window
	 */
	//Method buildPanel: builds the panel, to later add to the window
	private void buildPanel() {
		//create a Decoder object
		Decoder call = new Decoder();
		panel = new JPanel();
		//builds the panel with labels for the top of the window and the three 
		//buttons.
		messageLabel = new JLabel("Click a button to selct a file to process.");
		button1 = new JButton("Process Expression1.dat");
		button2 = new JButton("Process Expression2.dat");
		button3 = new JButton("Process Expression3.dat");
		//creates action listeners to create functionality when each button is 
		//clicked.	
		//Within the button actionListener classes created, will be an if statement 
		//that determines whether the button that was clicked equals the name of 
		//the button, if any of the three buttons were clicked, then the decoder 
		//object will be used to call the processExpressions method in the Decoder 
		//class and then send the corresponding name of file
		button1.addActionListener(new ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {
		    	if(e.getActionCommand().equals("Process Expression1.dat")){
		    		   call.processExpressions("Expression1.dat");
		    		}
		    }
		});
		button2.addActionListener(new ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {
		    	if(e.getActionCommand().equals("Process Expression2.dat")){
		    		   call.processExpressions("Expression2.dat");
		    		}
		    }
		});
		button3.addActionListener(new ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {
		    	if(e.getActionCommand().equals("Process Expression3.dat")){
		    		   call.processExpressions("Expression3.dat");
		    		}
		    }
		});
		//adds colors to the window and adds the labels and buttons to the panel
		panel.add(messageLabel).setForeground(Color.BLACK);
		panel.setBackground(Color.CYAN);
		button1.setForeground(Color.WHITE);
		button2.setForeground(Color.WHITE);
		button3.setForeground(Color.WHITE);
		panel.add(button1).setBackground(Color.BLUE);
		panel.add(button2).setBackground(Color.BLUE);
		panel.add(button3).setBackground(Color.BLUE);
	}//end of buildPanel method
	
	/**
	 * Calls the PostfixMain class to test the program
	 * @param args
	 */
	//Method main: Call the PostfixMain class to test the program
	public static void main(String[] args) {
		new PostfixMain();
	}//end of main method	
}//end of PostfixMain class

