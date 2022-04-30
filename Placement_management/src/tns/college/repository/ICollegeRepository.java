package tns.college.repository;

import tns.college.entity.*;

public interface ICollegeRepository {

	public College addCollege(College Collegename);
	public College updateCollege(College college);
	public College searchCollegeById(int cid);
	public College deleteCollege(College college);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	void deleteCollege(int cid);
	

}
