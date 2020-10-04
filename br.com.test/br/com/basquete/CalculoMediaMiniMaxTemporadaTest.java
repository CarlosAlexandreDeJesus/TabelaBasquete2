package br.com.basquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculoMediaMiniMaxTemporadaTest {
	
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMediaTemporada() {
		CalculoMediaMiniMaxTemporada result = new CalculoMediaMiniMaxTemporada();
		
		int num1 = result.getMaximo();
		int num2 = result.getMinimo();
		
		int media = result.mediaTemporada();
		
		assertEquals(media,num1+num2);
		
	}

}
