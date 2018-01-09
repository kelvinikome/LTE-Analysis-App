package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Profile;


public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
