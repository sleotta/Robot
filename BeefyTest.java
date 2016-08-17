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
	public void NegativeXPlace()
	{
		
		Beefy b = new Beefy();
		assertTrue(!b.place(-1, 0, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//Tests that placements cannot be made in negative X space
	@Test
	public void NegativeYPlace()
	{
		
		Beefy b = new Beefy();
		assertTrue(!b.place(0, -1, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//Tests that placements cannot be made in outside the board in the X space
	@Test
	public void LargeXPlace()
	{	
		Beefy b = new Beefy();
		assertTrue(!b.place(5, 0, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//Tests that placements cannot be made in outside the board in the X space
	@Test
	public void LargeYPlace()
	{	
		Beefy b = new Beefy();
		assertTrue(!b.place(0, 5, Beefy.Direction.NORTH));
		assertTrue(!b.isOnTable());
		
	}
	
	//tests that placement with valid parameters puts beefy on the table
	@Test
	public void CorrectPlace()
	{	
		Beefy b = new Beefy();
		assertTrue(b.place(0, 0, Beefy.Direction.NORTH));
		assertTrue(b.isOnTable());
		
	}

}
