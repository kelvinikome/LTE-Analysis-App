package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.model.Profile;
import app.service.ProfileService;

@CrossOrigin
@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@RequestMapping(method=RequestMethod.GET, value="/allprofiles")
	public Iterable<Profile> getAllProfiles() {
		return profileService.getAllProfiles();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/register")
	public void addProfile(@RequestBody Profile profile) {
		profileService.addProfile(profile);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/user/{username}")
	public Profile updateUser(@RequestBody Profile profile, @PathVariable String username) {
		return profileService.updateProfile(profile);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/user/{username}")
	public void deleteUser(@RequestBody Profile profile, @PathVariable String username) {
		profileService.deleteUser(profile);
	}

	@RequestMapping(method=RequestMethod.GET, value="/user/{username}")
	public Profile getProfile(@PathVariable String username) {
		return profileService.getProfile(username);
	}
	
}
