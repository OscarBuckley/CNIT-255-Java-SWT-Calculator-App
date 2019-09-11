package CNIT255Lab6;

public class GradStudent extends Student implements BirthDateCalculate{

	protected String thesis;
	protected Name advisor = new Name();
	
	public String getthesis() {

		return thesis;

		}

	public void setthesis(String newthesis) {

		thesis = newthesis;

		}

}
