package pruebaMock.clasesAuxiliares.porwerMock.easymock;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.modules.junit4.PowerMockRunner;

import pruebaMock.clasesAuxiliares.ClaseAuxiliar;
import ClaseAuxiliar.java.interfaz.ClaseMockear;
@RunWith(PowerMockRunner.class) 
public class ClaseAuxiliarTest  {


	private static final String VALOR_ESPERADO = "Valor devuelto";

	@Test
	public void CrearMockMetodoPublicoSinParametros(){
		/*ClaseAuxiliar claseAuxiliar = new ClaseAuxiliar();
		ClaseMockear mock = PowerMock.createMock(ClaseMockear.class);
		claseAuxiliar.setClaseMockear(mock);

		PowerMock.(mock.metodoPublicoSinParametrosMockear()).andReturn(VALOR_ESPERADO);
		
		PowerMock.replay(mock);
		String resultado = claseAuxiliar.ejecutar();

		assertEquals("El resultado devuelto es el esperado", resultado,VALOR_ESPERADO);*/
	}

}
