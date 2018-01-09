package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.LteData;
import app.model.Profile;

public interface DataStorageRepository extends JpaRepository<LteData, Long> {

}
