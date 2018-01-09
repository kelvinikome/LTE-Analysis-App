package app.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import app.model.DataFile;
import app.model.LteData;
import app.model.Profile;
import app.repository.DataStorageRepository;
import app.repository.FileStorageRepository;
import app.repository.ProfileRepository;

@Service
public class FileService {

	@Autowired
	FileStorageRepository fileRepository;

	@Autowired
	private DataStorageRepository dataRepository;
	
	private String storageDirectory = "userdata/";
	
	public Iterable<DataFile> getAllFilesForUser(String username){
		List<DataFile> list = new ArrayList<>();
			for (DataFile file : fileRepository.findAll()) {
				if (file.getOwner().equals(username))
					list.add(file);
			}
		return list;
	}
	
	public List<LteData> addFile(MultipartFile file, String username) {
		int number = 0;
		try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(storageDirectory+username+"/" + file.getOriginalFilename());
            Files.write(path, bytes);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		List<LteData> lteData = new ArrayList<>();
		Map<String, List<LteData>> tempFile = new HashMap<>();
		
		try {
			FileInputStream inputStream = new FileInputStream(new File(storageDirectory+username+"/"+file.getOriginalFilename()));
	        
	        Workbook workbook = new HSSFWorkbook(inputStream);
	        Sheet firstSheet = workbook.getSheetAt(0);
	        int offset = 6;
	        int currentPosition = 0;
	        int id = 0;
	        
	        for (Row nextRow : firstSheet) {
	        	int column = 0;
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	            if ((currentPosition++ >= offset)) {
	            		
			            	 String startTime = null;
			            	 String period = null;
			            	 String neName = null;
			            	 String wholeSystem = null;
			            	 String averageBearerNumber = null;
			            	 String maximumBearerNumber = null;
			            	 String averageDedicatedBearerNumber = null;
			            	 String averagePdnConnectionNumber = null;
			            	 String maximumPdnConnectionNumber = null;
			            	 String averageAttachedUsers = null;
			            	 String maximumAttachedUsers = null;
			            	 String ipPacketsReceived = null;
			            	 String downlinkMessageKbytesSentInterface = null;
			            	 String saeBearerSetupRequestTimes = null;
			            	 String saeBearerSetupSuccessTimes = null;
			            	 String uplinkMessageKbytesReceivedInterface = null;
			            	 String realTimePdnConnectionNumber = null;
			            	 String realTimeAttachedUsersAtEcmconnectedStatus = null;
			            	 String realTimeAttachedUsersAtEcmidleStatus = null;
			            	 String realTimeAttachedUsers = null;
			            	 String maximumAttachedUsersAtEcmidleStatus = null;
			            	 String maximumAttachedUsersAtEcmconnectedStatus = null;
			            	 String serviceRequestSuccessTimes = null;
			            	 String serviceRequestTimes = null;
			            	 String pagingRequestTimes = null;
			            	 String pagingSuccessTimes = null;
			            	 String packetPagingRequestTimesPerSubscriber = null;
			            	 String packetPagingSuccessRate = null;
			            	 String authenticationRequestTimesPerSubscriber = null;
			            	 String securityModeCommandRequestTimes = null;
			            	 String securityModeCommandSuccessRate = null;
			            	 String securityModeCommandSuccessTimes = null;
			            	 String authenticationRequestTimes = null;
			            	 String authenticationSuccessTimes = null;
			            	 String intrammeHandoverRequestTimesPerSubscriber = null;
			            	 String intrammeHandoverSuccessRate = null;
			            	 String intraBasedHandoverSuccessTimes = null;
			            	 String intraBasedHandoverRequestTimes = null;
			            	 String intrammeTauSuccessRate = null;
			            	 String periodicTauRequestTimesPerSubscriber = null;
			            	 String intrammeCombinedTauSuccessRate = null;
			            	 String periodTauSuccessTimes = null;
			            	 String periodTauRequestTimes = null;
			            	 
				            while ((cellIterator.hasNext())) {
				            	
				            	HSSFCell cell = (HSSFCell) cellIterator.next();
				                switch (cell.getCellType()) { // stop if blank field found
				                case Cell.CELL_TYPE_BLANK:
				                	break;
				                }
				                
				                if (column == 0)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	startTime = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	startTime = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 1)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	period = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	period = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 2)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	neName = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	neName = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 3)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	wholeSystem = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	wholeSystem = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 4)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	averageBearerNumber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	averageBearerNumber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 5)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	maximumBearerNumber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	maximumBearerNumber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 6)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	averageDedicatedBearerNumber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	averageDedicatedBearerNumber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 7)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	averagePdnConnectionNumber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	averagePdnConnectionNumber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 8)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	maximumPdnConnectionNumber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	maximumPdnConnectionNumber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 9)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	averageAttachedUsers = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	averageAttachedUsers = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 10)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	maximumAttachedUsers = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	maximumAttachedUsers = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 11)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	ipPacketsReceived = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	ipPacketsReceived = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 12)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	downlinkMessageKbytesSentInterface = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	downlinkMessageKbytesSentInterface = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 13)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	saeBearerSetupRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	saeBearerSetupRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 14)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	saeBearerSetupSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	saeBearerSetupSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 15)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	uplinkMessageKbytesReceivedInterface = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	uplinkMessageKbytesReceivedInterface = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 16)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	realTimePdnConnectionNumber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	realTimePdnConnectionNumber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 17)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	realTimeAttachedUsersAtEcmconnectedStatus = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	realTimeAttachedUsersAtEcmconnectedStatus = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 18)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	realTimeAttachedUsersAtEcmidleStatus = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	realTimeAttachedUsersAtEcmidleStatus = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 19)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	realTimeAttachedUsers = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	realTimeAttachedUsers = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 20)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	maximumAttachedUsersAtEcmidleStatus = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	maximumAttachedUsersAtEcmidleStatus = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 21)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	maximumAttachedUsersAtEcmconnectedStatus = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	maximumAttachedUsersAtEcmconnectedStatus = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 22)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	serviceRequestSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	serviceRequestSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 23)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	serviceRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	serviceRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 24)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	pagingRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	pagingRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 24)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	pagingSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	pagingSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 25)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	packetPagingRequestTimesPerSubscriber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	packetPagingRequestTimesPerSubscriber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 26)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	packetPagingSuccessRate = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	packetPagingSuccessRate = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 27)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	authenticationRequestTimesPerSubscriber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	authenticationRequestTimesPerSubscriber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 28)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	securityModeCommandRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	securityModeCommandRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 29)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	securityModeCommandSuccessRate = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	securityModeCommandSuccessRate = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 30)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	securityModeCommandSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	securityModeCommandSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 31)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	authenticationRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	authenticationRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 32)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	authenticationSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	authenticationSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 33)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	intrammeHandoverRequestTimesPerSubscriber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	intrammeHandoverRequestTimesPerSubscriber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 34)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	intrammeHandoverSuccessRate = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	intrammeHandoverSuccessRate = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 35)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	intraBasedHandoverSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	intraBasedHandoverSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 36)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	intraBasedHandoverRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	intraBasedHandoverRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 37)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	intrammeTauSuccessRate = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	intrammeTauSuccessRate = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 38)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	periodicTauRequestTimesPerSubscriber = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	periodicTauRequestTimesPerSubscriber = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 39)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	intrammeCombinedTauSuccessRate = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	intrammeCombinedTauSuccessRate = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 40)
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	periodTauSuccessTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	periodTauSuccessTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                if (column == 41) {
					                switch (cell.getCellType()) {
						                case Cell.CELL_TYPE_STRING:
						                	periodTauRequestTimes = cell.getStringCellValue();
						                	break;
						                case Cell.CELL_TYPE_NUMERIC:
						                	periodTauRequestTimes = Double.toString(cell.getNumericCellValue());
						                	break;
					                }
				                }
				                column++;
				                }
				            
				            if ((startTime != null)) {
				            	lteData.add(new LteData (file.getOriginalFilename(), username, id++, startTime, period, neName, wholeSystem,
						     			averageBearerNumber, maximumBearerNumber, averageDedicatedBearerNumber,
						    			averagePdnConnectionNumber, maximumPdnConnectionNumber, averageAttachedUsers,
						    			maximumAttachedUsers, ipPacketsReceived, downlinkMessageKbytesSentInterface,
						    			saeBearerSetupRequestTimes, saeBearerSetupSuccessTimes,
						    			uplinkMessageKbytesReceivedInterface, realTimePdnConnectionNumber,
						    			realTimeAttachedUsersAtEcmconnectedStatus, realTimeAttachedUsersAtEcmidleStatus,
						    			realTimeAttachedUsers, maximumAttachedUsersAtEcmidleStatus,
						    			maximumAttachedUsersAtEcmconnectedStatus, serviceRequestSuccessTimes,
						    			serviceRequestTimes, pagingRequestTimes, pagingSuccessTimes,
						    			packetPagingRequestTimesPerSubscriber, packetPagingSuccessRate,
						    			authenticationRequestTimesPerSubscriber, securityModeCommandRequestTimes,
						    			securityModeCommandSuccessRate, securityModeCommandSuccessTimes,
						    			authenticationRequestTimes, authenticationSuccessTimes,
						    			intrammeHandoverRequestTimesPerSubscriber, intrammeHandoverSuccessRate,
						    			intraBasedHandoverSuccessTimes, intraBasedHandoverRequestTimes, intrammeTauSuccessRate,
						    			periodicTauRequestTimesPerSubscriber, intrammeCombinedTauSuccessRate,
						    			periodTauSuccessTimes, periodTauRequestTimes));
				            } 
	            		
				            }
	            }
	        	//workbook.close();
	            inputStream.close();
	            fileRepository.save(new DataFile(file.getOriginalFilename(), "description", username));
	            
	            for (LteData data : lteData) {
	            	dataRepository.save(data);
	            	//System.out.println(data.getFileName()+"\t"+data.getStartTime());
	            }
	            
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataRepository.findAll();
	}
	
	public boolean deleteFile(String fileName, String username) {
		File folder=new File(storageDirectory);
		File userDirectory=new File(storageDirectory+username);

		/*Get folder*/
		File[] directories=folder.listFiles();
		for (File directory : directories) {
			if((!directory.isFile())&&(directory.getName().equals(username))){
				/*Get files*/
				File[] files=userDirectory.listFiles();
				for (File file : files) {
					if((file.isFile())&&(file.getName().equals(fileName))&&(file.delete())){
						for (DataFile data : fileRepository.findAll()) {
							if ((data.getFileName().equals(fileName))&&(data.getOwner().equals(username)))
									fileRepository.delete(data);
						}/*
						for (LteData data : dataRepository.findAll()) {
							if ((data.getFileName().equals(fileName))&&(data.getOwner().equals(username)))
									dataRepository.delete(data);
						}  */
						return true;
					}
				}
			}
		}
		return false;
	} 
	
	public void updateFile(MultipartFile file, String username) {
		deleteFile(file.getOriginalFilename(), username);
		addFile(file, username);
	}
	
	

	public boolean dateIsValid(String dateToValidate, String dateFromat){
		if(dateToValidate == null){
			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);

		try {
			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean fileExist(String fileName, String username) {
		File folder=new File(storageDirectory+username);
		
		File[] directories = folder.listFiles();
		for (File file : directories) {
			if((file.isFile())&&(file.getName().equals(fileName))){
				return true;
			}
		}
		return false;
	}

	public List<LteData> getPaginatedFileData(String fileName, int page, String username) {
		List<LteData> list = new ArrayList<>();
		int range = 5,
				limit = page * range,
				base = (page * range) - range,
						currentPosition = 0;
		
		/*for (LteData data : dataRepository.findAll()) {
			if ((data.getOwner().equals(username))&&(data.getFileName().equals(fileName))) {
				if (currentPosition >= base)
					list.add(data);
				currentPosition++;
			}
		}  */
		return list;
	}
}
