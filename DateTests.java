import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class DateTests {
	
	private Date fechaInicial;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.fechaInicial = new Date(4,8,1995);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testDate(){
		Date fecha= new Date();
	}
	
	@Test
	public void gettersAndSetters(){
		
		assertEquals(4, fechaInicial.getDay());
		assertEquals(8, fechaInicial.getMonth());
		assertEquals(1995, fechaInicial.getYear());
		fechaInicial.setDay(5);
		fechaInicial.setMonth(9);
		fechaInicial.setYear(190);
		assertEquals(5, fechaInicial.getDay());
		assertEquals(9, fechaInicial.getMonth());
		assertEquals(190, fechaInicial.getYear());
		
	}
	
	
	@Test
	public void isSameYearTest(){
		
		assertTrue(fechaInicial.isSameYear(1995));
		assertFalse(fechaInicial.isSameYear(1998));
	}
	
	@Test
	public void isSameMonthTest(){
		assertTrue(fechaInicial.isSameMonth(8));
		assertFalse(fechaInicial.isSameMonth(19000));
	}
	
	@Test
	public void isSameDayTest(){
		assertTrue(fechaInicial.isSameDay(4));
		assertFalse(fechaInicial.isSameDay(7));
	}
	
	@Test
	public void isSameTest(){
		assertTrue(fechaInicial.isSame(4, 8, 1995));
		assertFalse(fechaInicial.isSame(7, 11, 1980));
	}
	
	@Test
	public void tomorrowTest() throws Exception{
		//Date fechaSiguiente = fechaInicial.tomorrow(); por si quieres cambiar fechIni... por fechaSiguiente.
		assertEquals("5/8/1995", fechaInicial.tomorrow().toString());
		Date f1 = new Date(31, 1, 1995);
		assertEquals("1/2/1995", f1.tomorrow().toString());
		Date f2 = new Date(30, 4, 1995);
		assertEquals("1/5/1995", f2.tomorrow().toString());
		Date f3 = new Date (28, 2, 1995);
		assertEquals("1/3/1995", f3.tomorrow().toString());
		Date f4 = new Date (31, 12, 1995);
		assertEquals("1/1/1996", f4.tomorrow().toString());
	}
	
	@Test
	public void getMonthNameTest() throws Exception{
		assertEquals("Agosto", fechaInicial.imprimirMes());
		assertEquals("Enero", new Date(1,1,1999).imprimirMes());
		assertEquals("Febrero", new Date(1,2,1999).imprimirMes());
		assertEquals("Marzo", new Date(1,3,1999).imprimirMes());
		assertEquals("Abril", new Date(1,4,1999).imprimirMes());
		assertEquals("Mayo", new Date(1,5,1999).imprimirMes());
		assertEquals("Junio", new Date(1,6,1999).imprimirMes());
		assertEquals("Julio", new Date(1,7,1999).imprimirMes());
		assertEquals("Agosto", new Date(1,8,1999).imprimirMes());
		assertEquals("Septiembre", new Date(1,9,1999).imprimirMes());
		assertEquals("Octubre", new Date(1,10,1999).imprimirMes());
		assertEquals("Noviembre", new Date(1,11,1999).imprimirMes());
		assertEquals("Diciembre", new Date(1,12,1999).imprimirMes());
	}
	
	@Test
	public void daysOfMonthTest() throws Exception{
		
		assertEquals(1, fechaInicial.comprobarDia());
		assertEquals(0, new Date(32,1,1995).comprobarDia());
		assertEquals(1, new Date(31,1,1995).comprobarDia());
		assertEquals(0, new Date(32,2,1995).comprobarDia());
		assertEquals(1, new Date(28,2,1995).comprobarDia());
		assertEquals(0, new Date(33,3,1995).comprobarDia());
		assertEquals(1, new Date(31,3,1995).comprobarDia());
		assertEquals(0, new Date(32,4,1995).comprobarDia());
		assertEquals(1, new Date(30,4,1995).comprobarDia());
		assertEquals(0, new Date(32,5,1995).comprobarDia());
		assertEquals(1, new Date(30,5,1995).comprobarDia());
		assertEquals(0, new Date(32,6,1995).comprobarDia());
		assertEquals(1, new Date(30,6,1995).comprobarDia());
		assertEquals(0, new Date(32,7,1995).comprobarDia());
		assertEquals(1, new Date(30,7,1995).comprobarDia());
		assertEquals(0, new Date(32,8,1995).comprobarDia());
		assertEquals(0, new Date(32,9,1995).comprobarDia());
		assertEquals(1, new Date(30,9,1995).comprobarDia());
		assertEquals(0, new Date(32,10,1995).comprobarDia());
		assertEquals(1, new Date(30,10,1995).comprobarDia());
		assertEquals(0, new Date(32,11,1995).comprobarDia());
		assertEquals(1, new Date(30,11,1995).comprobarDia());
		assertEquals(0, new Date(32,12,1995).comprobarDia());
		assertEquals(1, new Date(30,12,1995).comprobarDia());

	}
	
	@Test
	public void getSeasonNameTest() throws Exception{
		assertEquals("La estación del año es verano", fechaInicial.estaciones());
		assertEquals("La estación del año es primavera", new Date(1,4,1995).estaciones());
		assertEquals("La estación del año es otoño", new Date(1,10,1995).estaciones());
		assertEquals("La estación del año es invierno", new Date(1,1,1995).estaciones());
		assertEquals("El día introducido no es correcto, prueba a meter otro día.", new Date(38,1,1995).estaciones());
	}
	
	@Test
	public void getMonthsLeftTest() throws Exception{
		assertEquals("Quedan Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", fechaInicial.quedanMeses());
		assertEquals("Quedan Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,1,1995).quedanMeses());
		assertEquals("Quedan Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,2,1995).quedanMeses());
		assertEquals("Quedan Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,3,1995).quedanMeses());
		assertEquals("Quedan Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,4,1995).quedanMeses());
		assertEquals("Quedan Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,5,1995).quedanMeses());
		assertEquals("Quedan Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,6,1995).quedanMeses());
		assertEquals("Quedan Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,7,1995).quedanMeses());
		assertEquals("Quedan Octubre, Noviembre y Diciembre hasta final de año.", new Date(4,9,1995).quedanMeses());
		assertEquals("Quedan Noviembre y Diciembre hasta final de año.", new Date(4,10,1995).quedanMeses());
		assertEquals("Solo queda Diciembre hasta final de año.", new Date(4,11,1995).quedanMeses());
		assertEquals("No queda ningún mes hasta final de año.", new Date(4,12,1995).quedanMeses());
	}
	
	@Test
	public void getMonthsSameDaysTest() throws Exception{
		assertEquals("Los meses con el mismo número de días que en el que estamos son Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.", fechaInicial.mesesDias());
		assertEquals("Los meses con el mismo número de días que en el que estamos son Abril, Junio, Septiembre y Noviembre.", new Date(4,4,12).mesesDias());
		assertEquals("Febrero es el único mes con este número de días.",new Date(2,2,1998).mesesDias());
	}
	
	@Test
	public void daysPastTest() throws Exception{
		Date fecha1=new Date(1,1,1);
		Date fecha2=new Date(1,2,1);
		Date fecha3=new Date(1,3,1);
		Date fecha4=new Date(1,4,1);
		Date fecha5=new Date(1,5,1);
		Date fecha6=new Date(1,6,1);
		Date fecha7=new Date(1,7,1);
		Date fecha8=new Date(1,9,1);
		Date fecha9=new Date(1,10,1);
		Date fecha10=new Date(1,11,1);
		Date fecha11=new Date(1,12,1);
		
		assertEquals(31+28+31+30+31+30+31+fechaInicial.getDay(),fechaInicial.diasPrimerDia());
		assertEquals(31+28+31+30+31+30+31+31+30+31+30+fecha11.getDay(), fecha11.diasPrimerDia());
		assertEquals(31+28+31+30+31+30+31+31+30+31+fecha10.getDay(), fecha10.diasPrimerDia());
		assertEquals(31+28+31+30+31+30+31+31+30+fecha9.getDay(), fecha9.diasPrimerDia());
		assertEquals(31+28+31+30+31+30+31+31+fecha8.getDay(), fecha8.diasPrimerDia());
		assertEquals(31+28+31+30+31+30+fecha7.getDay(), fecha7.diasPrimerDia());
		assertEquals(31+28+31+30+31+fecha6.getDay(), fecha6.diasPrimerDia());
		assertEquals(31+28+31+30+fecha5.getDay(), fecha5.diasPrimerDia());
		assertEquals(31+28+31+fecha4.getDay(), fecha4.diasPrimerDia());
		assertEquals(31+28+fecha3.getDay(), fecha3.diasPrimerDia());
		assertEquals(31+fecha2.getDay(), fecha2.diasPrimerDia());
		assertEquals(fecha1.getDay(), fecha1.diasPrimerDia());
	}
	
	@Test
	public void numRamdomTriesEqualsDateTest(){
		assertTrue(fechaInicial.numeroIntentosWhile()>0);
	}


}
