package model;

public class Professor {
	//1. variables
	private long pID;
	private String name;
	private String surname;
	private degree profDegree;
	
	private static long counter = 0;
	//2. set and get
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
	public degree getProfDegree() {
		return profDegree;
	}
	public void setProfDegree(degree profDegree) {
		if(profDegree != null)
			this.profDegree = profDegree;
		else
			this.profDegree = degree.other;
	}
		
	
	//3. constructors
	public Professor() {
		setpID();
		setName("John");
		setSurname("Big");
		setProfDegree(degree.other);
	}
	
	public Professor(String name, String surname, degree profDegree) {
		setpID();
		setName(name);
		setSurname(surname);
		setProfDegree(profDegree);
	}

	

	//4. toString
	@Override
	public String toString()
	{
		return pID + ": " + name + " " + surname + "(" + profDegree + ")";
	}
	//5. other functions
}
