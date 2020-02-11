/**
 * 
 */
package com.infosys.batchData.model;

/**
 * @author Manisha
 *
 */
public class Docs {
	
	private int total;
	private int tbp;
	private int success;
	private int failed;
	private String start;
	private String end;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTbp() {
		return tbp;
	}
	public void setTbp(int tbp) {
		this.tbp = tbp;
	}
	public int getSuccess() {
		return success;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public int getFailed() {
		return failed;
	}
	public void setFailed(int failed) {
		this.failed = failed;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	

}
