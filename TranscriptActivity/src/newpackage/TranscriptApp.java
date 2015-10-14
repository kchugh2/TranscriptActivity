package newpackage;
import java.util.Scanner;

import newpackage.Transcript;

public class TranscriptApp {

	public static void main(String[] args)
	{
		String cont = "y";
		Scanner keyboard = new Scanner(System.in);
		do
		{
			Transcript t = new Transcript();
			System.out.println("More Transcripts? [y/n]");
			cont = keyboard.nextLine();
		}while(cont.equals("y"));
	}
}
