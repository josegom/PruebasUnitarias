package pruebaMock.clasesAuxiliares;


import ClaseAuxiliar.java.interfaz.ClaseMockear;

/**
 * Clase auxiliar para crear los ejemplos de Mock.
 * @author jose manuel gomez.
 *
 */
public class ClaseAuxiliar {


	public ClaseMockear claseMockear;

	public void setClaseMockear(ClaseMockear mock) {
		claseMockear = mock;
	}

	public String ejecutar() {
		return claseMockear.metodoPublicoSinParametrosMockear();
	}

}
