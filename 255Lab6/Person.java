package CNIT255Lab6;

import java.time.LocalDateTime;

class Person implements BirthDateCalculate{

    protected Name PersonName = new Name();
    protected Address PersonAddress = new Address();
    protected Dates birthDate = new Dates();

    protected int age;
    
//blank constructor
public Person () {

}
	public int getage() {
	
		return age;
	
		}
	public void setage(int newage) {
	
		age = newage;
	
		}
	
public int calculateage(int year, int month, int day) {
		
		//LocalDateTime now = LocalDateTime.now();
		int finalage;
		
		int currentyear = 2019;
		int currentmonth = 4;
		int currentday = 13;
		
		finalage = currentyear - year;
		
		if(currentmonth >= month && currentday >= day) {
			
			finalage =+ 1;
		}
		
		return finalage;
	}


}
