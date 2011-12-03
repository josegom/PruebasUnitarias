package pruebaMock.clasesAuxiliares.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import pruebaMock.clasesAuxiliares.ClaseAuxiliar;
import ClaseAuxiliar.java.interfaz.ClaseMockear;

public class ClaseAuxiliarTest  {


	private static final String VALOR_ESPERADO = "Valor devuelto";

	@Test
	public void CrearMockMetodoPublicoSinParametros(){
		ClaseAuxiliar claseAuxiliar = new ClaseAuxiliar();
		ClaseMockear mock = mock(ClaseMockear.class);
		claseAuxiliar.setClaseMockear(mock);

		when(mock.metodoPublicoSinParametrosMockear()).thenReturn(VALOR_ESPERADO);

		String resultado = claseAuxiliar.ejecutar();

		assertEquals("El resultado devuelto es el esperado", resultado,VALOR_ESPERADO);
	}

}
