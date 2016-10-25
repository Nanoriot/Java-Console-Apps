package colorCube;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JPanel p;
	JPanel m;
	JPanel n;
	JPanel x;
	
	JPanel a;
	JPanel b;
	JPanel c;
	JPanel d;
	
	JPanel y;
	
	public View(){
		
		setLayout(null);
		
		p = new JPanel();
		m = new JPanel();
		n = new JPanel();
		x = new JPanel();
		
		a = new JPanel();
		b = new JPanel();
		c = new JPanel();
		d = new JPanel();
		
		y = new JPanel();
		
		// out position - down position - length - width
		
		p.setBounds(0,0,300,300);
		m.setBounds(301,0,300,300);
		n.setBounds(601,151,300,300);
		x.setBounds(0,301,300,300);
		
		a.setBounds(300,301,300,300);
		b.setBounds(600,301,300,300);
		c.setBounds(0,601,300,300);
		d.setBounds(301,601,300,300);
		
		y.setBounds(601,601,300,300);
		
		add(x);
		add(a);
		add(b);
		
		
		
		
		p.addMouseListener(new Handler4());
		m.addMouseListener(new Handler4());
		n.addMouseListener(new Handler4());
		x.addMouseListener(new Handler4());
		a.addMouseListener(new Handler4());
		b.addMouseListener(new Handler4());
		c.addMouseListener(new Handler4());
		d.addMouseListener(new Handler4());
		y.addMouseListener(new Handler4());


	}

	

private class Handler4 implements MouseListener{

	
	public void mouseClicked(MouseEvent e) {
		
	}

	
	public void mouseEntered(MouseEvent event) {
		
		// x event
		Random r = new Random();
		int ran = r.nextInt(7);
		switch (ran) {
		case 0:
			x.setBackground(Color.YELLOW);
			break;
		case 1:
			x.setBackground(Color.BLUE);
			break;
		case 2:
			x.setBackground(Color.GREEN);
			break;
		case 3:
			x.setBackground(Color.PINK);
			break;
		case 4:
			x.setBackground(Color.CYAN);
			break;
		case 5:
			x.setBackground(Color.ORANGE);
			break;
		case 6:
			x.setBackground(Color.MAGENTA);
			break;
		case 7:
			x.setBackground(Color.RED);
		}
		
		
		// a event	
		Random r2 = new Random();
		int ran2 = r2.nextInt(7);
		switch (ran2) {
		case 0:
			a.setBackground(Color.YELLOW);
			break;
		case 1:
			a.setBackground(Color.BLUE);
			break;
		case 2:
			a.setBackground(Color.GREEN);
			break;
		case 3:
			a.setBackground(Color.PINK);
			break;
		case 4:
			a.setBackground(Color.CYAN);
			break;
		case 5:
			a.setBackground(Color.ORANGE);
			break;
		case 6:
			a.setBackground(Color.MAGENTA);
			break;
		case 7:
			a.setBackground(Color.RED);
		}
		
		// b event
		Random r3 = new Random();
		int ran3 = r3.nextInt(7);
		switch (ran3) {
		case 0:
			b.setBackground(Color.YELLOW);
			break;
		case 1:
			b.setBackground(Color.BLUE);
			break;
		case 2:
			b.setBackground(Color.GREEN);
			break;
		case 3:
			b.setBackground(Color.PINK);
			break;
		case 4:
			b.setBackground(Color.CYAN);
			break;
		case 5:
			b.setBackground(Color.ORANGE);
			break;
		case 6:
			b.setBackground(Color.MAGENTA);
			break;
		case 7:
			b.setBackground(Color.RED);
		}
		
		

	}

	
	public void mouseExited(MouseEvent event) {
		
		// x event
		Random r = new Random();
		int ran = r.nextInt(7);
		switch (ran) {
		case 0:
			x.setBackground(Color.YELLOW);
			break;
		case 1:
			x.setBackground(Color.BLUE);
			break;
		case 2:
			x.setBackground(Color.GREEN);
			break;
		case 3:
			x.setBackground(Color.PINK);
			break;
		case 4:
			x.setBackground(Color.CYAN);
			break;
		case 5:
			x.setBackground(Color.ORANGE);
			break;
		case 6:
			x.setBackground(Color.MAGENTA);
			break;
		case 7:
			x.setBackground(Color.RED);
		}
		
		// a event
		Random r2 = new Random();
		int ran2 = r2.nextInt(7);
		switch (ran2) {
		case 0:
			a.setBackground(Color.YELLOW);
			break;
		case 1:
			a.setBackground(Color.BLUE);
			break;
		case 2:
			a.setBackground(Color.GREEN);
			break;
		case 3:
			a.setBackground(Color.PINK);
			break;
		case 4:
			a.setBackground(Color.CYAN);
			break;
		case 5:
			a.setBackground(Color.ORANGE);
			break;
		case 6:
			a.setBackground(Color.MAGENTA);
			break;
		case 7:
			a.setBackground(Color.RED);
		}
		
		// b event
		Random r3 = new Random();
		int ran3 = r3.nextInt(7);
		switch (ran3) {
		case 0:
			b.setBackground(Color.YELLOW);
			break;
		case 1:
			b.setBackground(Color.BLUE);
			break;
		case 2:
			b.setBackground(Color.GREEN);
			break;
		case 3:
			b.setBackground(Color.PINK);
			break;
		case 4:
			b.setBackground(Color.CYAN);
			break;
		case 5:
			b.setBackground(Color.ORANGE);
			break;
		case 6:
			b.setBackground(Color.MAGENTA);
			break;
		case 7:
			b.setBackground(Color.RED);
		}
	

	}

	
	public void mousePressed(MouseEvent e) {
		
	}

	
	public void mouseReleased(MouseEvent e) {
		
	}
	
}
	
}
