import java.util.Calendar;

public class Date {
	
	
	private int day;
	private int month;
	private int year;
	
	public Date(){
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public Date(int day, int month, int year) throws Exception{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new Exception("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
			
		}
		this.day=day;
		
		
		
	}
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Date tomorrow(){
		Date fecha = new Date();
		if(day==31 && (month == 1 || month ==3 || month ==5 || month == 7 || month == 8 || month ==10)){
			fecha.setDay(1);
			fecha.setMonth(month+1);
			fecha.setYear(year);
		}else if(day == 30 && (month==4 || month == 6 || month ==9)){
			fecha.setDay(1);
			fecha.setMonth(month+1);
			fecha.setYear(year);
		}else if(day == 28 && month == 2){
			fecha.setDay(1);
			fecha.setMonth(month+1);
			fecha.setYear(year);
		}else if(day == 31 && month == 12){
			fecha.setDay(1);
			fecha.setMonth(1);
			fecha.setYear(year+1);
		}else{
			fecha.setDay(day+1);
			fecha.setMonth(month);
			fecha.setYear(year);
		}
		return fecha;
	}
	

	public boolean isSameYear(int agno){
		if(year==agno){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isSameMonth(int mes){
		if(month==mes){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSameDay(int dia){
		if(day==dia){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSame(int dia,int mes,int agno){
		if(day==dia && month==mes && year==agno){
			return true;
		}else{
			return false;
		}
	}
	
//	public boolean isSameYearSwitch(int agno){
//		
//	}
	
	public boolean isSameMonthDoWhile(int mes){
		do{
			while(mes==month){
				return true;
			}
			return false;
		}while(mes!=month);
		
	}
	
	public boolean isSameDayFor(int dia){
		for(int i=day; i==dia;){
			return true;
		}
		return false;
	}
	
	public boolean isSameWhile(int dia,int mes,int agno){
		while(agno==year && month==mes && day==dia){
			return true;
		}
		return false;
	}
	
	
	
	
	public String imprimirMes(){
		String mesecito=null;
		switch(month){
			case 1: mesecito ="Enero";
			break;
			case 2: mesecito="Febrero";
			break;
			case 3: mesecito="Marzo";
			break;
			case 4: mesecito="Abril";
			break;
			case 5: mesecito="Mayo";
			break;
			case 6: mesecito="Junio";
			break;
			case 7: mesecito="Julio";
			break;
			case 8: mesecito="Agosto";
			break;
			case 9: mesecito="Septiembre";
			break;
			case 10: mesecito="Octubre";
			break;
			case 11: mesecito="Noviembre";
			break;
			case 12: mesecito="Diciembre";
			break;
		}
		return mesecito;
	}
	
	public int comprobarDia(){
		if (month==1){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Enero entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==2){
			if (day<1 || day>28){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Febrero entre 1 y 28.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==3){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Marzo entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
			
		}else
		if (month==4){
			if (day<1 || day>30){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Abril entre 1 y 30.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==5){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Mayo entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==6){
			if (day<1 || day>30){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Junio entre 1 y 30.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==7){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Julio entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==8){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Agosto entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==9){
			if (day<1 || day>30){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Septiembre entre 1 y 30.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==10){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Octubre entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else 
		if (month==11){
			if (day<1 || day>30){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Noviembre entre 1 y 30.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else
		if (month==12){
			if (day<1 || day>31){
				System.out.println("Día " + day + " no valido." +
						" Valores posibles para Diciembre entre 1 y 31.");
				return 0;
			}else{
				System.out.println("El día "+day+" para el mes "+month+ " es correcto.");
				return 1;
			}
		}else{
			System.out.println("El mes introducido no es valido.");
			return 0;
		}
		
	}
	
	public String estaciones(){
		String estacion=null;
		if(day>=20 && day<=31 && month==3 || day>=1 && day<=30 && month==4 || day>=1 && day <=31 && month==5 || day>=1 && day<=20 && month==6){
			estacion="La estación del año es primavera";
		}else if(day>=21 && day<=30 && month==6 || day>=1 && day<=31 && month==7 || day>=1 && day <=31 && month==8 || day>=1 && day<=21 && month==9){
			estacion="La estación del año es verano";
		}else if(day>=22 && day<=30 && month==9 || day>=1 && day<=31 && month==10 || day>=1 && day <=30 && month==11 || day>=1 && day<=20 && month==12){
			estacion="La estación del año es otoño";
		}else if(day>=21 && day<=31 && month==12 || day>=1 && day<=31 && month==1 || day>=1 && day <=28 && month==2 || day>=1 && day<=19 && month==3){
			estacion="La estación del año es invierno";
		}else{
			estacion="El día introducido no es correcto, prueba a meter otro día.";
		}
		return estacion;
	}	
	
	public String quedanMeses(){
		String mesesRestantes=null;
		if(month==1){
			mesesRestantes="Quedan Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==2){
			mesesRestantes="Quedan Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==3){
			mesesRestantes="Quedan Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==4){
			mesesRestantes="Quedan Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==5){
			mesesRestantes="Quedan Junio, Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==6){
			mesesRestantes="Quedan Julio, Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==7){
			mesesRestantes="Quedan Agosto, Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==8){
			mesesRestantes="Quedan Septiembre, Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==9){
			mesesRestantes="Quedan Octubre, Noviembre y Diciembre hasta final de año.";
		}else if(month==10){
			mesesRestantes="Quedan Noviembre y Diciembre hasta final de año.";
		}else if(month==11){
			mesesRestantes="Solo queda Diciembre hasta final de año.";
		}else if(month==12){
			mesesRestantes="No queda ningún mes hasta final de año.";
		}
		return mesesRestantes;
	}
	
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public void diasQuedan(){
		System.out.println("Fechas restantes hasta fin de mes:");
		if(month==4 || month==6 || month==9 || month==11){
			for(int i=day;i<31;i++){
				System.out.println(i+"/"+month+"/"+year);
			}
		}else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			for(int i=day;i<30;i++){
				System.out.println(i+"/"+month+"/"+year);
			}
		}else if(month==2){
			for(int i=day;i<28;i++){
				System.out.println(i+"/"+month+"/"+year);
			}
		}
	}
	
	public String mesesDias(){
		String mesesRestantes=null;
		if(month==4 || month==6 || month==9 || month==11){
			mesesRestantes="Los meses con el mismo número de días que en el que estamos son Abril, Junio, Septiembre y Noviembre.";
		}else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			mesesRestantes="Los meses con el mismo número de días que en el que estamos son Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.";
		}else if(month==2){
			mesesRestantes="Febrero es el único mes con este número de días.";
		}
		return mesesRestantes;
	}
	
	public int diasPrimerDia(){
		int numeroDias=0;
		if (month==1){
			numeroDias=day;
		}else if (month==2){
			numeroDias=31+day;
		}else if (month==3){
			numeroDias=31+28+day;
		}else if (month==4){
			numeroDias=31+28+31+day;
		}else if (month==5){
			numeroDias=31+28+31+30+day;
		}else if (month==6){
			numeroDias=31+28+31+30+31+day;
		}else if (month==7){
			numeroDias=31+28+31+30+31+30+day;
		}else if (month==8){
			numeroDias=31+28+31+30+31+30+31+day;
		}else if (month==9){
			numeroDias=31+28+31+30+31+30+31+31+day;
		}else if (month==10){
			numeroDias=31+28+31+30+31+30+31+31+30+day;
		}else if (month==11){
			numeroDias=31+28+31+30+31+30+31+31+30+31+day;
		}else if (month==12){
			numeroDias=31+28+31+30+31+30+31+31+30+31+30+day;
		}
		return numeroDias;
	}
	
	public int numeroIntentosWhile(){
		int dia2=0, mes2=0;
		int intentos2=0;
		while(dia2!=day || mes2!=month){
			dia2=(int) Math.floor(Math.random()*(31-1+1)+1);
			mes2=(int) Math.floor(Math.random()*(12-1+1)+1);
			intentos2++;
		}
		return intentos2;
	}
	
	public void numeroIntentosDoWhile(){
		int dia2=0, mes2=0;
		int intentos2=0;
		do{
			dia2=(int) Math.floor(Math.random()*(31-1+1)+1);
			mes2=(int) Math.floor(Math.random()*(12-1+1)+1);
			intentos2++;
		}while(dia2!=day || mes2!=month);
		System.out.println("El número de intentos hasta dar con la misma fecha son: "+intentos2);
	}
	
	public void diasSemana(){
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.DATE, day+1);
		fecha.set(Calendar.MONTH, month+1);
		fecha.set(Calendar.YEAR, year+1);
		
		String[] strDays=new String[]{
			"Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado"
		};
		
		System.out.println("El día de la semana de la fecha dada es: "+strDays[fecha.get(Calendar.DAY_OF_WEEK)-1]);
	}

}


	
