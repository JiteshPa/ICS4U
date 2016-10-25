public class Student implements Comparable {
	//public static enum Province {ALBERTA, BRITISHCOLUMBIA, MANATOBA, NEWBRUNSWICK, NEWFOUNDLANDANDLABRABOR, NORTHWESTTERRITORIES, NOVASCOTIA, NUNAVUT, ONTARIO, PRINCEEDWARDISLAND, QUEBEC, SASKATCHUWAN, YUKON} 
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
	 */
	public void setFirstName(String firstName) {
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
		this.phoneNumber = phoneNumber;
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

