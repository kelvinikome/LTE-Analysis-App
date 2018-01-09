package app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import app.model.DataFile;
import app.model.LteData;
import app.service.FileService;

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

	@RequestMapping(method=RequestMethod.GET, value="files/data")
	public List<LteData> getFileData(@PathVariable String username, @RequestParam("fileName") String fileName,
																		@RequestParam("page") int page) {
		return fileService.getPaginatedFileData(fileName, page, username);
	} 
}  
