package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Profile;
import app.service.ProfileService;


@RestController
public class WebController {

	@Autowired
	ProfileService profiles;
	
	@RequestMapping("/config")
	public String config(){
		profiles.addProfile(new Profile ("kay", "this", "lastname", 7777, "kay@kay.com",  "please"));
		return "Done";
	}
	@RequestMapping("/show")
	public Iterable<Profile> show(){
		return profiles.getAllProfiles();
	}
}