package pruebaMock.clasesAuxiliares.porwerMock.mockito;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import pruebaMock.clasesAuxiliares.ClaseAuxiliar;
import ClaseAuxiliar.java.interfaz.ClaseMockear;

@RunWith(PowerMockRunner.class)
public class ClaseAuxiliarTest  {


	private static final String VALOR_ESPERADO = "Valor devuelto";

	@Test
	public void CrearMockMetodoPublicoSinParametros(){
		ClaseAuxiliar claseAuxiliar = new ClaseAuxiliar();
		ClaseMockear mock = PowerMockito.mock(ClaseMockear.class);
		claseAuxiliar.setClaseMockear(mock);

		Mockito.when(mock.metodoPublicoSinParametrosMockear()).thenReturn(VALOR_ESPERADO);
		
		String resultado = claseAuxiliar.ejecutar();

		assertEquals("El resultado devuelto es el esperado", resultado,VALOR_ESPERADO);
	}

}
