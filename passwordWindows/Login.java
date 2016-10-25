package passwordWindows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login implements ActionListener {

	String truePassword = "Cheese25";
	String trueUsername = "Yellowmooseman";
	
	boolean login = false;
	
	JFrame frame = new JFrame("Client");
	JFrame game = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton accept = new JButton("Accept");
	JTextField username = new JTextField("Username");
	JTextField password = new JTextField("Password");
	
	private void addMenu(JFrame frame){
		JMenu file = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		file.add(exitItem);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file);
		frame.setJMenuBar(menuBar);
		}
	
	public void paint(Graphics g) {
        panel1.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		if(login){
			g2d.drawString("Welcome", 110, 300);
		}
	}
	
	private void arrangeComponents(JFrame frame){
		panel1.setLayout(null);
		username.setBounds(110, 50, 150, 20);
		password.setBounds(110, 100, 150, 20);
		accept.setBounds(140, 150, 75, 30);
		accept.addActionListener(this);
		panel1.add(username);
		panel1.add(password);
        panel1.add(accept);
        panel1.setBackground(Color.CYAN);
        frame.add(panel1);
        

	}
	
	private void createGui(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,400));
		addMenu(frame);
		arrangeComponents(frame);
		frame.pack();
		frame.setVisible(true);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(false);
		game.setSize(1000,1000);
	}
	
	public static void main(String[] args) {
		Login log = new Login();
		log.createGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getActionCommand().equals("Exit")){
			System.exit(0);
		}
		if(e.getActionCommand().equals("Accept")){
			if((username.getText().equals(trueUsername))&&(password.getText().equals(truePassword))){
				
			frame.setVisible(false);
			game.setVisible(true);
			}
		}
		
	}

}
