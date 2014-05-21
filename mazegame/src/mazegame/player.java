package mazegame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class player {
	private int tileX, tileY;
	private Image p;
	public player(){
		ImageIcon img=new ImageIcon("C://a.png");
		p=img.getImage();
		
		tileX=1;
		tileY=1;
	}
	
	public Image getPlayer(){
		return p;
	}

	
	public int getTX(){
		return tileX;
	}
	
	public int getTY(){
		return tileY;
	}
	public void move(int tx, int ty){
		
		tileX=tileX+tx;
		tileY=tileY+ty;
	}
}
