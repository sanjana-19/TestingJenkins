import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
public class TraineeTesting {
	@Test
	public void testAddTrainee()
	{
		int result=Trainee.addTrainee(111,"sai");
		int result1=Trainee.addTrainee(112,"priyanka");
		assertEquals(3,result1);
				
	}
	@Test
	public void testUpdateTrainee()
	{
	int result=Trainee.addTrainee(113,"sanju");
	String oldName=Trainee.updateTrainee(113,"ravi");
		assertEquals("sanju",oldName);
	}
	@Test
	public void testRemoveTrainee()
	{
		int result=Trainee.removeTrainee(113);
		assertEquals(2,result);
				
	}
	@Test
	public void testFetchTrainee()
	{
	String result=Trainee.fetchTrainee(112);
		assertEquals("priyanka",result);
	}
	@Test
	public void testFetchallTrainee()
	{
		int result=Trainee.fetchAllTrainee();
		assertEquals(2,result);
	}
	    

}

