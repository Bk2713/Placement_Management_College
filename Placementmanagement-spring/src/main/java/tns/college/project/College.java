package tns.college.project;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class College {

private int cid;
private String admin;
private String collegename;
private String location;
private String scheduleplacement;


//Default constructor
public College() {
	super();
}



//Parameterized Constructor

public College(int cid, String admin, String collegename, String location, String scheduleplacement) {
	
	this.cid = cid;
	this.admin = admin;
	this.collegename = collegename;
	this.location = location;
	this.scheduleplacement = scheduleplacement;
}




@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getCid() {
	return cid;
}



public void setCid(int cid) {
	this.cid = cid;
}



public String getAdmin() {
	return admin;
}



public void setAdmin(String admin) {
	this.admin = admin;
}



public String getCollegename() {
	return collegename;
}



public void setCollegename(String collegename) {
	this.collegename = collegename;
}



public String getLocation() {
	return location;
}



public void setLocation(String location) {
	this.location = location;
}



public String getScheduleplacement() {
	return scheduleplacement;
}



public void setScheduleplacement(String scheduleplacement) {
	this.scheduleplacement = scheduleplacement;
}


@Override
public String toString() {
	return "College [cid=" + cid + ", admin=" + admin + ", collegename=" + collegename + ", location=" + location
			+ ", scheduleplacement=" + scheduleplacement + "]";
}




public College get() {
	// TODO Auto-generated method stub
	return null;
}


}

