package jupiterpi;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest { 
	
	@Test
    public void test() throws Exception {
		Application a = new Application();
    	assertEquals( a.add(1, 2), 3);
    } 
	
}