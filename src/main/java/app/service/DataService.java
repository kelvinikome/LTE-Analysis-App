package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import app.model.LteData;
import app.repository.DataStorageRepository;

@Service
public class DataService {

	@Autowired
	private DataStorageRepository storageRepository;
	
	public List<LteData> getAllFileData() {
		return storageRepository.findAll();
	}
	
	public void addFileData(LteData data) {
		storageRepository.save(data);
	}

	public void delete(LteData data) {
		storageRepository.delete(data);
	}

	public Page<LteData> getFilteredData(PageRequest filter) {
		return storageRepository.findAll(filter);
	}
}
