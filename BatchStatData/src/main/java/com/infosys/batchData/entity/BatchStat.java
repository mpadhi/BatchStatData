package com.infosys.batchData.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "BATCH_STATS")
public class BatchStat {

	@Id
    @Column(name = "BATCH_ID")
	private String batchId;
	@Column(name = "TOTAL")
	private String total;
	@Column(name = "TO_BE_PROCESSED")
	private String toBeProcessed;
	@Column(name = "SUCCESS")
	private String success;
	@Column(name = "FAILED")
	private String failed;
	@Column(name = "STARTTIME")
	private String startTime;
	@Column(name = "ENDTIME")
	private String endTime;
	
	

	public BatchStat() {
		// TODO Auto-generated constructor stub
	}
	public BatchStat(String batchId, String total, String toBeProcessed, String success, String failed,
			String startTime, String endTime) {
		super();
		this.batchId = batchId;
		this.total = total;
		this.toBeProcessed = toBeProcessed;
		this.success = success;
		this.failed = failed;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getToBeProcessed() {
		return toBeProcessed;
	}
	public void setToBeProcessed(String toBeProcessed) {
		this.toBeProcessed = toBeProcessed;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getFailed() {
		return failed;
	}
	public void setFailed(String failed) {
		this.failed = failed;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}
