package app.service;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.model.Profile;
import app.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	private String storageDirectory = "userdata/";

	public Iterable<Profile> getAllProfiles(){
		return profileRepository.findAll();
	}
	
	public Profile getProfile(String profileName) {
		for (Profile profile : profileRepository.findAll()) {
			if (profile.getUsername().equals(profileName))
				return profile;
		}
		return null;
	}
	
	public void addProfile(Profile profile) {
		profileRepository.save(profile);
		new File(storageDirectory).mkdir();
		new File(storageDirectory+profile.getUsername()).mkdir();
	}
	
	public void deleteUser(Profile profile) {
		profileRepository.delete(profile);
		new File(storageDirectory+profile.getUsername()).delete();
	}
	
	public Profile updateProfile(Profile profile) {
		for (Profile user : profileRepository.findAll()) {
			if (user.getUsername().equals(profile.getUsername())) {
				user = profile;
				return user;
			}
		}
		return null;
	}
	
}
