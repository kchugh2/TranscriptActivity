package newpackage;

import java.text.NumberFormat;
import java.util.*;

public class Transcript {
ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
private String cont="y";
Scanner keyboard = new Scanner(System.in);

public void addCourse()
{
	CourseEnrollment course = new CourseEnrollment();
	courses.add(course);
}

public ArrayList<CourseEnrollment> getCourses()
{
	return courses;
	
}
public double getOverallGPA()
{
	double sum=0;
	double credsum = 0;
	CourseEnrollment c= new CourseEnrollment(2);
	
	for(int i = 0 ; i < courses.size(); i++)
	{
		c = courses.get(i);
		sum = sum+=c.getQualityscore();
		//System.out.println(sum);
	}
	for(int i = 0 ; i < courses.size(); i++)
	{
		c = courses.get(i);
		credsum = credsum+=c.getCredits();
		
	}
	
	return (sum/credsum);
	
}
public String getFormattedGPA(double GPA)
{
	NumberFormat gpa= NumberFormat.getNumberInstance();
	gpa.setMaximumFractionDigits(2);	
	return gpa.format(GPA);
}

public void displayTranscript()
{
	CourseEnrollment c= new CourseEnrollment(2);
	System.out.println("Course\tGrade\tCredits\tQuality Points\tQuality Score\n-------------------------------------------------------\n");
	
	for(int i = 0; i < courses.size(); i++)
	{
		c = courses.get(i);
		System.out.println(c.getCoursecode()+"\t"+c.getGrade()+"\t"+c.getCredits()+"\t\t"+c.getQualitypoints()+"\t\t"+c.getQualityscore()+"\n\n");
	}
	System.out.println("GPA\t:\t"+getFormattedGPA(getOverallGPA()));
}
public Transcript()
{
	do 
	{
		addCourse();
		System.out.println("Do you wish to add more classes? [y/n]");
		cont = keyboard.nextLine();
	} while(cont.equals("y"));
	
	displayTranscript();
	
}
}
