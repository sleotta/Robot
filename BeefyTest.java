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

}
