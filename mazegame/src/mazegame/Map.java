package mazegame;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Map {
	
	private Scanner sc;
	private Image grass, wall, finish, success;
	private String map[]=new String[14];
	
	public Map(){
		ImageIcon img=new ImageIcon("C://grass.png");
		grass=img.getImage();
		img=new ImageIcon("C://wall.png");
		wall=img.getImage();
		img=new ImageIcon("C://smiley.png");
		finish=img.getImage();
		img=new ImageIcon("C://female-smiley.png");
		success=img.getImage();
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass(){
		return grass;
	}
	
	public Image getWall(){
		return wall;
	}
	
	public Image getFinish(){
		return finish;
	}
	public String getMap(int x, int y){
		//Based on x position, y position is tracked. 	
		String index=map[y].substring(x, x+1);
		return index;
	}
	
	public void openFile(){
		try{
			sc=new Scanner(new File("C://map.txt"));
		}
		catch(Exception e){
			System.out.println("Error loading file");
		}
		
	}
	
	public void readFile(){
		while(sc.hasNext()){
			for(int i=0; i<14; i++){
				map[i]=sc.next();
			}
		}
	}
	
	public void closeFile(){
		sc.close();
	}
}
