package app.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import app.model.DataFile;
import app.model.LteData;
import app.service.FileService;

@CrossOrigin
@RestController
@RequestMapping ("/user/{username}/")
public class FileController {

	@Autowired
	private FileService fileService;
	
	@RequestMapping(method=RequestMethod.GET, value="files")
	public Iterable<DataFile> getAllFiles(@PathVariable String username){
		return fileService.getAllFilesForUser(username);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="files")
	public void addFile(@PathVariable String username, @RequestParam("file") MultipartFile file) {
		fileService.addFile(file, username);
	}

	@RequestMapping(method=RequestMethod.PUT, value="files/data")
	public void updateFile(@PathVariable String username, @RequestParam("file") MultipartFile file) {
		fileService.updateFile(file, username);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="files/data")
	public void deleteFile(@PathVariable String username, @RequestParam("fileName") String fileName) {
			fileService.deleteFile(fileName, username);
	}

	@RequestMapping(method=RequestMethod.GET, value="files/datafilter")
	public List<LteData> getFileData(@PathVariable String username, @RequestParam("fileName") String fileName,
			@RequestParam("start") String start,
			@RequestParam("end") String end) {
		return fileService.getFilteredFileData(fileName, start, end, username);
	}  

	@RequestMapping(method=RequestMethod.GET, value="files/data")
	public Map<Integer, Date> getFilteredFileData(@PathVariable String username, @RequestParam("fileName") String fileName) {
		return fileService.getTimeData(fileName, username);
	} 
}  
