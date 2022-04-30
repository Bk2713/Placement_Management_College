package tns.college.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository{

	List<College> FindAll();

	Object findById(Integer cid);

	void save(College college);

	void deleteById(Integer cid);

	College findById1(Integer cid);

	

}
