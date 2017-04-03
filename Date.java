import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {

	//static Date date = new Date();
	static String fechaInicio = "03/04/2017";
	
	static  String[] aFechaIng = fechaInicio.split("/");
    static String day = aFechaIng[0];
    static String month = aFechaIng[1];
    static String year = aFechaIng[2];
    
    static int dayInt = Integer.parseInt(day);
    static int monthInt = Integer.parseInt(month);
    static int yearInt = Integer.parseInt(year);
	//static String fechaInicio = "22/04/1988";
	//static String fechaActual = "09/04/2015";
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Es el mismo año? "+ isSameYear(2017));
		System.out.println("¿Es el mismo mes? "+ isSameMonth(2));
		System.out.println("¿Es el mismo día? "+ isSameDay(21));
		System.out.println("¿Es la misma fecha?"+ isSame(02, 04, 2017));
		devolverMes(02);
		System.out.println("¿Es el mismo día y mes que la fecha del programa? "+ comprobarDia(03, 04));
		estacionAgno(04);
		mesesRestantes(04);
		imprimirFecha("02", "04", "2017");
		imprimirFechasRestantesMes(02, 04, 2017);
		
	}

	
	
	public static boolean isSameYear(int year2){
		if(yearInt==year2){
			return true;
		}else{
			return false;
		}	
		
	}
	public static boolean isSameMonth(int month2){
		if(monthInt==month2){
			return true;
		}else{
			return false;
		}	
		
	}
	public static boolean isSameDay(int day2){
		if(dayInt==day2){
			return true;
		}else{
			return false;
		}	
		
	}
	public static boolean isSame(int day2, int month2, int year2){
		if(dayInt==day2 && monthInt == month2 && yearInt==year2){
			return true;
		}else{
			return false;
		}	
		
	}
	public static void devolverMes(int mes){
		String mes1="";
		switch(mes){
			case 1: mes1="Enero"; break;
			case 2: mes1="Febrero"; break;
			case 3: mes1="Marzo";break;
			case 4: mes1="Abril";break;
			case 5: mes1="Mayo";break;
			case 6: mes1="Junio";break;
			case 7: mes1="Julio";break;
			case 8: mes1="Agosto";break;
			case 9: mes1="Septiembre";break;
			case 10: mes1="Octubre";break;
			case 11: mes1="Noviembre";break;
			case 12: mes1="Diciembre";break;
			
		}
		System.out.println(mes1);
		
	}
	
	public static boolean comprobarDia(int dia, int mes){
		
		if(dia==dayInt&&mes==monthInt){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void estacionAgno(int mes){
		String estacion="";
		switch(mes){
		case 3: case 4: case 5: estacion="Primavera"; break;
		case 6: case 7: case 8: estacion ="Verano"; break;
		case 9 : case 10: case 11: estacion="Otoño"; break;
		case 12: case 1:case 2: estacion="Invierno"; break;
		}
		
		System.out.println(estacion);
	}
	
	public static void mesesRestantes(int mes){
		int diferencia = 12 - mes;
		System.out.println("Los meses restantes hasta que acabe el año son: "+diferencia);
	}
	
	public static void imprimirFecha(String dia, String mes, String agno){
		System.out.println("La fecha que quiere imprimir es: "+dia+"/"+mes+"/"+agno);
	}
	
	public static void imprimirFechasRestantesMes(int day, int mes, int agno){
		int enero=31, febrero=28, marzo=31, abril =30, mayo=31, junio=30, julio=31,agosto=31,septiembre=30,octubre=31,noviembre=30,diciembre=31;
		System.out.println("Las fechas restantes hasta que acabe el mes son: ");
		if(mes==1){
			for (int i = day; i < enero+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}
		if(mes==2){
			for (int i = day; i < febrero+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}
		if(mes==3){
			for (int i = day; i < marzo+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}
		if(mes==4){
			for (int i = day; i < abril+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}
		if(mes==5){
			for (int i = day; i < mayo+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}
		if(mes==6){
			for (int i = day; i < junio+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}if(mes==7){
			for (int i = day; i < julio+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}if(mes==8){
			for (int i = day; i < agosto+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}if(mes==9){
			for (int i = day; i < septiembre+1; i++) {
				
				System.out.println(day+"/0"+mes+"/"+agno);
				day++;
			}
		}if(mes==10){
			for (int i = day; i < octubre+1; i++) {
				
				System.out.println(day+"/"+mes+"/"+agno);
				day++;
			}
		}if(mes==11){
			for (int i = day; i < noviembre+1; i++) {
				
				System.out.println(day+"/"+mes+"/"+agno);
				day++;
			}
		}if(mes==12){
			for (int i = day; i < diciembre+1; i++) {
				
				System.out.println(day+"/"+mes+"/"+agno);
				day++;
			}
		}
	
	}
	public static void mismosMeses(int dia, int mes, int agno){
		if(mes==1 | mes==3 |mes==5|mes==7|mes==8|mes==10|mes==12){
			System.out.println("Los meses de 31 dias son: Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
		}else if(mes==2){
			System.out.println("Los meses de 28 dias son: Febrero");
		}else{
			System.out.println("Los meses de 30 días son: Abril, Junio, Septiembre, Noviembre");
		}
	}

}
