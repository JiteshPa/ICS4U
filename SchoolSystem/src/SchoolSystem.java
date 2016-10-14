import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SchoolSystem {
	public static ArrayList<Student> studRecs=new ArrayList<Student>();
	public static Scanner scn=new Scanner (System.in);

	public static void main(String[] args) {
		do{
		int option=0;
		System.out.println("Please enter the number of the option you would like to use.");
		System.out.println("1.Add Student");
		System.out.println("2.Find Student");
		System.out.println("3.Print All Students");
		System.out.println("4.Sort All Students");
		
		System.out.println("10.Quit");
		

		try{
			option=Integer.parseInt(scn.nextLine());				
		}catch(NumberFormatException e){
			System.out.println("Please enter a valid number.");
			continue;
		}
		
		if (option==1)
			addStudent();
		else if (option==2){
			System.out.println("Please input the last name of the student you would like to find.");
			scn.nextLine();
			Student search=findStudent(scn.nextLine());
			if(search==null)
			{
				System.out.println("There is no student with that name in the records.");
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
			break;
		}while(true);
	}
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
		System.out.println("Please enter the student's province.");
		checker=true;
		
		
		String province=scn.nextLine();
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
		studRecs.add(new Student(firstName,lastName,phoneNumber,address,city,province,postalCode,birthday));
		main(null);
	}
	/**
	 * 
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
	 * 
	 * @param x
	 * @return
	 */
	public static boolean checkChar(char x){
		if (x=='a'||x=='b'||x=='c'||x=='d'||x=='e'||x=='f'||x=='g'||x=='h'||x=='i'||x=='j'||x=='k'||x=='l'||x=='m'||x=='n'||x=='o'||x=='p'||x=='q'||x=='r'||x=='s'||x=='t'||x=='u'||x=='v'||x=='w'||x=='x'||x=='y'||x=='z')
			return true;
		else
			return false;
	}

	public static void quit(){
		System.out.println("Goodbye!");
		System.exit(0);
	}
	public static Student findStudent(String lastName){
		for (int i=0;i<studRecs.size()+1;i++){
			if (studRecs.get(i).getLastName().equals(lastName))
				return studRecs.get(i);			
		}
		return null;
	}
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
	public static void removeStudent(Student x){
		studRecs.remove(x);
		main(null);
	}
	public static void printAll(){
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
		main(null);
	}
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

}
