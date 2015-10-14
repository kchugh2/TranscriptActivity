package newpackage;
import newpackage.Validator;
import java.util.Scanner;

public class CourseEnrollment {
private String coursecode;
private String grade;
private int credits,qualitypoints,qualityscore;
public String getCoursecode() {
	return coursecode;
}
public void setCoursecode(String coursecode) {
	this.coursecode = coursecode;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public int getCredits() {
	return credits;
}
public void setCredits(int credits) {
	this.credits = credits;
}
public int getQualitypoints() {
	return qualitypoints;
}
public void setQualitypoints(int qualitypoints) {
	this.qualitypoints = qualitypoints;
}
public int getQualityscore() {
	return qualityscore;
}
public void setQualityscore(int qualityscore) {
	this.qualityscore = qualityscore;
}

public int qualitypoints()
{
	int qp=0;
	switch(this.grade)
	{
	case "A" :
		qp=4;
		break;
		
	case "B":
		qp=3;
		break;
		
	case "C" :
		qp=2;
		break;
		
	case "D":
		qp=1;
		break;
		
	case "F":
		qp=0;
		break;
		
	
	}
	
	
	return qp;
	
}
public CourseEnrollment()
{
	
	boolean valid=true;
	Validator validate;
	do
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter Course and Code");
	coursecode = keyboard.nextLine();
	System.out.println("Enter grade");
	grade = keyboard.next();
	System.out.println("Enter Credits");
	credits=keyboard.nextInt();
	setQualitypoints(qualitypoints());
	setQualityscore(getQualitypoints()*credits);
	validate = new Validator(grade, credits);
	
	
	
	}while(validate.isValid()==false);
}
public CourseEnrollment(int i)
{
	
	coursecode = null;
	grade=null;
	credits=0;
}



}
