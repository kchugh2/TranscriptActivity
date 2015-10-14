package newpackage;

public class Validator {
	private boolean valid ;
	
	public Validator(String grade, int credits)
	{
		if((credits>0 && credits <=4)&&(grade.equals("A")||grade.equals("B")||grade.equals("C")||grade.equals("D")||grade.equals("F")))
			{
			System.out.println("Details Accepted");
			setValid(true);
			}
		else
		{
			System.out.println("Course details incorrect - Reenter !");
			setValid(false);
		}
		
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
