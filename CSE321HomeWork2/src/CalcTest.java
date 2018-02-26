import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void CalcSubtractPositiveResult() {
		
		Calc c1 = null ;
		assertTrue(c1.subtract(13,9) == 4);
	}
	
	@Test
	void CalcSubtractNegativeResult() {
		
		Calc c1 = null;
		assertTrue(c1.subtract(9, 13) == -4);
	}
	
	@Test
	void CalcSubtractDecimals() {
		
		Calc c1 = null;
		assertTrue(c1.subtract(13.7,9.2)== 4.5);
	}
	
	@Test
	void CalcMulitiplyBasic() {
		Calc c1 = null;
		assertTrue(c1.mutiply(3,6) == 18);
	}
	
	@Test
	void CalcMulitiplyDecimals() {
		Calc c1 = null;
		assertTrue(c1.mutiply(3.5,6.73) == 23.555);
	}
	
	@Test
	void CalcMulitiplyNegative() {
		Calc c1 = null;
		assertTrue(c1.mutiply(3,-6) == -18);
	}
	
	@Test
	void CalcMulitiplyZero() {
		Calc c1 = null;
		assertTrue(c1.mutiply(3,0) == 0);
		
	}
	
	@Test
	void CalcDivideBasic() {
		Calc c1 = null;
		assertTrue(c1.divide(12,3) == 4);
	}
	
	@Test
	void CalcDivideZero() {
		Calc c1 = null;
		try {
			c1.divide(3,0);
		} catch(ArithmeticException e){
			return;
		}
		fail("Divide by zero undefine expected");
		// I decide to catch when divide by zero will become undefine
	}
	
	
	@Test
	void CalcDivideDecimals() {
		Calc c1 = null;
		assertTrue(c1.divide(10,100) == 0.1);
		//Expect it to return double
	}

}


/*	

		
}

@Test
void CalcDivide() {
	Calc c1 = new Calc(18,9);
	assertTrue(c1 == );
	
}



@Test
	void CalcSubtractNull() {
		
		Calc c1 = null;
		assertTrue(c1.subtract((Double) null,9.2)== 4.5);
	}
*/