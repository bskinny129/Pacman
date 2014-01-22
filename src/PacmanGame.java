import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import acm.program.GraphicsProgram;


public class PacmanGame extends GraphicsProgram {
	
	//A good pacman reference guide: 
	//http://home.comcast.net/~jpittman2/pacman/pacmandossier.html
	
	public static final int APPLICATION_WIDTH = 22*28;
	public static final int APPLICATION_HEIGHT = 22*36 + 20; // 20 is for the file menu
	private Board board;
	private Pacman pacman;
	
	
	public void run(){

		setup();
		play();
		
	}
	
	private void setup(){
		
		board = new Board();
		add(board);
		
		pacman = new Pacman();
		add(pacman);
		
	}
	
	private void play(){
		
		pause(500);
		board.updateSquare(2, 14, 2);
		pacman.nextImage();
	
	}
	

	
}
