

//Class to hold the Beefy object
public class Beefy {
	public enum Direction
	{
		NORTH, EAST, SOUTH, WEST
	}
	
	//Enumerated type for the direction Beefy is facing
	private Direction facing;
	//X position of Beefy
	private int xPos;
	//Y position of Beefy
	private int yPos;
	//boolean to determine if Beefy is on the table
	//Set to false as 
	private boolean onTable;
	
	//Beefy constructor
	public Beefy()
	{
		onTable=false;
	}
	
	//Place method 
	public void place(int x, int y, Direction f)
	{
		
		//TODO check for valid
		//TODO do placing
		
	}
	
	/*A function to rotate 90 degrees, direction
	is based on value given to clockwise*/
	public void rotate(boolean clockwise)
	{
		//TODO check if on table
		//TODO implement
	}
	
	
	//Reporting of position to System.out
	public void report()
	{
		//TODO check if on table
		//TODO implement
	}
	

}
