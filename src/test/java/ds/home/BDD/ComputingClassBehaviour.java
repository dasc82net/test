package ds.home.BDD;

import org.junit.Assert;
import org.junit.Test;


public class ExpectedBehaviour {

	@Test
	public void intAddition(){
		Assert.assertTrue(new ComputingClass(2, 3).add().intValue() == 5);
	}
	
//	@Test
//	public void fractionsAddition(){
//		
//	}
//	
//	@Test
//	public void intFractionAddition(){
//	}
//	
//	@Test
//	public void zeroAddition(){
//		
//	}
}
