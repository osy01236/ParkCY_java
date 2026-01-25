package Matching;

public class WorkerInfo {

	
	    private String name;        
	    private String affiliation; 
	    private String age;         
	    private String phone;       
	    private String job;         
	    private String hopeArea;    
	    private String hopeJob;     
		
	    
 
	    
	    
	    @Override
		public String toString() {
			return "회사원 정보 [이름 :" + name + 
				   ", 소속 :" + affiliation + 
				   ", 나이 :" + age + 
				   ", 연락처:" + phone+ 
				   ", 현재업무:" + job + 
				   ", 희망지역=" + hopeArea + 
				   ", 희망업무=" + hopeJob + "]";
		}




		public WorkerInfo(String name, String affiliation, String age, String phone, String job, String hopeArea,
				String hopeJob) {
			this.name = name;
			this.affiliation = affiliation;
			this.age = age;
			this.phone = phone;
			this.job = job;
			this.hopeArea = hopeArea;
			this.hopeJob = hopeJob;
		}



		
		
		
		
		

		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public String getAffiliation() {
			return affiliation;
		}




		public void setAffiliation(String affiliation) {
			this.affiliation = affiliation;
		}




		public String getAge() {
			return age;
		}




		public void setAge(String age) {
			this.age = age;
		}




		public String getPhone() {
			return phone;
		}




		public void setPhone(String phone) {
			this.phone = phone;
		}




		public String getJob() {
			return job;
		}




		public void setJob(String job) {
			this.job = job;
		}




		public String getHopeArea() {
			return hopeArea;
		}




		public void setHopeArea(String hopeArea) {
			this.hopeArea = hopeArea;
		}




		public String getHopeJob() {
			return hopeJob;
		}




		public void setHopeJob(String hopeJob) {
			this.hopeJob = hopeJob;
		}
		

	    
	    
	    
	    
	    
	    
	    
	
}
