/**
 * 
 */
package com.infosys.batchData.model;

import org.springframework.stereotype.Component;

/**
 * @author Manisha
 *
 */

public class ResponseDTO {
	
	private String label;
	private Docs docs;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Docs getDocs() {
		return docs;
	}
	public void setDocs(Docs docs) {
		this.docs = docs;
	}
	
	
	
	

}
