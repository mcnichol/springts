package com.allstate.ars.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.allstate.ars.model.Attendee;

@Controller
public class AttendeeController {
	
	@RequestMapping(value="/attendee", method = RequestMethod.GET)
	public String displayAttendeePage(Model model){
		Attendee attendee = new Attendee();
		
		model.addAttribute("attendee", attendee);
		
		return "attendee";
	}
	
	@RequestMapping(value="/attendee", method = RequestMethod.POST)
	public String processAttendee(@Valid Attendee attendee, BindingResult result, Model m){
		if(result.hasErrors()){
			return "attendee";
		}
		
		//Follow principles of POST|REDIRECT|GET
		//When receiving POST, REDIRECT to a GET to deal with back button issues
		return "redirect:index.html";
	}
}
