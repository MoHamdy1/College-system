/*This class is to store the payment
 of the student regarding the collage.
Every student can check their payment history and see how much they paid just by knowing their current term.*/


package project_data;
/**
 * 
 */


import java.sql.Date;
import java.util.Scanner;

public class transaction {
//the creation of the variables  
	int Term;
	Date dateTran;
	public String type;
	int NumberOfPayment;
	double amountOFpayment;
	String BankName;
	Scanner sc=new Scanner(System.in);

	
	//This contractor to create an object of transaction to store information of the student  
	public transaction() {
		typeOFpayment();
		numberOfPayment();
		amountOfPayment();
	}
	
	
	
	//This method to ask the user which type of payment he is going to choose and  a while loop to make sure the data entered is correct 
	public void typeOFpayment() {
		boolean check=false;
		System.out.println("Enter the type of payment for self-funded enter (1) for grant_funded enter (2) :");
		int holder2=sc.nextInt();
		while(check==false) {
			if(holder2==1 ) {
				this.type="self-funded";
				check=true;
			}else if(holder2==2) {
				this.type="grant-funded";
				check=true;
			}else {
				System.out.println("enter a valid input");
				
			}
		}
	}
	//This method calculate the number of successful payment so far based on the current term of the student.

	public void numberOfPayment() {
		System.out.println("enter your current Term :");
		this.Term=sc.nextInt();
		NumberOfPayment= (int) Math.ceil(((double) Term/2));
		
		System.out.println("the number of payment :"+NumberOfPayment);
		
	}
	//This method is to calculate the amount of payment by the student based on his current term 
	public void amountOfPayment() {
		this.amountOFpayment=NumberOfPayment*3200;
		
		System.out.println("the amount of payment is  "+amountOFpayment);
		
		
		
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "transaction [Term=" + Term + ", dateTran=" + dateTran
				+ ", type=" + type + ", NumberOfPayment=" + NumberOfPayment
				+ ", amountOFpayment=" + amountOFpayment + ", BankName="
				+ BankName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}