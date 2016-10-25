package highSeas;

import java.awt.Image;
import java.awt.Rectangle;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Boat {

	String right = "aliencraft-right.png";
	String left = "aliencraft-left.png";
	String up = "aliencraft-up.png";
	String down = "aliencraft-down.png";
	String background = "life-and-the-universe.png";
	
	private boolean visible;
	private ArrayList missiles;
	
	int x2;
	int y2;
	int uy2;
	int dy2;
	int rx2;
	int lx2;
	
	int rx;
	int lx;
	int uy;
	int dy;
	int x;
	int y;
	int dir;
	int width;
	int height;
	
	Image Iright;
	Image Ileft;
	Image Iup;
	Image Idown;
	Image Iocean;
	
	
	public Boat(){
		visible = true;
		x= -439;
		y= -173;
		x2 = 600;
		y2 = 450;
		width=263;
		height=130;
		dir = 1;
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(right));
		Iright = ii.getImage();
		
		ImageIcon ii2 = new ImageIcon(this.getClass().getResource(up));
		Iup = ii2.getImage();
		
		ImageIcon ii4 = new ImageIcon(this.getClass().getResource(down));
		Idown = ii4.getImage();
	
	    ImageIcon ii3 = new ImageIcon(this.getClass().getResource(left));
	    Ileft = ii3.getImage();
	
	    ImageIcon ii5 = new ImageIcon(this.getClass().getResource(background));
		Iocean = ii5.getImage();
	}
	
	
	public void Move(){
		
		//limit left movement
		if(x>= 0){
			
			lx = 0;
		// limit left movement further
			if(x2 <= 0){
				lx2 = 0;
			}
			//limit right movement further
			if(x2 >= 1200){
				rx2 = 0;
			}
			//limit up movement further
			if(y2 <= 0){
				uy2 = 0;
			}
			//limit down movement further
			if(y2 >= 880){
				dy2 = 0;
			}
			
			
		x2 += rx2;
		x2 += lx2;
		y2 += uy2;
		y2 += dy2;
		
		
		
		}
		
		
		
		
		
		//limit right movement
		if(x <= -980){
			rx = 0;
			
			// limit left movement further
						if(x2 <= 0){
							lx2 = 0;
						}
						//limit right movement further
						if(x2 >= 1200){
							rx2 = 0;
						}
						//limit up movement further
						if(y2 <= 0){
							uy2 = 0;
						}
						//limit down movement further
						if(y2 >= 880){
							dy2 = 0;
						}
						
						
					x2 += rx2;
					x2 += lx2;
					y2 += uy2;
					y2 += dy2;
		}
		
		
		//limit up movement
		if(y >= 0){
			uy = 0;
			
			// limit left movement further
						if(x2 <= 0){
							lx2 = 0;
						}
						//limit right movement further
						if(x2 >= 1200){
							rx2 = 0;
						}
						//limit up movement further
						if(y2 <= 0){
							uy2 = 0;
						}
						//limit down movement further
						if(y2 >= 880){
							dy2 = 0;
						}
						
						
					x2 += rx2;
					x2 += lx2;
					y2 += uy2;
					y2 += dy2;
		}
		
		
		//limit down movement
		if(y <= -560){
			dy = 0;
			
			// limit left movement further
						if(x2 <= 0){
							lx2 = 0;
						}
						//limit right movement further
						if(x2 >= 1200){
							rx2 = 0;
						}
						//limit up movement further
						if(y2 <= 0){
							uy2 = 0;
						}
						//limit down movement further
						if(y2 >= 880){
							dy2 = 0;
						}
						
						
					x2 += rx2;
					x2 += lx2;
					y2 += uy2;
					y2 += dy2;
		}
		
		
		x+= rx;
		x+=lx;
		y+= dy;
		y+= uy;
		
		
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_SPACE) {
            fire();
        }
		
		if(key == KeyEvent.VK_LEFT){
			lx = 2;
			lx2 = -2;
			dir = 2;
		}
		
		if(key == KeyEvent.VK_RIGHT){
			rx = -2;
			rx2 = 2;
			dir = 1;
		}
		
		if(key == KeyEvent.VK_UP){
			uy = 2;
			uy2 = -2;
			dir = 3;
		}
		
		if(key == KeyEvent.VK_DOWN){
			dy = -2;
			dy2 = 2;
			dir = 4;
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT){
			lx = 0;
			lx2 = 0;
		}
		
		if(key == KeyEvent.VK_RIGHT){
			rx = 0;
			rx2 = 0;
		}
		
		if(key == KeyEvent.VK_UP){
			uy = 0;
			uy2 = 0;
		}
		
		if(key == KeyEvent.VK_DOWN){
			dy = 0;
			dy2 = 0;
		}
	}
	
	public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int getX2(){
    	return x2;
    }
    public int getY2(){
    	return y2;
    }

    public Image getImageR() {
        return Iright;
    }
    public Image getImageL(){
    	return Ileft;
    }
    
    public Image getImageU(){
    	return Iup;
    }
    
    public Image getImageD(){
    	return Idown;
    }
    
    public Image getOcean(){
    	return Iocean;
    }
   
    public int getDir(){
    	return dir;
    }
    public Rectangle bounds(){
    	return(new Rectangle(x,y,width,height));
    }
    public ArrayList getMissiles() {
        return missiles;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
    public void fire() {
        missiles.add(new GreenPlasma(x + width, y + height/2));
    }
}
