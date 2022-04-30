package tns.college.repository;

import javax.persistence.EntityManager;
import tns.college.entity.College;
public class ICollegeRepositoryImpl implements ICollegeRepository{

	EntityManager entitymanager;
	//Started life cycles
	
	public ICollegeRepositoryImpl() {
		entitymanager = JPAUtil.getEntityManager();

	}

	@Override
	public College addCollege(College collegename) {
		entitymanager.persist(collegename);
		return collegename;
	}

	@Override
	public College updateCollege(College college) {
		entitymanager.merge(college);
		return college;
	}

	@Override
	public College searchCollegeById(int cid) {
		College college = entitymanager.find(College.class, cid);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		entitymanager.remove(college);
		return college;
	}

	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
		
	}

	@Override
	public void deleteCollege(int cid) {
		College college = entitymanager.find(College.class, cid);
		entitymanager.remove(college);
		
	}

}
