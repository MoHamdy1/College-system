package project_data;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class main {
static  int i;
	public static void main(String[] args) throws IOException {
            
            
		System.out.println("Welcome to the registeration system!(Demo)");
		courses Student;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("To Sign Up, Enter 1.");
			System.out.println("To check your information, Enter 2.");
			System.out.println("To Exit, Enter 3.");
			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				 Student = new courses();
				  String fileName="name"+i+".txt";
				  new File(fileName).createNewFile();
					  PrintStream student =new PrintStream(fileName);
					  student.println(Student.toString());
					  student.println();
					  i++;
					  student.close();
				 break;
			case 2:
				System.out.println("Please, Enter your ID number(Reigsteration Number):");
				String ID = sc.next();
				char last= ID.charAt(9);
				String FILEName="name"+last+".txt";
				File file=new File(FILEName);
				Scanner myReader = new Scanner(file);
				while(myReader.hasNextLine()) {
					String data=myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
				break;
			case 3:
				i++;
			    System.exit(0);
			    break;

			}
			
		
		
		}
	} 
	
}