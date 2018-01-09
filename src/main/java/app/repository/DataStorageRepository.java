package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.LteData;

public interface DataStorageRepository extends JpaRepository<LteData, Long> {

}
