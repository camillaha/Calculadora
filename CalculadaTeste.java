import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadaTeste {

	@Test
	public void deveSomarUmMaisUm() {
		int resultado = Calculadora.somar(1,1) ;
		assertEquals(2, resultado);
	}
	
	@Test
	public void deveSomarDoisMaisDois() {
		int resultado = Calculadora.somar(2,2) ;
		assertEquals(4, resultado);
	}
	
	@Test
	public void deveSomarTresMaisTres() {
		int resultado = Calculadora.somar(3,3) ;
		assertEquals(6, resultado);
	}
	
	@Test
	public void deveSomarTresMaisCinco() {
		int resultado = Calculadora.somar(3,5) ;
		assertEquals(8, resultado);
	}
	
	@Test
	public void deveDividirDezPorDois() {
		int resultado = Calculadora.dividir(10,2) ;
		assertEquals(5, resultado);
	}
	
	@Test
	public void deveMultiplicarCincoPorDois() {
		int resultado = Calculadora.multiplicar(5,2) ;
		assertEquals(10, resultado);
	}
	
	@Test
	public void deveSubtrairCincoPorDois() {
		int resultado = Calculadora.subtrair(5,2) ;
		assertEquals(3, resultado);
	}


}
