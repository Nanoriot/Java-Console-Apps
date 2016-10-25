package highSeas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Map extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private ArrayList Orange;
	Timer timer;
	Boat boat;
	TAdapter t;
	
	boolean ingame;
	boolean collision = false;
	
	private int[][] pos = {
			{500,500}, {300,300}
	};
	
	public Map(){
		
        addKeyListener(new TAdapter());
		setFocusable(true);
        setBackground(Color.BLUE);
        setDoubleBuffered(true);
        ingame = true;
        
        boat = new Boat();
        t = new TAdapter();
        
        initOrange();
        
        timer = new Timer(5,this);
        timer.start();
	}
	
	 public void paint(Graphics g) {
	        super.paint(g);

	        Graphics2D g2d = (Graphics2D)g;
	       
	        
	        g2d.drawImage(boat.getOcean(),boat.getX(),boat.getY(),this);
	       
	       if(collision){
	    	   g2d.drawString("Warning!!!", 100, 100);
	       }
	       if(boat.getDir() == 1){
	        	g2d.drawImage(boat.getImageR(),boat.getX2(),boat.getY2(),this);
	       }
	       if(boat.getDir() == 2){
	        	g2d.drawImage(boat.getImageL(),boat.getX2(),boat.getY2(),this);
	       }
	       if(boat.getDir() == 3){
	        	g2d.drawImage(boat.getImageU(),boat.getX2(),boat.getY2(),this);
	       }
	       if(boat.getDir() == 4){
	        	g2d.drawImage(boat.getImageD(),boat.getX2(),boat.getY2(),this);
	       }
	       ArrayList pm = boat.getMissiles();

           for (int i = 0; i < pm.size(); i++) {
               GreenPlasma p = (GreenPlasma)pm.get(i);
               g2d.drawImage(p.getImage(), p.getX(), p.getY(), this);
           }

           for (int i = 0; i < Orange.size(); i++) {
               Orange a = (Orange)Orange.get(i);
               if (a.isVisible())
                   g2d.drawImage(a.getImage(), a.getX(), a.getY(), this);
           }
	       
	        	
	       
	        
	     
	        g2d.drawString(boat.getX()+ " " + boat.getY(), 3, 10);
	        g2d.drawString("Yellowmoose STD. @ Yellowmoose.com", 3, 20);
	        g2d.drawString("All Rights Reserved - Purchase Required", 3, 30);

	        Toolkit.getDefaultToolkit().sync();
	        g.dispose();
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		boat.Move();
		repaint();
		
	}
	
	
	
	private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            boat.keyReleased(e);
            
        }
       
        

        public void keyPressed(KeyEvent e) {
            boat.keyPressed(e);
        }
    }
	
	public void initOrange() {
        Orange = new ArrayList();

        for (int i=0; i<pos.length; i++ ) {
            Orange.add(new Orange(pos[i][0], pos[i][1]));
        }
    }

	
}
