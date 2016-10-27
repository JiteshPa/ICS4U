import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * @author 322954991
 *
 */
public class SchoolSystem {
	public static ArrayList<Student> studRecs=new ArrayList<Student>();
	public static Scanner scn=new Scanner (System.in);
	public static File file=new File("src\\students.txt");	
	//public static FileOutputStream fileOutputStream=new FileOutputStream("src\\students.txt");
	//public static PrintStream fps=new PrintStream(fileOutputStream);
	public static BufferedReader fbr;
	public static FileOutputStream fileOutputStream;
	public static PrintStream fps;
	
	
	/**
	 * This method sets up the input and output objects for the file, and the file itself.
	 */
	public static void setUp(){
		try {
			fileOutputStream = new FileOutputStream ("src\\students.txt");
			fbr=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (!file.exists())
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		fps=new PrintStream(fileOutputStream);
	}
	/**
	 * This is the main method. It acts as a main menu for the program.
	 * @param args
	 */
	public static void main(String[] args) {
		setUp();
		do{
		int option;
		System.out.println("Please enter the number of the option you would like to use.");
		System.out.println("1.Add Student");
		System.out.println("2.Find Student");
		System.out.println("3.Print All Students");
		System.out.println("4.Sort All Students");
		System.out.println("10.Quit");
		

		try{
			option=Integer.parseInt(scn.nextLine());		
			if ((option!=1)&&(option!=2)&&(option!=3)&&(option!=4)&&(option!=5)&&(option!=6)&&(option!=7)&&(option!=8)&&(option!=9)&&(option!=10))
				throw new InvalidInputException("Please enter a valid number.");
		}catch(InvalidInputException e2){
			continue;
		}
		
		if (option==1)
			addStudent();
		else if (option==2){
			System.out.println("Please input the last name of the student you would like to find.");
			Student search=findStudent(scn.nextLine());
			if(search==null)
			{
				System.out.println("There is no student with that last name in the records.");
			}
			else{
				System.out.println("1.Print Student's Information");
				System.out.println("2.Remove Student");
				System.out.println("0.Back");
				try{
					option=scn.nextInt();
						
				}catch(IllegalArgumentException e){
					System.out.println("Please enter a valid number.");
				}
				
				if (option==1)
					printSingle(search);
				else if(option==2)
					removeStudent(search);
				else if (option==0);
					main(null);				
			}
		}
		else if (option==3)
			printAll();		
		else if (option==4)
			sort();
		else if(option==10)
			quit();			
		}while(true);
	}
	/**
	 * This methods adds a single student to the student records.
	 * @throws Exception 
	 */
	public static void addStudent()
	{
		boolean checker=true;
		String postalCode=null;
		
		System.out.println("Please enter the student's first name.");
		String firstName=scn.nextLine();
		System.out.println("Please enter the student's last name.");
		String lastName=scn.nextLine();
		String phoneNumber=null;
		System.out.println("Please enter the student's phone number.");
		phoneNumber=scn.nextLine();
		while(checker){
			phoneNumber=scn.nextLine();
			if (phoneNumber.length()==10)
			{
				for (int i=0;i<10;i++){
					if(!checkInt(phoneNumber.charAt(i))){
						System.out.println("Please enter a valid phone number.");
						break;
					}
					if (i==9){
						checker=false;
					}
				}
			}
			else{
				System.out.println("Please enter a valid phone number.");
			}
		}
		
		System.out.println("Please enter the student's address.");
		String address=scn.nextLine();
		System.out.println("Please enter the student's city.");
		String city=scn.nextLine();
		System.out.println("Please enter the student's province using two letter code(e.g. ON for Ontario)");
		checker=true;
		String province=scn.nextLine();
		Province valid=checkProvince(province.toLowerCase());
		
		System.out.println("Please enter the student's postal code.");
		while(checker==true){
			postalCode=scn.nextLine().toLowerCase();
			//System.out.println(postalCode);
			checker=true;
			if (postalCode.length()!=6){
				System.out.println("Invalid postal code. Please enter a valid one.");
			}
			else{
				for (int i=0;i<6;i++){
					if ((i==0)&&(!checkChar(postalCode.charAt(i)))||(i==2)&&(!checkChar(postalCode.charAt(i)))||(i==4)&&(!checkChar(postalCode.charAt(i)))){
						System.out.println("Invalid postal code. Please enter a valid one.");
						break;
					}
					else if ((i==1)&&(!checkInt(postalCode.charAt(i)))||(i==3)&&(!checkInt(postalCode.charAt(i)))||(i==5)&&(!checkInt(postalCode.charAt(i)))){
						System.out.println("Invalid postal code. Please enter a valid one.");
						break;
					}			
					if (i==5){
						checker=false;
					}
				}
			}
		}
		String birthday;
		System.out.println("Please enter the student's birth day (dd/mm/yy).");
		while(true){
			birthday=scn.nextLine();
			
			if ((birthday.length()==8)&&(birthday.charAt(2)=='/')&&(birthday.charAt(5)=='/')&&(checkInt(birthday.charAt(0))==true)&&(checkInt(birthday.charAt(1))==true)&&(checkInt(birthday.charAt(3))==true)&&(checkInt(birthday.charAt(4))==true)&&(checkInt(birthday.charAt(6))==true)&&(checkInt(birthday.charAt(7))==true)){
				break;
			}
			else{
				System.out.println("Please enter a valid birthday");
			}
		}
		studRecs.add(new Student(firstName,lastName,phoneNumber,address,city,valid,postalCode,birthday));
		for (int i=0;i<studRecs.size();i++){
			fps.println(studRecs.get(i).toString());			
		}
	
		main(null);
	}
	/**
	 * This method checks if a given char is an integer
	 * @param x
	 * @return
	 */
	public static boolean checkInt(char x){
		if (x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9')
			return true;
		else
			return false;
	}
	/**
	 * This method checks if a given char is a char (and not a number)
	 * @param x
	 * @return
	 */
	public static boolean checkChar(char x){
		if (x=='a'||x=='b'||x=='c'||x=='d'||x=='e'||x=='f'||x=='g'||x=='h'||x=='i'||x=='j'||x=='k'||x=='l'||x=='m'||x=='n'||x=='o'||x=='p'||x=='q'||x=='r'||x=='s'||x=='t'||x=='u'||x=='v'||x=='w'||x=='x'||x=='y'||x=='z')
			return true;
		else
			return false;
	}
	/**
	 * This method quits the program.
	 */
	public static void quit(){
		System.out.println("Goodbye!");
		try {
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
	/**
	 * This method uses the last name of a student to find them in the records
	 * @param lastName
	 * @return
	 */
	public static Student findStudent(String lastName){
		for (int i=0;i<studRecs.size();i++){
			if (studRecs.get(i).getLastName().equals(lastName))
				return studRecs.get(i);			
		}
		return null;
	}
	/**
	 * Given a student, this method prints out all available information on that student.
	 * @param x
	 * @throws Exception 
	 */
	public static void printSingle(Student x){
		System.out.println(x.getFirstName());
		System.out.println(x.getLastName());
		System.out.println(x.getPhoneNumber());
		System.out.println(x.getAddress());
		System.out.println(x.getCity());
		System.out.println(x.getProvince());
		System.out.println(x.getPostalCode());
		System.out.println(x.getBirthday());
		System.out.println(x.getStudentNumber());
		System.out.println();
		main(null);
	}
	/**
	 * Given a student, this method removes that student from the student records.
	 * @param x
	 * @throws Exception 
	 */
	public static void removeStudent(Student x) {
		studRecs.remove(x);
		main(null);
	}
	/**
	 * This method outputs all information the student records has.
	 * @throws Exception 
	 */
	public static void printAll() {
		/*for (int i=0;i<studRecs.size();i++){
			System.out.println(studRecs.get(i).getFirstName());
			System.out.println(studRecs.get(i).getLastName());
			System.out.println(studRecs.get(i).getPhoneNumber());
			System.out.println(studRecs.get(i).getAddress());
			System.out.println(studRecs.get(i).getCity());
			System.out.println(studRecs.get(i).getProvince());
			System.out.println(studRecs.get(i).getPostalCode());
			System.out.println(studRecs.get(i).getBirthday());
			System.out.println();
		}*/
		String [] values=null;
		try {
			values=fbr.readLine().split(",");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
			if ((i+1)%9==0)
				System.out.println();
		}
		main(null);
	}
	/**
	 * This method sorts the students in the record based on last name.
	 */
	public static void sort(){
		Collections.sort(studRecs);
		for (int i=0;i<studRecs.size();i++){
			System.out.println(studRecs.get(i).getFirstName());
			System.out.println(studRecs.get(i).getLastName());
			System.out.println(studRecs.get(i).getPhoneNumber());
			System.out.println(studRecs.get(i).getAddress());
			System.out.println(studRecs.get(i).getCity());
			System.out.println(studRecs.get(i).getProvince());
			System.out.println(studRecs.get(i).getPostalCode());
			System.out.println(studRecs.get(i).getBirthday());
			System.out.println();
		}
	}
	/**
	 * This method checks if a given input is the proper code for a province.
	 * @param input
	 * @return Province
	 */
	public static Province checkProvince(String input){
		while (true){
			switch (input){
				case "ab":
					return Province.ALBERTA;
					
				case "bc":
					return Province.BRITISHCOLUMBIA;
					
				case "nb":
					return Province.NEWBRUNSWICK;
					
				case "mb":
					return Province.MANATOBA;
					
				case "ns":
					return Province.NOVASCOTIA;
					
				case "nt":
					return Province.NORTHWESTTERRITORIES;
					
				case "nu":
					return Province.NUNAVUT;
					
				case "on":
					return Province.ONTARIO;
					
				case "qc":
					return Province.QUEBEC;
					
				case "pe":
					return Province.PRINCEEDWARDISLAND;
					
				case "sk":
					return Province.SASKATCHUWAN;
					
				case "yt":
					return Province.YUKON;
					
				default:{
					System.out.println("Please input a valid province");
					input=scn.nextLine();
				}
			
				
		}
	}
	
}
}