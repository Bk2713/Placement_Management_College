package tns.college.service;


import tns.college.entity.*;
import tns.college.repository.ICollegeRepository;
import tns.college.repository.ICollegeRepositoryImpl;
import tns.college.*;
public abstract class ICollegeserviceImpl implements ICollegeservice
{
	
ICollegeRepository dao;
	

	public ICollegeserviceImpl() {
		dao =  new ICollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;

	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;

	}

	@Override
	public College searchCollegeById(int cid) {
	    College college = dao.searchCollegeById(cid);
	    return college;

	}

	

	@Override
	public College deleteCollege(College college){
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College scheduleplacement(College scheduleplacement) {
		dao.beginTransaction();
		dao.addCollege(scheduleplacement);
		dao.commitTransaction();
		return scheduleplacement;
	}

	
}
