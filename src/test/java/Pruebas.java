package test.java;

import factory_method.FactoryGenerator;

import org.junit.*;
import static org.junit.Assert.*;

public class Pruebas {

	@Before
	public void AntesDe(){
		System.out.print("Comienza el Test: ");
	}
	
	@After
	public void DespuesDe() {
		System.out.println("Finaliza el Test");
	}
	
	@Test
	public void CreaObjeto ()
	{
		assertNull("Se ha creado correctamente el objeto Problem", new FactoryGenerator());
	}
	
}
