package tns.college.project;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class CollegeService {

@Autowired
private CollegeRepository repository;

	public List<College> listAll()
	{
		return repository.FindAll();
	}

public College get(Integer cid) {
		
		return ((College) repository.findById1(cid)).get();
	}
public void save(College college) {
	repository.save(college);
	
}

public void delete(Integer cid) {
	repository.deleteById(cid);
	
}
}
