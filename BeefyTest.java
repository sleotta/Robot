import static org.junit.Assert.*;
import org.junit.Test;
public class BeefyTest {

	
	/*Tests that beefy can be created and
	that he is created off of the table*/
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

}
