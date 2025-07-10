package com.softcom.system.__report_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.softcom.system.__report_application.request.SearchRequest;
import com.softcom.system.__report_application.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private  ReportService service;
	public String indexpage ()
	{
		SearchRequest  searchObj = new SearchRequest();
		//searchObj.
		return null;
	}

}
