package tns.college.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class CollegeController {

	@Autowired
	private CollegeService service;
	
	//Retrieval Operation
	@GetMapping("/CollegeT")
	public List<College> list(){
		return service.listAll();
		
	}
	//Retrieval Operation
	@GetMapping("/college/{cid}")
	public ResponseEntity<College> get(@PathVariable Integer cid)
	{
		try 
		{
			College college = service.get(cid);
			return new ResponseEntity<College> (college,HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<College> (HttpStatus.NOT_FOUND);}
			
		}
		//Creation
		@PostMapping("/college")
		public void add(@RequestBody College college) 
		{
			service.save(college);
		}
		
		//update
		@PutMapping("/college/{cid}")
		public  ResponseEntity<?> update (@RequestBody College college, @PathVariable Integer cid){
		try {
			College existcollege = service.get(cid);
			service.save(college);
			return new ResponseEntity<>(college, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
		
		
		// delete
		@DeleteMapping("/college/{cid}")
		public void delete(@PathVariable Integer cid) {
			service.delete(cid);
			
			

	
	}
		
	
	}

