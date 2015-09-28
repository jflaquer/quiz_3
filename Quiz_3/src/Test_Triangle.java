import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Triangle {

	@Test
	public void test() {
		Triangle myTest = new Triangle(3, 4, 5);
		assertTrue(myTest.getArea() == 6.0);
		assertTrue(myTest.getPerimeter() == 12.0);
		System.out.print(myTest.toString());
	}
}
