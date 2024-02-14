//This class store all the courses names and their lecturer and methods to display the current courses and taking courses and  another method to calculate GPA and CGPA  
package project_data;

//creating the variables of the class

import java.awt.List;
import java.util.*;
import java.util.concurrent.*;
import java.lang.*;


public class courses extends homeAddress {
	int Term;
	int level ;
	public Date Datecreated=new Date();
	 static Calendar calendar = Calendar.getInstance();
	 static int studentNum=0;
	 String ID;
	double gpa;
	int Try;
	double Cgpa ;
	double grade[]=new double[100];
	double gradeper[]=new double[100];
	double CGPA []=new double[100];
	transaction t1;
//a scanner to take the input from the user 	
Scanner sc = new Scanner(System.in);
	
//Default contractor to call it in the main and use the class methods .
	public courses(){
		setTerm();
		
		 this.ID= calendar.get(Calendar.YEAR)+""+this.Term+""+25+""+"0"+1+""+studentNum;
   	        System.out.println("Your ID is = "+ID);
	        t1 = new transaction();
   	        studentNum++;


        System.out.println("To display your GPA, Enter (1). To Display your Cumulative GPA, Enter (2).To Display the two ,Enter (3) To Continue, Enter (0)");
        int display=sc.nextInt();
       //a while loop to ask the user wether he wants to calculate his GPA , CGPA  or not 
boolean t=false;
        while(t==false) {
        if(display==1) {
        	SetGPA();
        	t=true;
        }else if(display == 2) {
        		SetCGpa();
        		t=true;
        	}else if(display ==0) {
        	break;
        }else System.out.println("Please enter either (1) or (2) or (0). ");
        }
        
        
}



//A print method to display course code and name 
	
	public void print(int beg,int fin ) {
		for(int i=beg ;i<=fin;i++) {
			System.out.println("Course name :"+courses[i][0]);
			System.out.println("Course code :"+courses [i][1]);
			System.out.println("-----------------------");

		}
		}

	


 //A method to ask the student for the current term 

	public void setTerm(){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your current term :");
		this.Term=sc.nextInt();
		switch(this.Term){
		case 1:
			System.out.println("The current Courses :");
			print(0,5);
			this.level=1;
			break;
		case 2:
			System.out.println("The taken courses:");
			print(0,5);
			System.out.println("---------");
			System.out.println("The current courses :");
			print(6,11);
			System.out.println("---------");
			this.level=1;

			break;
		case 3:
			System.out.println("The taken courses :");
			print(0,11);
			System.out.println("----------");
			System.out.println("The current courses: ");
			print(12,17);
			System.out.println("----------");
			this.level=2;

			break;
		case 4:
			System.out.println("The taken courses :");
			print(0,17);
			System.out.println("----------");
			System.out.println("The current courses: ");
			print(18,23);
			System.out.println("----------");
			this.level=2;

			break;
		case 5:
			System.out.println("The taken courses :");
			print(0,23);
			System.out.println("----------");
			System.out.println("The current courses: ");
			print(24,29);
			System.out.println("----------");
			this.level=3;

			break;
		case 6:
			System.out.println("The taken courses :");
			print(0,29);
			System.out.println("----------");
			System.out.println("The current courses: ");
			print(30,35);
			System.out.println("----------");
			this.level=3;

			break;
		case 7:
			System.out.println("The taken courses :");
			print(0,35);
			System.out.println("----------");
			System.out.println("The current courses: ");
			print(36,41);
			System.out.println("----------");
			this.level=4;

			break;
		case 8:
			System.out.println("The taken courses :");
			print(0,41);
			System.out.println("----------");
			System.out.println("The current courses: ");
			print(42,47);
			System.out.println("----------");
			this.level=4;

			break;
			
		}
		
	}
//A method to calculate the GPA of the student 

public void SetGPA() {
	Scanner sc=new Scanner(System.in);
	switch(this.Term) {
	
	case 1:
		Setcourse(0,6);
		convertGPA(0,6);
		calculateGpa(0,6);
		break;
	case 2:
		Setcourse(6,12);
		convertGPA(6,12);
		calculateGpa(6,12);
		break;
	case 3:
		Setcourse(12,18);
		convertGPA(12,18);
		calculateGpa(12,18);
		break;
	case 4:
		Setcourse(18,24);
		convertGPA(18,24);
		calculateGpa(18,24);
		break;
	case 5:
		Setcourse(24,30);
		convertGPA(24,30);
		calculateGpa(24,30);
		break;
	case 6:
		Setcourse(30,36);
		convertGPA(30,36);
		calculateGpa(30,36);
		break;
	case 7:
		Setcourse(36,41);
		convertGPA(36,41);
		calculateGpa(36,41);
		break;
	case 8:
		Setcourse(41,47);
		convertGPA(41,47);
		calculateGpa(41,47);
	}
	}


//a switch statement to calculate the current GPA after knowing the current term of the student 

	public void SetCGpa() {
		
		switch(this.Term) {
		
		case 1:
			Setcourse(0,6);
			convertGPA(0,6);
			calcuateCGPA(0,6);
			break;
		case 2:
			Setcourse(0,12);
			convertGPA(0,12);
			calcuateCGPA(0,12);
			break;
		case 3:
			Setcourse(0,18);
			convertGPA(0,18);
			calcuateCGPA(0,18);
			break;
		case 4:
			Setcourse(0,24);
			convertGPA(0,24);
			calcuateCGPA(0,24);
			break;
		case 5:
			Setcourse(0,30);
			convertGPA(0,30);
			calcuateCGPA(0,30);
			break;
		case 6:
			Setcourse(0,36);
			convertGPA(0,36);
			calcuateCGPA(0,36);
			break;
		case 7:
			Setcourse(0,41);
			convertGPA(0,41);
			calcuateCGPA(0,41);
			break;
		case 8:
			Setcourse(0,47);
			convertGPA(0,47);
			calcuateCGPA(0,47);
		}
		
		
	}
	
	
	//A method to calculate the CGPA of the student  
public void calcuateCGPA(int B,int E)
 {
//This for loop to calculate the CGPA it takes the sum the GPA and divide it by the number of terms.
	for(int i=0;i<E;i++) {
		this.Cgpa +=((gradeper[i])/E);
	}if(this.Cgpa>4) {
		this.Cgpa=Math.floor(this.Cgpa);}
	System.out.println("Your Cumulative GPA is :" + this.Cgpa);
}

	//This method is to ask the user to enter the score of the course to calculate the GPA
	public void Setcourse(int B,int E) {
		for(int j=B;j<E;j++) {
			System.out.println("Enter the score out of (100) for this course "+courses[j][0]+":");
			grade[j]=sc.nextDouble();
	}
	
	}
	
	
	
	
	// this method to convert the score of the total courses to a degree of GPA out of four.
	public void convertGPA(int B,int E) {
		for(int j=B;j<E;j++) {
			if(grade[j]>=90 && grade[j]<=100) {
				gradeper[j]=4.000;
			}else if(grade[j]>=85 && grade[j]<90) {
				gradeper[j]=3.6666;
			}else if(grade[j]>=80 && grade[j]<85) {
				gradeper[j]=3.3333;
			}else if(grade[j]>=75 && grade[j]<80) {
				gradeper[j]=3.0000;
			}else if(grade[j]>=70 && grade[j]<75) {
				gradeper[j]=2.6666;
			}else if(grade[j]>=65 && grade[j]<70) {
				gradeper[j]=2.3333;
			}else if(grade[j]>=60 && grade[j]<65) {
				gradeper[j]=2.000;
			}else if(grade[j]>=56 && grade[j]<60) {
				gradeper[j]=1.6666;
			}else if(grade[j]>=53 && grade[j]<56) {
				gradeper[j]=1.3333;
			}else if(grade[j]>=50 && grade[j]<53) {
				gradeper[j]=1.00000;
			}else if(grade[j]>=0 && grade[j]<50) {
				gradeper[j]=0;
			}
			
	}


	
	}

	public void calculateGpa(int B,int E) {
		for(int i=B;i<E;i++) {
			this.gpa +=(gradeper[i]*3)/17;
			
		}
		if(this.gpa>4) {
			this.gpa=Math.floor(this.gpa);}
		System.out.println("Your GPA is :" + this.gpa);
	}

	//This method to display the term of the student 
public int getTerm() {
		return this.Term;
	}
// this method to display the id of the student 
	public String getID() {
		return ID;
	}
// this method to set the id of the user 
	public void setID(String iD) {
		ID = iD;
	}
	@Override
// this method is to display the data for the student 
	public String toString() {
		
		return super.toString()+" "+ t1.toString() +" " +"Current Term=" + Term + ", Current level=" + level +  ", Your ID=" + ID + ", Current Term GPA="
				+ gpa +  ", Your Cumulative  GPA=" + Cgpa + "]";
	}
	String [][] courses=new String[100][9];{
		
		/*
		* course name
		*/
			courses[0][0]="Linear Agebra ";				
			courses[1][0]="Calculuse ";
			courses[2][0]="Computer Science ";
			courses[3][0]="Programming 1 ";
			courses[4][0]="Data science ";
			courses[5][0]="Ciritcal thinking ";
		//term 1
			courses[6][0]="Probability 1 ";
			courses[7][0]="Discrete Math ";
			courses[8][0]="Data Structure ";
			courses[9][0]="Artificial Intelligence ";
			courses[10][0]="Programming 2 ";
			courses[11][0]="Innovation ";
		//term 2
			courses[12][0]="Probability 2 ";
			courses[13][0]="Database ";
			courses[14][0]="Numerical Computation ";
			courses[15][0]="Advanced Calculuse ";
			courses[16][0]="Data Science Methodolgy ";
			courses[17][0]="Convex Optimization ";
		//term 3
			courses[18][0]=" Cloud Computing ";
			courses[19][0]=" Machine Learning";
			courses[20][0]=" Data Mining";
			courses[21][0]=" Data Science Tools and Software  ";
			courses[22][0]=" Regression Analysis";
			courses[23][0]=" Non-Linear and Combination ";
		//term 4
			courses[24][0]=" Stochastic Processes";
			courses[25][0]=" Design and Analysis of Expermint";
			courses[26][0]=" Data Visualization Tools";
			courses[27][0]=" Multivariant Statistical ";
			courses[28][0]=" Bayesian Statistics";
			courses[29][0]=" Data Compression";
		//term 5
			courses[30][0]=" Data Computation and Analysis";	
			courses[31][0]=" Survey Methodolgy";	
			courses[32][0]=" Computing Intensive ";	
			courses[33][0]=" Computer Network";	
			courses[34][0]=" Algorithm Design";	
			courses[35][0]=" Mobile Programming"; 
		//term6
			courses[36][0]=" Big Data Analysis";	
			courses[37][0]=" Introduction to Social Network  ";	
			courses[38][0]=" Simulation";	
			courses[39][0]=" Project 1";	
			courses[40][0]=" Web Programming";	
			courses[41][0]=" Operation System ";	
		//term 7
			courses[42][0]=" Social Aata Analysis ";	
			courses[43][0]=" Distibution Data Analysis";	
			courses[44][0]=" Stream Processing";	
			courses[45][0]=" Project 2";	
			courses[46][0]=" Ddvanced Database";	
			courses[47][0]=" Concurrent Database ";		
		//term 8
			
		/*
		 * course codes
		 */
					courses [0][1] ="022400101";
					courses [1][1] ="022400102";
					courses [2][1] ="022400103";
					courses [3][1] ="022400104";
					courses [4][1] ="022400105";
					courses [5][1] ="0200001";
		//term 1
					courses [6][1] ="022400106";
					courses [7][1] ="022400107";
					courses [8][1] ="022400108";
					courses [9][1] ="022400109";
					courses [10][1] ="022400110";
					courses [11][1] ="0200002";
		//term 2
					courses [12][1] ="022400201";
					courses [13][1] ="022400202";
					courses [14][1] ="022400203";
					courses [15][1] ="022401201";
					courses [16][1] ="022401202";
					courses [17][1] ="0200003";
		//term 3
					courses [18][1] ="022400204";
					courses [19][1] ="022400205";
					courses [20][1] ="022400206";
					courses [21][1] ="022401203";
					courses [22][1] ="022401204";
					courses [23][1] ="0200004";
		//term 4
					courses [24][1] ="022401301";
					courses [25][1] ="022401302";
					courses [26][1] ="022401303";
					courses [27][1] ="0200005";
					courses [28][1] ="0200006";
					courses [29][1] ="0200007";
		//term 5
					courses [30][1] ="02241304";
					courses [31][1] ="02241305";
					courses [32][1] ="02241306";
					courses [33][1] ="0200008";
					courses [34][1] ="0200009";
					courses [35][1] ="0200010";
		//term 6
					courses [36][1] ="022401401";
					courses [37][1] ="022401402";
					courses [38][1] ="022401403";
					courses [39][1] ="022401404";
					courses [40][1] ="0200011";
					courses [41][1] ="0200012";
		//term 7
					courses [42][1] ="022401405";
					courses [43][1] ="022401406";
					courses [44][1] ="022401407";
					courses [45][1] ="022401408";
					courses [46][1] ="0200013";
					courses [47][1] ="0200014";
		//term 8
					/*
					 * course lecturer
					 */
					courses [0][2] ="Dr.Ahmed";
					courses [1][2] ="Dr.Wael";
					courses [2][2] ="Dr.Mahmoud";
					courses [3][2] ="Dr.Mohamed";
					courses [4][2] ="Dr.Safy";
					courses [5][2] ="Dr.Aya";
		//term 1
					courses [6][2] ="Dr.Hesham";
					courses [7][2] ="Dr.Ayman";
					courses [8][2] ="Dr.Sohaila";
					courses [9][2] ="Dr.Farah";
					courses [10][2] ="Dr.Hamdy";
					courses [11][2] ="Dr.Rawan";
		//term 2
					courses [12][2] ="Dr.Sara";
					courses [13][2] ="Dr.Ibrahim";
					courses [14][2] ="Dr.Farid";
					courses [15][2] ="Dr.Fatma";
					courses [16][2] ="Dr.Hassan";
					courses [17][2] ="Dr.Fathy";
		//term 3
					courses [18][2] ="Dr.Tamer";	
					courses [19][2] ="Dr.Dania";	
					courses [20][2] ="Dr.Shereen";	
					courses [21][2] ="Dr.Ammar";	
					courses [22][2] ="Dr.Amr";	
					courses [23][2] ="Dr.Nour";	
		//term 4
					courses [24][2] ="Dr.Mirna";	
					courses [25][2] ="Dr.Alaa";	
					courses [26][2] ="Dr.Aly";	
					courses [27][2] ="Dr.Mansour";	
					courses [28][2] ="Dr.Elsayed";	
					courses [29][2] ="Dr.Tablia";
		//term 5
					courses [30][2] ="Dr.Yasmmen";	
					courses [31][2] ="Dr.Shreef";	
					courses [32][2] ="Dr.Mazen";	
					courses [33][2] ="Dr.Yassen";	
					courses [34][2] ="Dr.Mohaned";	
					courses [35][2] ="Dr.Shady";	
		//term 6
					courses [36][2] ="Dr.Gehad";	
					courses [37][2] ="Dr.Gehan";	
					courses [38][2] ="Dr.Abeer";	
					courses [39][2] ="Dr.Hanaah";	
					courses [40][2] ="Dr.Samir";	
					courses [41][2] ="Dr.John";	
		//term 7
					courses [42][2] ="Dr.Kareem";	
					courses [43][2] ="Dr.Ziad";	
					courses [44][2] ="Dr.Sroor";	
					courses [45][2] ="Dr.Gamel";	
					courses [46][2] ="Dr.Amira";	
					courses [47][2] ="Dr.Fares";	
		//term 8
					
					
				
					
					
			}
	
	
	
	}