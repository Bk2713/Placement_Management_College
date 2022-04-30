package tns.college.service;

import tns.college.entity.College;

public interface ICollegeservice {

	
    public College addCollege(College college);  // A
	
	public College updateCollege(College college);  // U
	
	public College searchCollegeById(int cid);  // S
	
	public College scheduleplacement(College scheduleplacement); //SP
	
	public College deleteCollege(College college);//D



	

	

	

	

	

	

	}
