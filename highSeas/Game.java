package highSeas;

import javax.swing.JFrame;

public class Game extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Game(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(1280,970);
		setTitle("Star Hunter"); 
		add(new Map());
		super.setLocation(600, 600);
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setVisible(true);
	}
	
	}


	
	
	


