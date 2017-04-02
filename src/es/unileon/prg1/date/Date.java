package es.unileon.prg1.date;

public class Date{

	private int day;
	private int month;
	private int year;
	public day(){
		this.day=1;
		this.month=1;
		this.year=2016;
	public Date(int day;int month;int year) throws DateExcept{
		StringBuffer message=new StringBuffer();
		if(Day<=0){
			message.append("No se permiten dias negativos-valor incorrecto para dia:"+day+"\n");
		}
		if(Month<=0){
			message.append("No se permiten meses negativos-valor incorrecto para mes:"+month+"\n");
		}
		else{
			if(month>12){
				message.append("Solo hay 12 meses-valor incorrectopara mes:"+month+"\n");
			}
		}
		else{
			if(day>this.day of Month(month){
				message.append("Dias/meses muchas combinaciones"+day+"/"+month+"\n");
			}
		}
	}
	if(message.lenght()!=0){
		throw new Date excepcion(message.to.String());
	}
	else{
		this.day=day;
		this.month=month;
		this.yeat=year;
	}
	
	
	String get MonthName(){
		String month "";
		swich(this.month){
			case 1: mes="Enero";
			break;
			case 2: mes="Febrero";
			break;
			case 3: mes="Marzo";
			break;
			case 4: mes="Abril";
			break;
			case 5: mes="Mayo";
			break;
			case 6: mes="Junio";
			break;
			case 7: mes="Julio";
			break;
			case 8: mes="Agosto";
			break;
			case 9: mes="Septiembre";
			break;
			case 10: mes="Octubre";
			break;
			case 11: mes="Noviembre";
			break;
			case 12: mes="Diciembre";
			break;
		}
	}
       boolean inSameYear(Date another){
	void getYear(int year){
		this.year=year
	}
	int getYear(){
	return this.year;
	}
	if(this.year=another.getYear()){
		return true;
	}
	else{
		return false;
	}
      }


}
