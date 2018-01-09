package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filedata")
public class LteData {
	private String fileName;
	private String owner;
	private int documentId;
	private String startTime;
	private String period;
	private String neName;
	private String wholeSystem;
	private String averageBearerNumber;
	private String maximumBearerNumber;
	private String averageDedicatedBearerNumber;
	private String averagePdnConnectionNumber;
	private String maximumPdnConnectionNumber;
	private String averageAttachedUsers;
	private String maximumAttachedUsers;
	private String ipPacketsReceived;
	private String downlinkMessageKbytesSentInterface;
	private String saeBearerSetupRequestTimes;
	private String saeBearerSetupSuccessTimes;
	private String uplinkMessageKbytesReceivedInterface;
	private String realTimePdnConnectionNumber;
	private String realTimeAttachedUsersAtEcmconnectedStatus;
	private String realTimeAttachedUsersAtEcmidleStatus;
	private String realTimeAttachedUsers;
	private String maximumAttachedUsersAtEcmidleStatus;
	private String maximumAttachedUsersAtEcmconnectedStatus;
	private String serviceRequestSuccessTimes;
	private String serviceRequestTimes;
	private String pagingRequestTimes;
	private String pagingSuccessTimes;
	private String packetPagingRequestTimesPerSubscriber;
	private String packetPagingSuccessRate;
	private String authenticationRequestTimesPerSubscriber;
	private String securityModeCommandRequestTimes;
	private String securityModeCommandSuccessRate;
	private String securityModeCommandSuccessTimes;
	private String authenticationRequestTimes;
	private String authenticationSuccessTimes;
	private String intrammeHandoverRequestTimesPerSubscriber;
	private String intrammeHandoverSuccessRate;
	private String intraBasedHandoverSuccessTimes;
	private String intraBasedHandoverRequestTimes;
	private String intrammeTauSuccessRate;
	private String periodicTauRequestTimesPerSubscriber;
	private String intrammeCombinedTauSuccessRate;
	private String periodTauSuccessTimes;
	private String periodTauRequestTimes;
	
	@Id
	private int id;

	public LteData(String fileName, String owner, int documentId, String startTime, String period, String neName, String wholeSystem,
			String averageBearerNumber, String maximumBearerNumber, String averageDedicatedBearerNumber,
			String averagePdnConnectionNumber, String maximumPdnConnectionNumber, String averageAttachedUsers,
			String maximumAttachedUsers, String ipPacketsReceived, String downlinkMessageKbytesSentInterface,
			String saeBearerSetupRequestTimes, String saeBearerSetupSuccessTimes,
			String uplinkMessageKbytesReceivedInterface, String realTimePdnConnectionNumber,
			String realTimeAttachedUsersAtEcmconnectedStatus, String realTimeAttachedUsersAtEcmidleStatus,
			String realTimeAttachedUsers, String maximumAttachedUsersAtEcmidleStatus,
			String maximumAttachedUsersAtEcmconnectedStatus, String serviceRequestSuccessTimes,
			String serviceRequestTimes, String pagingRequestTimes, String pagingSuccessTimes,
			String packetPagingRequestTimesPerSubscriber, String packetPagingSuccessRate,
			String authenticationRequestTimesPerSubscriber, String securityModeCommandRequestTimes,
			String securityModeCommandSuccessRate, String securityModeCommandSuccessTimes,
			String authenticationRequestTimes, String authenticationSuccessTimes,
			String intrammeHandoverRequestTimesPerSubscriber, String intrammeHandoverSuccessRate,
			String intraBasedHandoverSuccessTimes, String intraBasedHandoverRequestTimes, String intrammeTauSuccessRate,
			String periodicTauRequestTimesPerSubscriber, String intrammeCombinedTauSuccessRate,
			String periodTauSuccessTimes, String periodTauRequestTimes) {
		super();
		this.fileName = fileName;
		this.owner = owner;
		this.documentId = documentId;
		this.startTime = startTime;
		this.period = period;
		this.neName = neName;
		this.wholeSystem = wholeSystem;
		this.averageBearerNumber = averageBearerNumber;
		this.maximumBearerNumber = maximumBearerNumber;
		this.averageDedicatedBearerNumber = averageDedicatedBearerNumber;
		this.averagePdnConnectionNumber = averagePdnConnectionNumber;
		this.maximumPdnConnectionNumber = maximumPdnConnectionNumber;
		this.averageAttachedUsers = averageAttachedUsers;
		this.maximumAttachedUsers = maximumAttachedUsers;
		this.ipPacketsReceived = ipPacketsReceived;
		this.downlinkMessageKbytesSentInterface = downlinkMessageKbytesSentInterface;
		this.saeBearerSetupRequestTimes = saeBearerSetupRequestTimes;
		this.saeBearerSetupSuccessTimes = saeBearerSetupSuccessTimes;
		this.uplinkMessageKbytesReceivedInterface = uplinkMessageKbytesReceivedInterface;
		this.realTimePdnConnectionNumber = realTimePdnConnectionNumber;
		this.realTimeAttachedUsersAtEcmconnectedStatus = realTimeAttachedUsersAtEcmconnectedStatus;
		this.realTimeAttachedUsersAtEcmidleStatus = realTimeAttachedUsersAtEcmidleStatus;
		this.realTimeAttachedUsers = realTimeAttachedUsers;
		this.maximumAttachedUsersAtEcmidleStatus = maximumAttachedUsersAtEcmidleStatus;
		this.maximumAttachedUsersAtEcmconnectedStatus = maximumAttachedUsersAtEcmconnectedStatus;
		this.serviceRequestSuccessTimes = serviceRequestSuccessTimes;
		this.serviceRequestTimes = serviceRequestTimes;
		this.pagingRequestTimes = pagingRequestTimes;
		this.pagingSuccessTimes = pagingSuccessTimes;
		this.packetPagingRequestTimesPerSubscriber = packetPagingRequestTimesPerSubscriber;
		this.packetPagingSuccessRate = packetPagingSuccessRate;
		this.authenticationRequestTimesPerSubscriber = authenticationRequestTimesPerSubscriber;
		this.securityModeCommandRequestTimes = securityModeCommandRequestTimes;
		this.securityModeCommandSuccessRate = securityModeCommandSuccessRate;
		this.securityModeCommandSuccessTimes = securityModeCommandSuccessTimes;
		this.authenticationRequestTimes = authenticationRequestTimes;
		this.authenticationSuccessTimes = authenticationSuccessTimes;
		this.intrammeHandoverRequestTimesPerSubscriber = intrammeHandoverRequestTimesPerSubscriber;
		this.intrammeHandoverSuccessRate = intrammeHandoverSuccessRate;
		this.intraBasedHandoverSuccessTimes = intraBasedHandoverSuccessTimes;
		this.intraBasedHandoverRequestTimes = intraBasedHandoverRequestTimes;
		this.intrammeTauSuccessRate = intrammeTauSuccessRate;
		this.periodicTauRequestTimesPerSubscriber = periodicTauRequestTimesPerSubscriber;
		this.intrammeCombinedTauSuccessRate = intrammeCombinedTauSuccessRate;
		this.periodTauSuccessTimes = periodTauSuccessTimes;
		this.periodTauRequestTimes = periodTauRequestTimes;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LteData() {
		super();
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getNeName() {
		return neName;
	}

	public void setNeName(String neName) {
		this.neName = neName;
	}

	public String getWholeSystem() {
		return wholeSystem;
	}

	public void setWholeSystem(String wholeSystem) {
		this.wholeSystem = wholeSystem;
	}

	public String getAverageBearerNumber() {
		return averageBearerNumber;
	}

	public void setAverageBearerNumber(String averageBearerNumber) {
		this.averageBearerNumber = averageBearerNumber;
	}

	public String getMaximumBearerNumber() {
		return maximumBearerNumber;
	}

	public void setMaximumBearerNumber(String maximumBearerNumber) {
		this.maximumBearerNumber = maximumBearerNumber;
	}

	public String getAverageDedicatedBearerNumber() {
		return averageDedicatedBearerNumber;
	}

	public void setAverageDedicatedBearerNumber(String averageDedicatedBearerNumber) {
		this.averageDedicatedBearerNumber = averageDedicatedBearerNumber;
	}

	public String getAveragePdnConnectionNumber() {
		return averagePdnConnectionNumber;
	}

	public int getId() {
		return id;
	}

	public void setAveragePdnConnectionNumber(String averagePdnConnectionNumber) {
		this.averagePdnConnectionNumber = averagePdnConnectionNumber;
	}

	public String getMaximumPdnConnectionNumber() {
		return maximumPdnConnectionNumber;
	}

	public void setMaximumPdnConnectionNumber(String maximumPdnConnectionNumber) {
		this.maximumPdnConnectionNumber = maximumPdnConnectionNumber;
	}

	public String getAverageAttachedUsers() {
		return averageAttachedUsers;
	}

	public void setAverageAttachedUsers(String averageAttachedUsers) {
		this.averageAttachedUsers = averageAttachedUsers;
	}

	public String getMaximumAttachedUsers() {
		return maximumAttachedUsers;
	}

	public void setMaximumAttachedUsers(String maximumAttachedUsers) {
		this.maximumAttachedUsers = maximumAttachedUsers;
	}

	public String getIpPacketsReceived() {
		return ipPacketsReceived;
	}

	public void setIpPacketsReceived(String ipPacketsReceived) {
		this.ipPacketsReceived = ipPacketsReceived;
	}

	public String getDownlinkMessageKbytesSentInterface() {
		return downlinkMessageKbytesSentInterface;
	}

	public void setDownlinkMessageKbytesSentInterface(String downlinkMessageKbytesSentInterface) {
		this.downlinkMessageKbytesSentInterface = downlinkMessageKbytesSentInterface;
	}

	public String getSaeBearerSetupRequestTimes() {
		return saeBearerSetupRequestTimes;
	}

	public void setSaeBearerSetupRequestTimes(String saeBearerSetupRequestTimes) {
		this.saeBearerSetupRequestTimes = saeBearerSetupRequestTimes;
	}

	public String getSaeBearerSetupSuccessTimes() {
		return saeBearerSetupSuccessTimes;
	}

	public void setSaeBearerSetupSuccessTimes(String saeBearerSetupSuccessTimes) {
		this.saeBearerSetupSuccessTimes = saeBearerSetupSuccessTimes;
	}

	public String getUplinkMessageKbytesReceivedInterface() {
		return uplinkMessageKbytesReceivedInterface;
	}

	public void setUplinkMessageKbytesReceivedInterface(String uplinkMessageKbytesReceivedInterface) {
		this.uplinkMessageKbytesReceivedInterface = uplinkMessageKbytesReceivedInterface;
	}

	public String getRealTimePdnConnectionNumber() {
		return realTimePdnConnectionNumber;
	}

	public void setRealTimePdnConnectionNumber(String realTimePdnConnectionNumber) {
		this.realTimePdnConnectionNumber = realTimePdnConnectionNumber;
	}

	public String getRealTimeAttachedUsersAtEcmconnectedStatus() {
		return realTimeAttachedUsersAtEcmconnectedStatus;
	}

	public void setRealTimeAttachedUsersAtEcmconnectedStatus(String realTimeAttachedUsersAtEcmconnectedStatus) {
		this.realTimeAttachedUsersAtEcmconnectedStatus = realTimeAttachedUsersAtEcmconnectedStatus;
	}

	public String getRealTimeAttachedUsersAtEcmidleStatus() {
		return realTimeAttachedUsersAtEcmidleStatus;
	}

	public void setRealTimeAttachedUsersAtEcmidleStatus(String realTimeAttachedUsersAtEcmidleStatus) {
		this.realTimeAttachedUsersAtEcmidleStatus = realTimeAttachedUsersAtEcmidleStatus;
	}

	public String getRealTimeAttachedUsers() {
		return realTimeAttachedUsers;
	}

	public void setRealTimeAttachedUsers(String realTimeAttachedUsers) {
		this.realTimeAttachedUsers = realTimeAttachedUsers;
	}

	public String getMaximumAttachedUsersAtEcmidleStatus() {
		return maximumAttachedUsersAtEcmidleStatus;
	}

	public void setMaximumAttachedUsersAtEcmidleStatus(String maximumAttachedUsersAtEcmidleStatus) {
		this.maximumAttachedUsersAtEcmidleStatus = maximumAttachedUsersAtEcmidleStatus;
	}

	public String getMaximumAttachedUsersAtEcmconnectedStatus() {
		return maximumAttachedUsersAtEcmconnectedStatus;
	}

	public void setMaximumAttachedUsersAtEcmconnectedStatus(String maximumAttachedUsersAtEcmconnectedStatus) {
		this.maximumAttachedUsersAtEcmconnectedStatus = maximumAttachedUsersAtEcmconnectedStatus;
	}

	public String getServiceRequestSuccessTimes() {
		return serviceRequestSuccessTimes;
	}

	public void setServiceRequestSuccessTimes(String serviceRequestSuccessTimes) {
		this.serviceRequestSuccessTimes = serviceRequestSuccessTimes;
	}

	public String getServiceRequestTimes() {
		return serviceRequestTimes;
	}

	public void setServiceRequestTimes(String serviceRequestTimes) {
		this.serviceRequestTimes = serviceRequestTimes;
	}

	public String getPagingRequestTimes() {
		return pagingRequestTimes;
	}

	public void setPagingRequestTimes(String pagingRequestTimes) {
		this.pagingRequestTimes = pagingRequestTimes;
	}

	public String getPagingSuccessTimes() {
		return pagingSuccessTimes;
	}

	public void setPagingSuccessTimes(String pagingSuccessTimes) {
		this.pagingSuccessTimes = pagingSuccessTimes;
	}

	public String getPacketPagingRequestTimesPerSubscriber() {
		return packetPagingRequestTimesPerSubscriber;
	}

	public void setPacketPagingRequestTimesPerSubscriber(String packetPagingRequestTimesPerSubscriber) {
		this.packetPagingRequestTimesPerSubscriber = packetPagingRequestTimesPerSubscriber;
	}

	public String getPacketPagingSuccessRate() {
		return packetPagingSuccessRate;
	}

	public void setPacketPagingSuccessRate(String packetPagingSuccessRate) {
		this.packetPagingSuccessRate = packetPagingSuccessRate;
	}

	public String getAuthenticationRequestTimesPerSubscriber() {
		return authenticationRequestTimesPerSubscriber;
	}

	public void setAuthenticationRequestTimesPerSubscriber(String authenticationRequestTimesPerSubscriber) {
		this.authenticationRequestTimesPerSubscriber = authenticationRequestTimesPerSubscriber;
	}

	public String getSecurityModeCommandRequestTimes() {
		return securityModeCommandRequestTimes;
	}

	public void setSecurityModeCommandRequestTimes(String securityModeCommandRequestTimes) {
		this.securityModeCommandRequestTimes = securityModeCommandRequestTimes;
	}

	public String getSecurityModeCommandSuccessRate() {
		return securityModeCommandSuccessRate;
	}

	public void setSecurityModeCommandSuccessRate(String securityModeCommandSuccessRate) {
		this.securityModeCommandSuccessRate = securityModeCommandSuccessRate;
	}

	public String getSecurityModeCommandSuccessTimes() {
		return securityModeCommandSuccessTimes;
	}

	public void setSecurityModeCommandSuccessTimes(String securityModeCommandSuccessTimes) {
		this.securityModeCommandSuccessTimes = securityModeCommandSuccessTimes;
	}

	public String getAuthenticationRequestTimes() {
		return authenticationRequestTimes;
	}

	public void setAuthenticationRequestTimes(String authenticationRequestTimes) {
		this.authenticationRequestTimes = authenticationRequestTimes;
	}

	public String getAuthenticationSuccessTimes() {
		return authenticationSuccessTimes;
	}

	public void setAuthenticationSuccessTimes(String authenticationSuccessTimes) {
		this.authenticationSuccessTimes = authenticationSuccessTimes;
	}

	public String getIntrammeHandoverRequestTimesPerSubscriber() {
		return intrammeHandoverRequestTimesPerSubscriber;
	}

	public void setIntrammeHandoverRequestTimesPerSubscriber(String intrammeHandoverRequestTimesPerSubscriber) {
		this.intrammeHandoverRequestTimesPerSubscriber = intrammeHandoverRequestTimesPerSubscriber;
	}

	public String getIntrammeHandoverSuccessRate() {
		return intrammeHandoverSuccessRate;
	}

	public void setIntrammeHandoverSuccessRate(String intrammeHandoverSuccessRate) {
		this.intrammeHandoverSuccessRate = intrammeHandoverSuccessRate;
	}

	public String getIntraBasedHandoverSuccessTimes() {
		return intraBasedHandoverSuccessTimes;
	}

	public void setIntraBasedHandoverSuccessTimes(String intraBasedHandoverSuccessTimes) {
		this.intraBasedHandoverSuccessTimes = intraBasedHandoverSuccessTimes;
	}

	public String getIntraBasedHandoverRequestTimes() {
		return intraBasedHandoverRequestTimes;
	}

	public void setIntraBasedHandoverRequestTimes(String intraBasedHandoverRequestTimes) {
		this.intraBasedHandoverRequestTimes = intraBasedHandoverRequestTimes;
	}

	public String getIntrammeTauSuccessRate() {
		return intrammeTauSuccessRate;
	}

	public void setIntrammeTauSuccessRate(String intrammeTauSuccessRate) {
		this.intrammeTauSuccessRate = intrammeTauSuccessRate;
	}

	public String getPeriodicTauRequestTimesPerSubscriber() {
		return periodicTauRequestTimesPerSubscriber;
	}

	public void setPeriodicTauRequestTimesPerSubscriber(String periodicTauRequestTimesPerSubscriber) {
		this.periodicTauRequestTimesPerSubscriber = periodicTauRequestTimesPerSubscriber;
	}

	public String getIntrammeCombinedTauSuccessRate() {
		return intrammeCombinedTauSuccessRate;
	}

	public void setIntrammeCombinedTauSuccessRate(String intrammeCombinedTauSuccessRate) {
		this.intrammeCombinedTauSuccessRate = intrammeCombinedTauSuccessRate;
	}

	public String getPeriodTauSuccessTimes() {
		return periodTauSuccessTimes;
	}

	public void setPeriodTauSuccessTimes(String periodTauSuccessTimes) {
		this.periodTauSuccessTimes = periodTauSuccessTimes;
	}

	public String getPeriodTauRequestTimes() {
		return periodTauRequestTimes;
	}

	public void setPeriodTauRequestTimes(String periodTauRequestTimes) {
		this.periodTauRequestTimes = periodTauRequestTimes;
	}
	
	
	
}
