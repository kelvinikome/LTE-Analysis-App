package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.DataFile;

public interface FileStorageRepository extends JpaRepository<DataFile, Long> {

}
