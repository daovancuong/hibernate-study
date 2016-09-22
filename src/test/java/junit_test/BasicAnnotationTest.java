package junit_test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BasicAnnotationTest {

	private int param1;
	private int Param2;

	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2 }, { 5, 3 }, { 121, 4 } };
		return Arrays.asList(data);
	}

	public BasicAnnotationTest(int param1, int param2) {
		super();
		this.param1 = param1;
		Param2 = param2;
	}




	@Test
	public void test_method_1() {
		Mutiply mutiply = new Mutiply();
		assertEquals("bang nhau", param1 * Param2, mutiply.multiply(param1, Param2*2));
	}

	@Test(timeout = 2000)
	public void test_method_2() throws InterruptedException {
		
		System.out.println("@Test - test_method_2");
	}

}