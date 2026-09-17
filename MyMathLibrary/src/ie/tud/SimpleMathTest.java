package ie.tud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest2 {


	    @Test
	    void testAdd() {
	        assertEquals(5, SimpleMath.add(2, 3));
	        assertEquals(-1, SimpleMath.add(2, -3));
	    }

	    @Test
	    void testSubtract() {
	        assertEquals(1, SimpleMath.subtract(3, 2));
	        assertEquals(-5, SimpleMath.subtract(-2, 3));
	    }

	    @Test
	    void testMultiply() {
	        assertEquals(6, SimpleMath.multiply(2, 3));
	        assertEquals(-10, SimpleMath.multiply(-2, 5));
	    }

	    @Test
	    void testDivide() {
	        assertEquals(2.0, SimpleMath.divide(10, 5));
	        assertThrows(IllegalArgumentException.class, () -> SimpleMath.divide(5, 0));
	    }

	    @Test
	    void testMax() {
	        assertEquals(5, SimpleMath.max(3, 5));
	        assertEquals(10, SimpleMath.max(10, -1));
	    }

	    @Test
	    void testMin() {
	        assertEquals(3, SimpleMath.min(3, 5));
	        assertEquals(-1, SimpleMath.min(10, -1));
	    }

	    @Test
	    void testAbs() {
	        assertEquals(5, SimpleMath.abs(-5));
	        assertEquals(3, SimpleMath.abs(3));
	    }

	    @Test
	    void testClamp() {
	        assertEquals(5, SimpleMath.clamp(5, 0, 10));   // inside range
	        assertEquals(0, SimpleMath.clamp(-5, 0, 10));  // below
	        assertEquals(10, SimpleMath.clamp(20, 0, 10)); // above
	    }

	    @Test
	    void testSquare() {
	        assertEquals(25, SimpleMath.square(5));
	        assertEquals(20, SimpleMath.square(0));
	    }

	    @Test
	    void testCube() {
	        assertEquals(27, SimpleMath.cube(3));
	        assertEquals(-8, SimpleMath.cube(-2));
	    }

	    @Test
	    void testAverage() {
	        assertEquals(5.0, SimpleMath.average(4, 6));
	        assertEquals(2.5, SimpleMath.average(0, 5));
	    }

	    @Test
	    void testIsEven() {
	        assertTrue(SimpleMath.isEven(4));
	        assertFalse(SimpleMath.isEven(5));
	    }
	}

