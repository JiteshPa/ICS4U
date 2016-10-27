public class Student implements Comparable { 
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String city;
	private Province province;
	private String postalCode;
	private String birthday;
	private static long idGenerator=300000000;
	private long studentNumber = idGenerator;
	public Student(String name, String otherName, String phone, String home, String town, Province state, String code, String bDay){
		setFirstName(name);
		setLastName(otherName);
		setPhoneNumber(phone);
		setAddress(home);
		setCity(town);
		setProvince(state);
		setPostalCode(code);
		setBirthday(bDay);
		setStudentNumber();
	}
	/*public Student(){
		this.studentNumber=idGenerator;
		idGenerator++;
	}*/
	/**
	 * @return the studentNumber
	 */
	public long getStudentNumber(){
		return studentNumber;
	}
	public void setStudentNumber(){
		++studentNumber;
		idGenerator++;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 * @throws InvalidInputException 
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		while(true){
			//phoneNumber=scn.nextLine();
			if (phoneNumber.length()==10)
			{
				for (int i=0;i<10;i++){
					if(!checkInt(phoneNumber.charAt(i))){
						System.out.println("Please enter a valid phone number.");
						break;
					}
					if (i==9){
						this.phoneNumber = phoneNumber;
						return;
					}
				}
				
			}
			else{
				System.out.println("Please enter a valid phone number.");
			}
		}
		
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the province
	 */
	public Province getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(Province province) {
		this.province = province;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode=postalCode;
		
	}


	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthDay) {
		this.birthday = birthDay;
	}
	public int compareTo(Object j){
		Student tempStudent=(Student)j;
		return this.getLastName().compareTo(tempStudent.getLastName());
		
			
		
	}
	public String toString(Student x){
		return studentNumber+","+firstName+","+lastName+","+phoneNumber+","+address+","+city+","+province+","+postalCode+","+birthday;
	}
	public boolean equals(Student x){
		if (this.studentNumber==x.studentNumber)
			return true;
		else
			return false;
	}

}

