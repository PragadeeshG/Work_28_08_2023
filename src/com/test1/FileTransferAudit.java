package com.test1;

public class FileTransferAudit {
	private int fileTransferId;
	private String runDate;
	private String acknowledgementFile;
	private String status;
	private String remarks;
	private String createdDate;
	private String modifiedDate;

	public FileTransferAudit() {

	}

	public FileTransferAudit(int fileTransferId, String runDate, String acknowledgementFile, String status,
			String remarks, String createdDate, String modifiedDate) {
		super();
		this.fileTransferId = fileTransferId;
		this.runDate = runDate;
		this.acknowledgementFile = acknowledgementFile;
		this.status = status;
		this.remarks = remarks;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public int getFileTransferId() {
		return fileTransferId;
	}

	public void setFileTransferId(int fileTransferId) {
		this.fileTransferId = fileTransferId;
	}

	public String getRunDate() {
		return runDate;
	}

	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}

	public String getAcknowledgementFile() {
		return acknowledgementFile;
	}

	public void setAcknowledgementFile(String acknowledgementFile) {
		this.acknowledgementFile = acknowledgementFile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
