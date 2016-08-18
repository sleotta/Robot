import static org.junit.Assert.*;
import org.junit.Test;
public class BeefyTest {

	
	//Tests that beefy can be created and is not created on the table
	@Test
	public void construction() {
		Beefy b = new Beefy();
		assertTrue(b!=null);
		assertTrue(!b.isOnTable());
		
	}
	
	
	//Tests that placements cannot be made in negative X space
	@Test
	public void negativeXPlace()
	{
		
		Beefy b = new Beefy();
		assertTrue(!b.place(-1, 0, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//Tests that placements cannot be made in negative X space
	@Test
	public void negativeYPlace()
	{
		
		Beefy b = new Beefy();
		assertTrue(!b.place(0, -1, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//Tests that placements cannot be made in outside the board in the X space
	@Test
	public void largeXPlace()
	{	
		Beefy b = new Beefy();
		assertTrue(!b.place(5, 0, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//Tests that placements cannot be made in outside the board in the X space
	@Test
	public void largeYPlace()
	{	
		Beefy b = new Beefy();
		assertTrue(!b.place(0, 5, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//tests that placement with valid parameters puts beefy on the table
	@Test
	public void correctPlace()
	{	
		Beefy b = new Beefy();
		assertTrue(b.place(1, 2, Beefy.Direction.WEST));
		assertTrue(b.isOnTable());
		assertTrue(b.getFacing()==Beefy.Direction.WEST);
		assertTrue(b.getX() == 1);
		assertTrue(b.getY() == 2);
		
	}
	
	
	//Tests that one rotation clockwise will work
	@Test
	public void rotateClockwiseOnce()
	{	
		Beefy b = new Beefy();
		assertTrue(b.place(0, 0, Beefy.Direction.NORTH));
		assertTrue(b.rotate(true));
		assertTrue(b.getFacing()==Beefy.Direction.EAST);
	}
	
	//Tests that one rotation clockwise will work
	@Test
	public void rotateCounterOnce()
	{	
		Beefy b = new Beefy();
		assertTrue(b.place(0, 0, Beefy.Direction.NORTH));
		assertTrue(b.rotate(false));
		assertTrue(b.getFacing()==Beefy.Direction.WEST);
		
	}
	
	//Tests that rotating 4 times will bring Beefy to be facing the same position
	@Test
	public void rotateClockwiseFour()
	{	
		Beefy b = new Beefy();
		assertTrue(b.place(0, 0, Beefy.Direction.NORTH));
		for(int i=0; i<4; i++)
		{
			assertTrue(b.rotate(true));
		}
		assertTrue(b.getFacing()==Beefy.Direction.NORTH);
		
	}

}
