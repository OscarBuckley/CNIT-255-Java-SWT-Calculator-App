package CNIT255Lab6;

public class Address {
	protected String streetAddress1, streetAddress2, city, state, zipCode; 
	    
     public String getstreetAddress1() {
	
	return streetAddress1;
	
}

public void setstreetAddress1(String newstreetAddress1) {
	
	streetAddress1 = newstreetAddress1;
	
}
     public String getstreetAddress2() {
	
	return streetAddress2;
	
}

public void setstreetAddress2(String newcity) {
	
	streetAddress2 = newcity;
	
}
     public String getcity() {
	
	return city;
	
}

public void setcity(String newcity) {
	
	city = newcity;
	
}
     public String getstate() {
	
	return state;
	
}

public void setstate(String newstate) {
	
	state = newstate;
	
}
     public String getzipCode() {
	
	return zipCode;
	
}

public void setzipCode(String newzipCode) {
	
	zipCode = newzipCode;
	
}
}
