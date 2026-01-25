package Matching;

import java.util.ArrayList;

public class CompanyInfo {

	
	private String companyName;
	private String Area;
	private String employmentJob;
	

	
	
	@Override
	public String toString() {
		return "회사정보[회사명:" + companyName + 
			   ", 지역:" + Area + 
			   ", 채용업무=" + employmentJob + "]";
	}



	
	
	public CompanyInfo(String companyName, String area, String employmentJob) {
		
		this.companyName = companyName;
		this.Area = area;
		this.employmentJob = employmentJob;
	}
	
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getEmploymentJob() {
		return employmentJob;
	}
	public void setEmploymentJob(String employmentJob) {
		this.employmentJob = employmentJob;
	}
	
}
