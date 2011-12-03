package pruebaMock.clasesAuxiliares.porwerMock.easymock;


import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Test;

import pruebaMock.clasesAuxiliares.ClaseAuxiliar;
import ClaseAuxiliar.java.interfaz.ClaseMockear;

public class ClaseAuxiliarTest  {


	private static final String VALOR_ESPERADO = "Valor devuelto";

	@Test
	public void CrearMockMetodoPublicoSinParametros(){
		ClaseAuxiliar claseAuxiliar = new ClaseAuxiliar();
		ClaseMockear mock = createMock(ClaseMockear.class);
		claseAuxiliar.setClaseMockear(mock);

		
		EasyMock.expect(mock.metodoPublicoSinParametrosMockear()).andReturn(VALOR_ESPERADO);
		
		replay(mock);
		String resultado = claseAuxiliar.ejecutar();

		assertEquals("El resultado devuelto es el esperado", resultado,VALOR_ESPERADO);
	}

}
