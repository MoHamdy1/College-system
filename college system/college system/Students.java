/*This class is to collect and store the data and personal information of the student which are : 
-	The student’s  first , middle and last name
-	The student’s gender
-	The student’s identification number 
-	The student’s nationality 
-	The student’s number and passport id 
And also calculate his birthday based on the data he enters*/

  /**
 * 
 */

package project_data;

//the variables of the class student  
import java.util.*;
	public class Students {
		//intialize all variable we need
	 String Firstname;
	  String Middlename;
	  String Lastname;
	  static long ID=20222250100L;
	  String Nationality;
	  Date Datecreated=new Date();
	 long NationalID;
	  long PassportID;
	  long TelephoneNum;
	  long mobileNum;
	  String Email;
	String Gender;
	  int BDay,BMonth,BYear;
	 Scanner sc=new Scanner(System.in);
	 
	 
	 //default constructor
	 public Students() {
		 	setName();
		 	setGender();
		  	setNationality();
		  	setContact();
		  	setBirthDay();
		  	 new Date();
		  	 ID++;
		   
	 }

	 /*the function take the full name from the user
And the while loop to make sure that the user enters the data.*/
	 public void setName(){
		 boolean N1=false,N2=false,N3=false;
         while(N1==false ||N2==false||N3==false) {
             System.out.println("PERSONAL INFO");
             System.out.println("Enter first name: ");
             Firstname = sc.nextLine();
             if (!(Firstname.isEmpty())) {
                 N1 = true;
             }
             System.out.println("Enter middle name: ");
             Middlename = sc.nextLine();
             if (!(Middlename.isEmpty())) {
                 N2 = true;
             }
             System.out.println("Enter surname: ");
             Lastname = sc.nextLine();
             if (!(Lastname.isEmpty())) {
                 N3 = true;
             }
             if (N1==false){
                 System.out.println("First name is required");
             }
             else if  (N2 == false){
                 System.out.println("Middle name is required");
             }
             else if  (N3 == false){
                 System.out.println("Surname is required");
             }
             
         }
	 }
	/*A method to store the gender of the student 
If the student a male, then enters “1” and a “2” if a female*/

	 public void setGender(){
		 boolean g1=false,g2=false;
		 while (g1==false && g2==false) {
		 System.out.println("Enter 1 for male & 2 for female :");
		  	int holder = sc.nextInt();
		  	if(holder ==1){
		  		this.Gender="Male";
			  	g1=true;
			  		
		  	}else if(holder ==2){
		  		this.Gender="female";
			  	g2=true;

		  	}else {
		  		System.out.println("Sorry wrong input enter 1 for male & 2 for female :");
		  	}
	 }
		 }

	/*function to know the nationality of student and the student is egyptian then he had to insert national 
	 id else enter the passport id
	 */
/*This method to store the nationality of the student 
And a scanner function to take the input of the user */
	public void setNationality() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Nationality ");
		String holder2 = sc.next();
		if(holder2.toUpperCase().equals("EGYPTIAN")) {
			boolean T1 = false;
			  this.Nationality = Nationality;
		while(T1 == false) {
//asking the user to input their national id and making an if statement to get the correct number which is 14. 
			System.out.println("Please, enter the national ID: ");
			long holder = sc.nextLong();
			if (holder >= 9999999999999L && holder <= 10000000000000000L ) {
				NationalID = holder;
				T1 = true;
			}else {
				System.out.println("Make sure the National ID is 14 number!");
			}
		 }
		}else {
			boolean T1 = false;
			  this.Nationality = Nationality;
		while(T1 == false) {
//asking the user to input their passport id and an if statement to make sure the id enterd is correct (8 numbers)
			System.out.println("Please, enter the Passport ID: ");
			long holder = sc.nextLong();
			if (holder >= 9999999L && holder <= 100000000L ) {
				PassportID = holder;
				T1 = true;
			}else {
				System.out.println("Make sure the Passport ID is 8 number without any letters!");
			}
		}
		
	}
	}
	// this method to take the phone number from the student and an while loop to make sure the phone number is correct (12 digit)
	public void setContact() {
		boolean tele=false;
		Scanner sc=new Scanner(System.in);
		while (tele==false) {
		System.out.println("Enter your telephone number :");
		long holderphnum=sc.nextLong();;
		if(holderphnum>=9999999999L && holderphnum<=100000000000L) {
			this.TelephoneNum=holderphnum;
			tele=true;
		}else System.out.println("please enter correct phone number ");
		}
		
	
	
	}

	 //a method to set birth date and calculate age of student
	public void setBirthDay(){
		boolean bd= false,bm=false,by=false;
		while (bd==false) {
		System.out.println("enter the day of birth  :");
		int holderBirthDay=sc.nextInt();
		if(holderBirthDay >=1 && holderBirthDay <=31){
			this.BDay=holderBirthDay;
			bd=true;
		}else {System.out.println("wrong day !");}
		}
		while(bm==false) {
		System.out.println("enter the month of birth :");
		int holderBirthmonth=sc.nextInt();
		if(holderBirthmonth >=1 && holderBirthmonth <=12){
			this.BMonth=holderBirthmonth;
			bm=true;
		}else {System.out.println("wrong month !");}
		}
		while(by==false) {
		System.out.println("enter the year of birth :");
		int holderBirthyear=sc.nextInt();
		if(holderBirthyear >=1980 && holderBirthyear <= 2022){
			this.BYear=holderBirthyear;
				by=true;
		}else {System.out.println("wrong year !");}
		}
		Calendar calendar = Calendar.getInstance();
		 calendar.setTime(Datecreated);
		System.out.println("your age is :"+(calendar.get(Calendar.YEAR)-this.BYear));
		
	}

	@Override
// this method is to display all the data for the user  
	public String toString() {
		return "Students [Firstname=" + Firstname + ", Middlename="
				+ Middlename + ", Lastname=" + Lastname + ", Datecreated=" + Datecreated
				+ ", NationalID=" + NationalID + ", PassportID=" + PassportID
				+ ", TelephoneNum=" + TelephoneNum + ", Gender=" + Gender + ", BDay=" + BDay
				+ ", BMonth=" + BMonth + ", BYear=" + BYear ;
	}
//Setters and Getters to access in other classes
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return Firstname;
	}
	/**
	 * @return the middlename
	 */	
	public String getMiddlename() {
		return Middlename;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return Lastname;
	}


	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return Nationality;
	}
	/**
	 * @return the datecreated
	 */
	public Date getDatecreated() {
		return Datecreated;
	}
	/**
	 * @return the nationalID
	 */
	public long getNationalID() {
		return NationalID;
	}
	/**
	 * @return the passportID
	 */
	public long getPassportID() {
		return PassportID;
	}
	/**
	 * @return the telephoneNum
	 */
	public long getTelephoneNum() {
		return TelephoneNum;
	}
	/**
	 * @return the mobileNum
	 */
	public long getMobileNum() {
		return mobileNum;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @return the bDay
	 */
	public int getBDay() {
		return BDay;
	}
	/**
	 * @return the bMonth
	 */
	public int getBMonth() {
		return BMonth;
	}
	/**
	 * @return the bYear
	 */
	public int getBYear() {
		return BYear;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	/**
	 * @param middlename the middlename to set
	 */
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	/**
	 * @param iD the iD to set
	 */
	public static void setID(int iD) {
		ID = iD;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	/**
	 * @param datecreated the datecreated to set
	 */
	public void setDatecreated(Date datecreated) {
		Datecreated = datecreated;
	}
	/**
	 * @param nationalID the nationalID to set
	 */
	public void setNationalID(long nationalID) {
		NationalID = nationalID;
	}
	/**
	 * @param passportID the passportID to set
	 */
	public void setPassportID(long passportID) {
		PassportID = passportID;
	}
	/**
	 * @param telephoneNum the telephoneNum to set
	 */
	public void setTelephoneNum(int telephoneNum) {
		TelephoneNum = telephoneNum;
	}
	/**
	 * @param mobileNum the mobileNum to set
	 */
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @param bDay the bDay to set
	 */
	public void setBDay(int bDay) {
		BDay = bDay;
	}
	/**
	 * @param bMonth the bMonth to set
	 */
	public void setBMonth(int bMonth) {
		BMonth = bMonth;
	}
	/**
	 * @param bYear the bYear to set
	 */
	public void setBYear(int bYear) {
		BYear = bYear;
	}
	 
	}