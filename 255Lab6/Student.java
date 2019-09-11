package CNIT255Lab6;

public class Student extends Person implements BirthDateCalculate {
	
	protected String major, favClass, PUID;
	protected boolean Hogwarts;
	protected Dates gradDate = new Dates();

	public Student(){
		super();
	}
	
	public String getPUID() {

		return PUID;

		}

	public void setPUID(String newPUID) {

		PUID = newPUID;

		}
	
	public String getmajor() {
		
		return major;
	
		}
	public void setmajor(String newmajor) {
	
		major = newmajor;
	
		}
	
	public String getfavclass() {
		
		return favClass;
	
		}
	public void setfavclass(String newfavclass) {
	
		favClass = newfavclass;
	
		}
	public boolean getHogwarts() {
		
		return Hogwarts;
	
		}
	public void setHogwarts(boolean newhogwarts ){
		
			Hogwarts = newhogwarts;
	
		}

}
