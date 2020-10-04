package br.com.basquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculoDoRecordeMiniMaxTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testQuatidadeRecordeIgualAZero() {
		CalculoDoRecordeMiniMax c = new CalculoDoRecordeMiniMax();
		int num;
		num=c.quatidadeRecorde();
		assertEquals(0, num);
	}
	
	void testQuatidadeRecordeIgualAUm() {
		CalculoDoRecordeMiniMax c = new CalculoDoRecordeMiniMax();
		int num;
		num=c.quatidadeRecorde();
		assertEquals(1, num);
	}
	void testQuatidadeRecordeIgualADois() {
		CalculoDoRecordeMiniMax c = new CalculoDoRecordeMiniMax();
		int num;
		num=c.quatidadeRecorde();
		assertEquals(2, num);
	}


}
