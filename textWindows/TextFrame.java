package textWindows;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFrame implements ActionListener {

	
	String name = "Unknown";
	boolean loop = true;
	JFrame frame = new JFrame("Welcome ");
	JPanel panel = new JPanel();
	JLabel sayLabel = new JLabel("Shout it OUT!");
	JButton sayButton = new JButton("'shout'");
	JTextArea sayArea = new JTextArea();
	
	private void addMenu(JFrame frame){
	JMenu file = new JMenu("File");
	JMenuItem exitItem = new JMenuItem("Exit");
	exitItem.addActionListener(this);
	file.add(exitItem);
	JMenuBar menuBar = new JMenuBar();
	menuBar.add(file);
	frame.setJMenuBar(menuBar);
	}
	
	private void showGui(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,400));
		addMenu(frame);
		arrangeComponents(frame);
		frame.pack();
		frame.setVisible(true);
	}
	
	private void arrangeComponents(JFrame frame){
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		sayArea.setPreferredSize(new Dimension(200,50));
		sayButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		sayLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		sayArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		sayButton.addActionListener(this);
		panel.add(sayLabel);
		panel.add(sayArea);
		panel.add(sayButton);
		frame.add(panel);

	}
	
	
	public static void main(String[] args) {
		TextFrame textframe = new TextFrame();
		textframe.showGui();
		}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Exit")){
			System.exit(0);
		}
		if(e.getActionCommand().equals("'shout'")){
			System.out.println(sayArea.getText());
			sayArea.removeAll();
	}
	}
}





























