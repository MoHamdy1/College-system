/*At first we inherited the data members of the class student using the key word “Extends”.

This class to collect the data of the student and this is about the student’s home address fully such as:
- the student’s flat number 
- the student’s house number 
- the postal code of the student city
- the student’s city
- the student’s country 
- the student’s governorate and area he is living at 
- the student’s mailing address */
 

package project_data;

import java.util.Scanner;
//using the key word “extends” to inherit attributes and methods from one class to another
 public class homeAddress extends Students {

	//creating the variables of the class 

	Scanner s=new Scanner(System.in);
	int flatNum;
	int houseNum;
	int postalCode;
	int mailContact=0;
	int mailIncorrect=0;
	String area,city,country,gov,street;

//Making a empty contractor and calling the function super to use it contractor 
	public homeAddress(){
		super();
		setMail();
		
		
		
	}
	
//A method to take the maling and home address and store it and a while loop to make sure the data entered is correct
	public void setMail(){
	  String z="";
      while ( mailContact != 1|| mailIncorrect !=1){
      System.out.println("HOME ADDRESS");
      System.out.println("Enter flat number: ");
      flatNum = s.nextInt();
      System.out.println("Enter house number: ");
      houseNum = s.nextInt();
      System.out.println("Enter street name: ");
      street = s.next();
      System.out.println("Enter area name: ");
      area = s.next();
      System.out.println("Enter city name: ");
      city = s.next();
      System.out.println("Enter governate name: ");
      gov = s.next();
      System.out.println("Enter country name: ");
      country = s.next();
      System.out.println("Enter postal code: ");
      postalCode = s.nextInt();
      System.out.println("MAILING ADDRESS");
      boolean c1=false,c2=false;
      while(c1==false) {
    	  System.out.println("Is the entered address correct as number ? (input  1)yes or  0)no)");
    	  	int holder10=s.nextInt();
      if(holder10==1 || holder10==0) {
    	  mailIncorrect=holder10;
    	  c1=true;
      }else System.out.println("please enter valid input ");
     }while(c2==false) {
      System.out.println("Is your mailing address the same as your home address"
      		+ " as number? (input  1)yes or  0)no)");
      int holder11=s.nextInt();
      if(holder11 == 1 || holder11== 0 ) {
    	  mailContact=holder11;
    	  c2=true;
      }else System.out.println("please enter valid input ");
     }
      if (mailIncorrect != 1){
          System.out.println("Please enter the correct address!");
         
      }else if (mailContact != 1){
          System.out.println("Please enter the  mailing address!");
         
      }
      }
      
		
		
	}

	@Override
// a to string method to display the data for the user 
	public String toString() {
		return  super.toString()+" "+"homeAddress ["+ " flatNum=" + flatNum + ", houseNum="
				+ houseNum + ", postalCode=" + postalCode +", area="
				+ area + ", city=" + city + ", country=" + country + ", gov="
				+ gov + ", street=" + street + "]";
	}

}