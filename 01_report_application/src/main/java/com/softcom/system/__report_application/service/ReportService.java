package com.softcom.system.__report_application.service;

import java.util.List;

import com.softcom.system.__report_application.entity.CitizenPlan;
import com.softcom.system.__report_application.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public void exportExcel();
	
	public boolean exportPdf();
	
	
	

}
