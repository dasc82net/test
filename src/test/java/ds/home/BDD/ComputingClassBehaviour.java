package ds.home.BDD;

import org.junit.Assert;
import org.junit.Test;


public class ComputingClassBehaviour {

    @Test
    public void zeroAddition() {
        Assert.assertTrue(new ComputingClass(0, 0).add().intValue() == 0);
    }
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

}
