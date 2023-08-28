package com.test1;

public class FileTransfer {
	private int fileTransferId;
	private String dsName;
	private String consumerName;
	private String transferType;
	private String transferTime;
	private String sourcePath;
	private String targetPath;
	private String status;

	public FileTransfer() {

	}

	public FileTransfer(int fileTransferId, String dsName, String consumerName, String transferType,
			String transferTime, String sourcePath, String targetPath, String status) {
		super();
		this.fileTransferId = fileTransferId;
		this.dsName = dsName;
		this.consumerName = consumerName;
		this.transferType = transferType;
		this.transferTime = transferTime;
		this.sourcePath = sourcePath;
		this.targetPath = targetPath;
		this.status = status;
	}

	public int getFileTransferId() {
		return fileTransferId;
	}

	public void setFileTransferId(int fileTransferId) {
		this.fileTransferId = fileTransferId;
	}

	public String getDsName() {
		return dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public String getTargetPath() {
		return targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
