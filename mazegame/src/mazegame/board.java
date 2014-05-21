package mazegame;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class board extends JPanel implements ActionListener{
	private Timer timer;
	private Map m;
	private player p;
	private String Message="";
	public void actionPerformed(ActionEvent e){
		if(m.getMap(p.getTX(), p.getTY()).equals("f")){
			Message="Winner";
		}
		repaint();		
	}
	public board(){
		m=new Map();
		p=new player();
		addKeyListener(new AL());
		setFocusable(true);
		timer=new Timer(25, this);
		timer.start();
	}
	public void paint(Graphics g){
		super.paint(g);
		for(int i=0; i<14; i++){
			for(int j=0; j<14; j++){
				if(m.getMap(j, i).equals("f")){
					g.drawImage(m.getFinish(), j*32, i*32, null);
				}
				if(m.getMap(j, i).equals("g")){
					g.drawImage(m.getGrass(), j*32, i*32, null);
				}
				if(m.getMap(j, i).equals("w")){
					g.drawImage(m.getWall(), j*32, i*32, null);
				}
			}
		}		
		g.drawString(Message, 50, 50);
		g.drawImage(p.getPlayer(), p.getTX()*32, p.getTY()*32, null);
	}
public class AL extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		int keycode=e.getExtendedKeyCode();
		//gets the code of the key that is pressed 
		if(keycode== KeyEvent.VK_W){
			if(!m.getMap(p.getTX(), p.getTY()-1).equals("w"))
			p.move( 0, -1);
		}
		if(keycode== KeyEvent.VK_S){
			if(!m.getMap(p.getTX(), p.getTY()+1).equals("w"))
			p.move(0, 1);
		}
		if(keycode== KeyEvent.VK_A){
			if(!m.getMap(p.getTX()-1, p.getTY()).equals("w"))
			p.move(-1, 0);
		}
		if(keycode== KeyEvent.VK_D){
			if(!m.getMap(p.getTX()+1, p.getTY()).equals("w"))
			p.move(1, 0);
		}
	}
	
	public void keyReleased(KeyEvent e){
		
	}
	
	public void keyTyped(KeyEvent e){
		
	}
}
}