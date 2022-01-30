import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	 public void SetUp()throws Exception{
		 g1 = new GradeBook(5);
		 g1.addScore(50.0);
		 g1.addScore(75.0);
		 
		 g2 = new GradeBook(5);
		 g2.addScore(60.0);
		 g2.addScore(85.0);
		 g2.addScore(95.0);
		 
		 
	 }
	@AfterEach
	 public void tearDown(){
		 g1 = null;
		 g2 = null;
	 }

	@Test
	public void addScoreTest() {
		assertTrue((g1.toString()).equals("50.0 75.0  "));
		assertTrue((g2.toString()).equals("60.0 85.0 95.0 "));
		
		assertEquals(2,g1.getScoresSize(),0.001); 	
		assertEquals(3,g2.getScoresSize(),0.001);
	}
	@Test
	public void testSum() {
		assertEquals(125.0, g1.sum(),0.0001);
		assertEquals(240.0,g2.sum(),0.0001);
		
	}
	@Test
	
	public void testMinimum() {
		assertEquals(50.0,g1.minimum(),0.001);
		assertEquals(60.0,g2.minimum(),0.001);
		
	}
	@Test
	
	public void testFinalScore() {
		assertEquals(75.0, g1.finalScore(),0.001);
		assertEquals(180.0, g2.finalScore(),0.001);
		
	}

}
