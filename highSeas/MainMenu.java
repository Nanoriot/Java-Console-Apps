package highSeas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainMenu extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton start;
	private JLabel title;
	private JButton quit;
	
	private String galaxy = "Galaxy.jpg";
	private Image image;
	Game g;
	
	
	
	
	public MainMenu(){
		start = new JButton("Start");
		title = new JLabel("Star Hunter");
		quit = new JButton("Quit");
		arrangeItems();
		
		
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(galaxy));
		image = ii.getImage();
		
	}
	private void arrangeItems(){
		setLayout(null);
		start.setBounds(600, 400, 75, 30);
		quit.setBounds(600, 450, 75, 30);
		title.setBounds(600,350,100,30);
		add(start);
		add(quit);
		add(title);
		start.addActionListener(this);
		quit.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals("Quit")){
		System.exit(0);
		}
		
		
	}
	 public void paint(Graphics g) {
	        super.paint(g);

	        Graphics2D g2d = (Graphics2D)g;
	        g2d.drawImage(image, -300, 0, this);
	 }
	
	

}
