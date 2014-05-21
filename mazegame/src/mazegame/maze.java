package mazegame;

import javax.swing.JFrame;
import javax.swing.*;

public class maze {
	public static void main(String args[]){
		maze m=new maze();
	}
	
	public maze(){
		JFrame f=new JFrame();
		f.setTitle("Udaya's Maze");
		f.add(new board());
		f.setLocationRelativeTo(null);
		//500 width and 400 height
		f.setSize(464, 485);
		f.setVisible(true);
		//When close is clicked, the program terminates
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
