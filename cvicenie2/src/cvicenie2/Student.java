package cvicenie2;

public class Student {
	int id, birthYear, birthMonth, birthDay;
	String firstName, middleName, lastName;
	
	public Student(int id, String firstName, String lastName, int birthDay, int birthMonth,int birthYear) {	// constructor
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
	}
	
	boolean isBirthDay() {
		return false;
	}
	int numberOfFriends() {
		return 0;
	}
	void giveWarning() {
		System.out.println("WARNING!");
	}
	boolean isAdult()
	{
		if((2019 - this.birthYear) >= 18) return true;
		else return false;
	}
	
}
