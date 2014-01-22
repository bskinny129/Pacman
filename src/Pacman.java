import acm.graphics.GImage;


public class Pacman extends GImage {

	private String[] imagesRight =  {"pacman1.png", "pacman2-right.png", "pacman3-right.png"};
	private int currentImage;
	private int turnTolerance = 4;
	//TO DO:
	//keep track of what way PacMan is facing
	//keep track of if PacMan is moving
	
	public Pacman(){
		
		super("pacman2-right.png", 16, 81);
		currentImage = 1;
		
	}
	
	public void nextImage(){
		// TO DO:
		//Use setImange(String) to change to the next image using the images array
	}
	
	
	public void move(){
		//TO DO:
		//PacMan should move if he is not pushed up against a wall
	}
	
	//TO DO:
	//need a way to change which way PacMan is facing
	
	
	//PacMan is only allowed to change which way he is facing when he is
	//within a few pixels of the center of the square he is on
	public boolean isChangeDirectionAllowed(){
		
		int squareX = getSquareX();
		int squareY = getSquareY();
		
		int squareCenterPixelX = squareX * 22 +11; //11 is for half of the square
		int squareCenterPixelY = squareY * 22 +11 + 20; //20 is for the file menu offset
		
		//System.out.println("Square x center: " + squareCenterPixelX);
		//System.out.println("Square y center: " + squareCenterPixelY);
		
		double locationX = getX() + getWidth()/2;
		double locationY = getY() + getHeight()/2;
		
		//System.out.println("location x: " + locationX);
		//System.out.println("location y: " + locationY);
		
		if(Math.abs(locationX - squareCenterPixelX) < 4 && Math.abs(locationY - squareCenterPixelY) < 4){
			return true;
		}else{
			return false;
		}
		
	}
	
	private double getPacManCenterX(){
		return (getX() + getWidth()/2 );
	}
	private double getPacManCenterY(){
		return (getY() + getHeight()/2);
	}
	public int getSquareX(){
		return (int) ( getPacManCenterX() / 22);
	}
	public int getSquareY(){
		return (int) ((getPacManCenterY() ) / 22); 
	}
	
}
