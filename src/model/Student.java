package model;

public class Student {
	private long pID;
	private String name;
	private String surname;
	private String personCode;
	
	private static long counter = 1000;
	
	public long getpID() {
		return pID;
	}
	public void setpID() {
		this.pID = counter;
		counter++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null  && name.matches("[A-Z]{1}[a-z]{1,20}"))
			this.name = name;
		else
			this.name = "Undefinied";
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-Z]{1}[a-z]{1,20}"))
			this.surname = surname;
		else
			this.surname = "Undefinied";
	}
	
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		if(personCode != null && personCode.matches("[0-9]{6}-[0-9]{5}"))
			this.personCode = personCode;
		else
			this.personCode = "Undefined";
	}
	
	
	public Student() {
		setpID();
		setName("Lara");
		setSurname("Bernardes");
		setPersonCode("123456-65432");
	}
	
	
	public Student(String name, String surname, String personCode) {
		setpID();
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}
	
	public String toString() {
		return pID + ": " + name + " " + surname + "[" + personCode + "]";
	}
	
}
