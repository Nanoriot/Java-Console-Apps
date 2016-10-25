package highSeas;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class GreenPlasma {

	Boat boat;
	private int x, y;
    private Image image;
    boolean visible;
    private int width, height;

   
    private final int MISSILE_SPEED = 2;

    public GreenPlasma(int x, int y) {

    	boat = new Boat();
    	
        ImageIcon ii =
            new ImageIcon(this.getClass().getResource("PlasmaMissile-any.png"));
        image = ii.getImage();
        visible = true;
        width = image.getWidth(null);
        height = image.getHeight(null);
        this.x = x;
        this.y = y;
    }


    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void move() {
       
    	if(boat.getDir() == 1){
        	x += MISSILE_SPEED;
       }
       if(boat.getDir() == 2){
    	   x -= MISSILE_SPEED;
       }
       if(boat.getDir() == 3){
        	y -= MISSILE_SPEED;
       }
       if(boat.getDir() == 4){
    	   y += MISSILE_SPEED;
       }
       if( ( (y > 1)||(y < -561) ) || ( (x > 1) || (x < -981) )     ){
    	   visible = false;
       }
    }
}
