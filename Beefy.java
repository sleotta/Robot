

//Class to hold the Beefy object
public class Beefy {
	public enum Direction
	{
		NORTH, EAST, SOUTH, WEST
	}
	
	//table size in X and Y dimensions
	private int xSize;
	private int ySize;
	//Enumerated type for the direction Beefy is facing
	private Direction facing;
	
	/*
	 * Position indexing will be done on a scale of 0 to Size-1
	 * (0,0) is South West Corner
	 * (Size-1,0) is South East most Corner
	 * (0, Size-1) is North West most Corner
	 */
	
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
		xSize = 5;
		ySize = 5;
		onTable=false;
	}
	
	//Secondary constructor which allows setting the table size. 
	public Beefy(int x, int y)
	{
		xSize = x;
		ySize = y; 
		onTable=false;
	}
	
	public boolean isOnTable()
	{
		return onTable;
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
