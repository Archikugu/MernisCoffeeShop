package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
	int id;
	String FirstName;
	String LastName;
	int DateOfBirth;
	String NationalId;
	
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalId = nationalId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}


	public String getNationalId() {
		return NationalId;
	}


	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}
	
	
	

}
