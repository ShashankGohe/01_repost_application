package com.softcom.system.__report_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softcom.system.__report_application.entity.CitizenPlan;
import com.softcom.system.__report_application.repository.CitizenPlanRepository;
import com.softcom.system.__report_application.request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService {
 
//	 @Autowired
//	private CitizenPlanRepository citizenPlanRepository;
//	
	@Override
	public List<String> getPlanName() {
	//	 citizenPlanRepository.getPlanName();
		return null ;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exportExcel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
