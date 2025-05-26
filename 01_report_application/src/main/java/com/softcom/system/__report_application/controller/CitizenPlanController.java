//package com.softcom.system.__report_application.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.softcom.system.__report_application.entity.CitizenPlanEntity;
//import com.softcom.system.__report_application.service.CitizenPlanService;
//
//@RestController
//public class CitizenPlanController {
//	 @Autowired
//	private CitizenPlanService citizenPlanService ;
//	
//	//localhost:8080/findAllPlan
//	@GetMapping("/findAllPlan")
//	public List<CitizenPlanEntity> findAllPlan()
//	{ 
//		List<CitizenPlanEntity> list =citizenPlanService.findAllCitizenPlans();		
//		return list;
//	}
//	//localhost:8080/findPlanStatus
//		@GetMapping("/findPlanStatus")
//		public List<CitizenPlanEntity> findPlanStatus()
//		{ 
//			List<CitizenPlanEntity> list =citizenPlanService.findByPlanStatus()	;	
//			return list;
//		}
//		//localhost:8080/findPlanName
//				@GetMapping("/findPlanaName")
//				public List<CitizenPlanEntity> findPlanName()
//				{ 
//					List<CitizenPlanEntity> list =citizenPlanService.findByPlanName();	
//					return list;
//				}
//
//}
