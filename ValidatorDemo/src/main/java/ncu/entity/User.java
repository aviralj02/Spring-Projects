package ncu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

//Data Binding approach
public class User {
	@NotNull(message="is required")
	@Size(max=30, message="max characters allowed")
	@Pattern(regexp="^[A-Za-z0-9 ]+$", message="no special characters allowed")
	private String name;
	
	@NotNull(message="is required")
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message="minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character")
	private String pass;
	
	@NotNull(message="is required")
	@Size(min=12, max=12, message="only 12 digits allowed")
	private String AID;
	
	@NotNull(message="is required")
	private String state;
	private Map<String, String> stateOptions;
	
	@NotNull(message="is required")
	private String gender;
	
	@Email(message="invalid email")
	@NotNull(message="is required")
	private String mail;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Past
	@NotNull(message = "is required")
	private Date DOB;
	
	@NotNull(message="is required")
	@Pattern(regexp="^[0-9]*$", message="only digits allowed")
	private String number;
	
	@NotNull(message="is required")
	private String others;
	private List<String> otherOptions;
	
	@NotNull(message="is required")
	@Size(max=50)
	private String address;
	
	public User() {
		otherOptions = new ArrayList<>();
		otherOptions.add("PAN");
		otherOptions.add("Voter ID");
		otherOptions.add("Driving License");
		otherOptions.add("Passport");
		
		stateOptions = new HashMap<>();
		stateOptions.put("", "");
		stateOptions.put("DL", "Delhi");
		stateOptions.put("HR", "Haryana");
		stateOptions.put("PB", "Punjab");
		stateOptions.put("UP", "Uttar Pradesh");
		stateOptions.put("UK", "Uttrakhand");
		stateOptions.put("WB", "West Bengal");
		
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAID() {
		return AID;
	}
	public void setAID(String aID) {
		AID = aID;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<String, String> getStateOptions() {
		return stateOptions;
	}

	public void setStateOptions(Map<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherOptions() {
		return otherOptions;
	}
	public void setOtherOptions(List<String> otherOptions) {
		this.otherOptions = otherOptions;
	}
	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", AID=" + AID + ", state=" + state + ", gender=" + gender
				+ ", otherOptions=" + otherOptions + ", address=" + address + "]";
	}
	
	
}
