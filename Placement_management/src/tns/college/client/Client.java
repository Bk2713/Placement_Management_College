package tns.college.client;

import tns.college.entity.*;
import tns.college.repository.*;
import tns.college.service.*;

public class Client {

	public static void main(String[] args) {
		//creating an object of all entity files
				College college = new College();
				ICollegeservice service = new ICollegeserviceImpl() {
				
					
					@Override
					public College searchCollegeById(int cid) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public College scheduleplacement(College scheduleplacement) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public College deleteCollege(College college) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public College addCollege(College college) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public College updateCollege(College college) {
						// TODO Auto-generated method stub
						return null;
					}
				};
				
				college.setAdmin("Bk");
				college.setCid(101);
				college.setCollegename("AMC");
				college.setLocation("Bengaluru");
				college.setScheduleplacement("March");
 
	

	}
}