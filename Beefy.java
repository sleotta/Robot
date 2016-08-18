

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
		
		//TODO check sizes are valid
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
	
	//method to move beefy
	public boolean Move()
	{
		//TODO implement
		return false;
	}
	
	//returns true if beefy is on table, false otherwise
	public boolean isOnTable()
	{
		return onTable;
	}
	
	//Place method returns true on success, false otherwise
	public boolean place(int x, int y, Direction f)
	{
		
		if(x < 0 || x >=xSize)
		{
			return false;
		}
		if(y < 0 || y >=ySize)
		{
			return false;
		}
		
		onTable = true;
		xPos = x;
		yPos = y;
		facing = f;
		//TODO do placing
		return true;
		
	}
	
	
	
	/*A function to rotate 90 degrees, direction
	is based on value given to clockwise*/
	public boolean rotate(boolean clockwise)
	{
		int turn = 0;
		if(clockwise)
		{
			turn = 1;
		} else {
			/*adding this is effectively equivalent to going back one, since the
			 * incrementing code uses modulusS
			 */
			turn =  Direction.values().length-1;
		}
		int next = (this.facing.ordinal() + turn) % Direction.values().length;
		switch(next){
			case 0: this.facing = Direction.NORTH;
					return true;
			case 1: this.facing = Direction.EAST;
					return true;
			case 2: this.facing = Direction.SOUTH;
					return true;
			case 3: this.facing = Direction.WEST;
					return true;
			default: return false;
			
		}
		
	
	}
	
	
	//Reporting of position to System.out
	public boolean report()
	{
		//TODO check if on table
		//TODO implement
		return false;
	}
	
	//Below here are getter methods used mainly for testing
	public Direction getFacing()
	{
		return this.facing;
	}
	public int getX()
	{
		return this.xPos;
	}
	public int getY()
	{
		return this.yPos;
	}
	
	

}
