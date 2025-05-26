//package com.softcom.system.__report_application.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.softcom.system.__report_application.entity.CitizenPlanEntity;
//import com.softcom.system.__report_application.repository.CitizenPlanRepository;
//@Service
//public class CitizenPlanServiceImpl implements CitizenPlanService {
//    
//	@Autowired
//	 private  CitizenPlanRepository citizenPlanRepository;
//	
//	@Override
//	public List<CitizenPlanEntity> findAllCitizenPlans() {
//		 List <CitizenPlanEntity> listOfAllCitizen =citizenPlanRepository.findAll();
//		return listOfAllCitizen;
//	}
//
//	@Override
//	public List<CitizenPlanEntity> findByPlanStatus() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<CitizenPlanEntity> findByPlanName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<CitizenPlanEntity> serch() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
