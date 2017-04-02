package es.unileon.prg1.date;

public class MainDate{

	public static void main(String args[]){

		Date today;tomorrow;

		today=new Date(21,3,2016);
		tomorrow=new Date(22,3,2016);
		today.isSameYear(tomorrow);
	}

}
