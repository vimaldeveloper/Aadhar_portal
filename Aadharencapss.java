package Applications;

import java.util.Scanner;

public class Aadharencapss {

   
		static Scanner s=new Scanner(System.in);
		//states
		private String name;
		private long Aadharnum;
		private long Contact;
		private String Dob;
		//const
		private Aadharencapss(){
		}

		public Aadharencapss(String name,long Contact,long Aadharnum,String Dob){
			//L.I
			this.name=name;
			this.Contact=Contact;
			this.Aadharnum=Aadharnum;
			this.Dob=Dob;
			
		}
		//Helper Method
		public String getName(){
		
			return name;
		}
		public long getNum(){
		
			return this.Aadharnum;
		}
		public long getContact(){
		
			return Contact;
		}
		public String getDob(){
		
			return Dob;
		}
		
		//verification
		public boolean verify(long Contact){
			//do the Verification based on Contact
			System.out.println("Enter your register mobile number for verification");
			long user_contact=s.nextLong();//asking to enter existing contact
			if(this.Contact==user_contact){
				//Matching with records
				System.out.println("Enter The OTP");
				int sys_otp=otp();
				System.out.println(sys_otp);
				int user_otp=s.nextInt();
				if(sys_otp==user_otp){
					//Verification succesfull
					System.out.println("Verification Succesfull");
					System.out.println("YOUR RESPONSE WILL BE SUCESSFULLY CHANGED...");
					System.out.println("YOUR UPDATED NEW \"Aadhar\"DETAILS SHOWED BELOW........");
					return true;
				}
				
			}

			return false;
		}
		//setter Method
		public void setName(String name){
			if(verify(getContact())){
				this.Dob=Dob;}else {
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
		
		public void setDob(String Dob){
			//verification
			if(verify(getContact())){
				this.Dob=Dob;
			}else {
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
		public void setContact(long Contact){
			//verification
			if(verify(getContact())){
				this.Contact=Contact;
			}else {
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
		//OTP Feature
		public int otp(){
			double res=Math.random()*9999+9999;
			return (int)res;
		}
		public void setNameandDob(String name,String Dob){
			//verification
			if(verify(getContact())){
				this.name=name;
				this.Dob=Dob;
			}else{
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
		public void setNameandDobandContact(String name,String Dob,long Contact){
			//verification
			if(verify(getContact())){
				this.name=name;
				this.Dob=Dob;
				this.Contact=Contact;
			}else{
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
		public void setNameandConact(String name,long Contact){
			//verification
			if(verify(getContact())){
				this.name=name;
				this.Contact=Contact;
			}else{
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
		public void setDobandContact(String Dob,long Contact){
			//verification
			if(verify(getContact())){
				this.Dob=Dob;
				this.Contact=Contact;
			
			}else{
				System.out.println("Verification Failed");
				System.out.println("YOUR RESPONSE WILL BE  NOT  CHANGED...");
				System.out.println("YOUR OLD Aadhar DETAILS........");
			}
		}
	}
		
