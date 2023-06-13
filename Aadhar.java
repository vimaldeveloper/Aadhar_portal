package Applications;
import java.util.*;
public class Aadhar {
  static Scanner s=new Scanner(System.in);
  static int t;
  private static String password="TABR2000";
  private static String password1="BHAR2000";
  private static String password2="SIVA2001";
  private static String password3="PART2001";
  private static String password4="KRIS1999";
	    public static void main(String[] args) {
	    	
	    	System.out.println("\t\t\"WELCOME TO INDIAN ADHAR ONLINE PORTAL\"");
	    	System.out.println("\t\t(\"Read The Instructions Carefully Before You Enter\") ");
	    	System.out.println();
	    	System.out.println("\t\t\t<<<<<<<<INSTRUCTIONS>>>>>>>>");
	    	System.out.println("***************************************************************************************");
	    	System.out.println("NOTE:THE PASSWORD TYPE IS \"E.g:ABCD2001\"");
	    	System.out.println("NOTE:IT IS A GLOBAL PASSWORD METHOD YOU CAN'T CHANGE IT");
	    	System.out.println("NOTE:YOUR NAME FIRST FOUR LETTERS IN CAPS AND ENTER YOUR BIRTH YEAR ONLY:YYYY,");
	    	System.out.println("***************************************************************************************");
	    	System.out.println("PLEASE ENTER YOUR PASSWORD TO ACCESS YOUR \"Aadhar Card\"");
	      // s.nextLine();  
	    	String pass=s.nextLine();
	    	switch (pass) {
			case "TABR2000": { 
				              System.out.println("\"SELECT YOUR PURPOSE TO Aadhar PORTAL\"");
				              System.out.println("1.Download Aadhar\n2.Edit Your Details\n3.Exit");
				              int in=s.nextInt();
				              switch (in) {
							case 1: {
								
								 Aadharencapss a=new Aadharencapss("Tabrez",9876543201l,897654321902l,"08/09/2000");
									System.out.println("\t\"Aadhar Card\"");
									System.out.println(" Your Name    :"+a.getName());
									System.out.println("Aadhar Number :"+a.getNum());
									System.out.println("mobile Num    :"+a.getContact());
									System.out.println("D-O-Birth     :"+a.getDob());
									System.out.println("\tTHANK YOU\3\3\3");
							break;}
                           case 2: {
                        	   Aadharencapss a=new Aadharencapss("Tabrez",9876543201l,897654321902l,"08/09/2000");
                        	   edit(a.getName(),a.getContact(),a.getNum(),a.getDob());
                        	   
							break;}
							default:
								System.out.println("\"Thank You!!!\"");
							}
				      
			
			break;}
			case "BHAR2000": {
				System.out.println("\"SELECT YOUR PURPOSE TO Aadhar PORTAL\"");
	              System.out.println("1.Download Aadhar\n2.Edit Your Details\n3.Exit");
	              int in=s.nextInt();
	              switch (in) {
				case 1: {
					
					 Aadharencapss a=new Aadharencapss("Bharath",9876543202l,90785456789l,"07/09/2000");
						System.out.println("\t\"Aadhar Card\"");
						System.out.println(" Your Name    :"+a.getName());
						System.out.println("Aadhar Number :"+a.getNum());
						System.out.println("mobile Num    :"+a.getContact());
						System.out.println("D-O-Birth     :"+a.getDob());
						System.out.println("\tTHANK YOU\3\3\3");
				break;}
             case 2: {
            	 Aadharencapss a=new Aadharencapss("Bharath",9876543202l,90785456789l,"07/09/2000");
            	 edit(a.getName(),a.getContact(),a.getNum(),a.getDob());
          	   
				break;}
				default:
					System.out.println("\"Thank You!!!\"");
				}
				
				
			break;}
			case "SIVA2001": {
				System.out.println("\"SELECT YOUR PURPOSE TO Aadhar PORTAL\"");
	              System.out.println("1.Download Aadhar\n2.Edit Your Details\n3.Exit");
	              int in=s.nextInt();
	              switch (in) {
				case 1: {
					
					 Aadharencapss a=new Aadharencapss("Siva",9876543203l,905634891289l,"08/07/2001");
						System.out.println("\t\"Aadhar Card\"");
						System.out.println(" Your Name    :"+a.getName());
						System.out.println("Aadhar Number :"+a.getNum());
						System.out.println("mobile Num    :"+a.getContact());
						System.out.println("D-O-Birth     :"+a.getDob());
						System.out.println("\tTHANK YOU\3\3\3");
				break;}
             case 2: {
            	 Aadharencapss a=new Aadharencapss("Siva",9876543203l,905634891289l,"08/07/2001");
            	 edit(a.getName(),a.getContact(),a.getNum(),a.getDob());
          	   
				break;}
				default:
					System.out.println("\"Thank You!!!\"");
				}
				
			break;}
			case "PART2001": {
				System.out.println("\"SELECT YOUR PURPOSE TO Aadhar PORTAL\"");
	              System.out.println("1.Download Aadhar\n2.Edit Your Details\n3.Exit");
	              int in=s.nextInt();
	              switch (in) {
				case 1: {
					
					 Aadharencapss a=new Aadharencapss("Partha",9876543204l,903467127894l,"11/12/2001");
						System.out.println("\t\"Aadhar Card\"");
						System.out.println(" Your Name    :"+a.getName());
						System.out.println("Aadhar Number :"+a.getNum());
						System.out.println("mobile Num    :"+a.getContact());
						System.out.println("D-O-Birth     :"+a.getDob());
						System.out.println("\tTHANK YOU\3\3\3");
				break;}
             case 2: {
            	 Aadharencapss a=new Aadharencapss("Partha",9876543204l,903467127894l,"11/12/2001");
            	 edit(a.getName(),a.getContact(),a.getNum(),a.getDob());
          	   
				break;}
				default:
					System.out.println("\"Thank You!!!\"");
				}
				
			break;}
			case "KRIS1999": {
				System.out.println("\"SELECT YOUR PURPOSE TO Aadhar PORTAL\"");
	              System.out.println("1.Download Aadhar\n2.Edit Your Details\n3.Exit");
	              int in=s.nextInt();
	              switch (in) {
				case 1: {
					
					 Aadharencapss a=new Aadharencapss("Krish",9876543205l,897654321785l,"20/04/1999");
						System.out.println("\t\"Aadhar Card\"");
						System.out.println(" Your Name    :"+a.getName());
						System.out.println("Aadhar Number :"+a.getNum());
						System.out.println("mobile Num    :"+a.getContact());
						System.out.println("D-O-Birth     :"+a.getDob());
						System.out.println("\tTHANK YOU\3\3\3");
				break;}
             case 2: {
            	 Aadharencapss a=new Aadharencapss("Krish",9876543205l,897654321785l,"20/04/1999");
          	   edit(a.getName(),a.getContact(),a.getNum(),a.getDob());
          	   
				break;}
				default:
					System.out.println("\"Thank You!!!\"");
				}
				
			break;}
			default:{
				  System.out.println("<<<<<<<<<<<<\"YOUR PASSWORD IS INCORRECT (OR) YOU DON'T HAVE AADHARCARD>>>>>>>>>>>\"");
				  System.out.println();
				  System.out.println("******************************************************************************************************************");
				  System.out.println("NOTE:If You Don't have \"Aadhar card\" Please Visit Your Nearest E-SEVA Office and Open New Aadhar Card");
				  System.out.println("******************************************************************************************************************");
				  System.out.println("IF YOU WANT TO TRY AGAIN PRESS \"1\"");
				  System.out.println("IF YOU WANT TO EXIT PRESS \"2\"");
				  int input=s.nextInt();
				  s.nextLine();
				  switch (input) {
					case 1: {
						Aadhar.main(args);
					
					break;}
					default:{
						System.out.println("\t\t\"Thank You\3\3\3\"");
					}
				  }	
			}
	    }	
	      System.out.println("If You Want again use the Aadhar Portal please Type \"1\"(and) Press \"ENTER\"");
	    	System.out.println("If You  Don't Want again use the Aadhar Portal please Type \"2\"(and) Press \"ENTER\"");
	    	
	    	int ent=s.nextInt();
	    	s.nextLine();
	    	switch (ent) {
			case 1: {
				Aadhar.main(args);
			break;}
			default:{  
				System.out.println("Thank You For using Qsp Aadhar Portal..");
				System.out.println("\t\t\"Visit Again\3\3\3\"");
			break;}
	    }	
				
			
    } 	
  public static void edit(String name,long contact,long Aadharnum,String Dob) {
		  System.out.println("FOR THE CONFIRMATION:");
		System.out.println("1.)IF YOU  EDIT YOUR CONFIRMLY DETAILS PLEASE PRESS \"1\"");
		System.out.println("2.)IF YOU DONT WANT EDIT YOUR DETAILS PLEASE PRESS \"2\"");
		int edit=s.nextInt();

		switch (edit)
		{
		case 1:{ System.out.println("\t\"WELCOME TO INDIAN AADHAR SYSTEM\"");
			System.out.println("WHICH ONE YOU EDIT PLEASE SELECT U WANT....\n1.YOUR NAME\n2.YOUR DOB\n3.YOUR CONTACT\n4.BOTH NAME AND DOB\n5.BOTH NAME AND CONTACT\n6.BOTH DOB AND CONTACT\n7.BOTH NAME AND DOB AND CONTACT\n8.EXIT");
			       int edit1=s.nextInt();
				   switch (edit1)
				   {
				   case 1:{      System.out.println("YOU CHOOSE FOR EDIT YOUR NAME.....");
					             editName(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
										break; }
				  
	                  case 2:{     System.out.println("YOU CHOOSE FOR EDIT YOUR DOB......");
	                             editDob(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);  
				   break;} 
				   case 3:{     System.out.println("YOU CHOOSE FOR EDIT YOUR CONTACT......");
	                             editContact(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);  
				   break;} 
				   case 4:{     System.out.println("YOU CHOOSE FOR EDIT YOUR BOTH NAME AND DOB......");
	                               editNameandDob(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
				   break;}
				   case 5:{     System.out.println("YOU CHOOSE FOR EDIT YOUR BOTH NAME AND CONTACT......");
	                               editNameandContact(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
				   break;}
				   case 6:{     System.out.println("YOU CHOOSE FOR EDIT YOUR BOTH DOB AND CONTACT......");
	                               editDobandContact(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
				   break;}
				   case 7:{     System.out.println("YOU CHOOSE FOR EDIT YOUR ALL DETAILS NAME AND DOB AND CONTACT ......");
	                              editNameandDobandContact(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
				   break;}
				   case 8:{  

					   System.out.println("\t\tTHANK YOU\2\2\2");
					
				   }
				   
				   }
		break;}
		case 2: {
			             System.out.println("IF YOU DON'T WANT EDIT YOUR DETAILS.......");
			             System.out.println("\t\tTHANK YOU\2\2\2");
		} 
		}
	  }
			
		public static void editName(String name,long contact,long Aadharnum,String Dob){
			                     Scanner sc=new Scanner(System.in);
				                 Aadharencapss b=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
					            System.out.println("ENTER YOUR NEW NAME...");
								String Newname=sc.nextLine();
								b.setName(Newname);
								System.out.println("\t\"Aadhar Card\"");
								System.out.println(" Your Name    :"+b.getName());
								System.out.println("Aadhar Number :"+b.getNum());
								System.out.println("mobile Num    :"+b.getContact());
								System.out.println("D-O-Birth     :"+b.getDob());
								System.out.println("\tTHANK YOU\3\3\3");
			
		}
			public  static void editContact(String name,long contact,long Aadharnum,String Dob){
			                     Scanner input=new Scanner(System.in);
			                   Aadharencapss c=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
					            System.out.println("ENTER YOUR NEW Number...");
								long New=input.nextLong();
								c.setContact(New);
								System.out.println("\t\"Aadhar Card\"");
								System.out.println(" Your Name    :"+c.getName());
								System.out.println("Aadhar Number :"+c.getNum());
								System.out.println("mobile Num    :"+c.getContact());
								System.out.println("D-O-Birth     :"+c.getDob());
								System.out.println("\tTHANK YOU\3\3\3");
			
		}
			public static void editDob(String name,long contact,long Aadharnum,String Dob){
			                     Scanner sca=new Scanner(System.in);
								 
			                     Aadharencapss d=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
					            System.out.println("ENTER YOUR NEW DOB...");
								String Newdob=sca.nextLine();
					            d.setDob(Newdob);
					        	System.out.println("\t\"Aadhar Card\"");
								System.out.println(" Your Name    :"+d.getName());
								System.out.println("Aadhar Number :"+d.getNum());
								System.out.println("mobile Num    :"+d.getContact());
								System.out.println("D-O-Birth     :"+d.getDob());
								System.out.println("\tTHANK YOU\3\3\3");
			                  
			
		}      // BOTH OOTIONS
		public static void editNameandDob(String name,long contact,long Aadharnum,String Dob){
			                     Scanner sca=new Scanner(System.in);
								 Scanner sc=new Scanner(System.in);
			                     Aadharencapss e=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
								 System.out.println("ENTER YOUR NEW NAME...");
								String Newname=sc.nextLine();
					            System.out.println("ENTER YOUR NEW DOB...");
								String Newdob=sca.nextLine();
					            e.setNameandDob(Newname,Newdob);
					        	System.out.println("\t\"Aadhar Card\"");
								System.out.println(" Your Name    :"+e.getName());
								System.out.println("Aadhar Number :"+e.getNum());
								System.out.println("mobile Num    :"+e.getContact());
								System.out.println("D-O-Birth     :"+e.getDob());
								System.out.println("\tTHANK YOU\3\3\3");
			
		}
		public static void editNameandContact(String name,long contact,long Aadharnum,String Dob){
			                    Scanner input=new Scanner(System.in);
								 Scanner sc=new Scanner(System.in);
			                     Aadharencapss f=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
								  System.out.println("ENTER YOUR NEW NAME...");
								String Newname=sc.nextLine();
								System.out.println("ENTER YOUR NEW Number...");
								long New=input.nextLong();
			                      f.setNameandConact(Newname,New);
			                  	System.out.println("\t\"Aadhar Card\"");
								System.out.println(" Your Name    :"+f.getName());
								System.out.println("Aadhar Number :"+f.getNum());
								System.out.println("mobile Num    :"+f.getContact());
								System.out.println("D-O-Birth     :"+f.getDob());
								System.out.println("\tTHANK YOU\3\3\3");
			
			
		}
		public static void editDobandContact(String name,long contact,long Aadharnum,String Dob){
			                     Scanner sca=new Scanner(System.in);
								  Scanner input=new Scanner(System.in);
			                     Aadharencapss g=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
					            System.out.println("ENTER YOUR NEW DOB...");
								String Newdob=sca.nextLine();
								System.out.println("ENTER YOUR NEW Number...");
								long New=input.nextLong();
									g.setDobandContact(Newdob,New);						
									System.out.println("\t\"Aadhar Card\"");
									System.out.println(" Your Name    :"+g.getName());
									System.out.println("Aadhar Number :"+g.getNum());
									System.out.println("mobile Num    :"+g.getContact());
									System.out.println("D-O-Birth     :"+g.getDob());
									System.out.println("\tTHANK YOU\3\3\3");
			
			
		}
		public static void editNameandDobandContact(String name,long contact,long Aadharnum,String Dob){
			                     Scanner sca=new Scanner(System.in);
								 Scanner sc=new Scanner(System.in);
								  Scanner input=new Scanner(System.in);
			                     Aadharencapss h=new Aadharencapss(name=name,contact=contact,Aadharnum=Aadharnum,Dob=Dob);
								 System.out.println("ENTER YOUR NEW NAME...");
								String Newname=sc.nextLine();
					            System.out.println("ENTER YOUR NEW DOB...");
								String Newdob=sca.nextLine();
								System.out.println("ENTER YOUR NEW Number...");
								long New=input.nextLong();
								h.setNameandDobandContact(Newname,Newdob,New);
								System.out.println("\t\"Aadhar Card\"");
								System.out.println(" Your Name    :"+h.getName());
								System.out.println("Aadhar Number :"+h.getNum());
								System.out.println("mobile Num    :"+h.getContact());
								System.out.println("D-O-Birth     :"+h.getDob());
								System.out.println("\tTHANK YOU\3\3\3");
			
		}




		
	}











